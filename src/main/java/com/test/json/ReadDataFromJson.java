package com.test.json;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.RowId;
import java.sql.SQLException;
import java.sql.SQLIntegrityConstraintViolationException;

import org.json.simple.JSONArray;
import org.json.simple.JSONObject;
import org.json.simple.parser.JSONParser;
import org.json.simple.parser.ParseException;

public class ReadDataFromJson  {
	//private static int  Sno;

	public static void main(String[] args) throws IOException, ParseException,ClassNotFoundException,SQLException{
		
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
		Connection con= DriverManager.getConnection(  
				"jdbc:mysql://localhost:3306/mydb","root","root");
		PreparedStatement ps=con.prepareStatement(  
				"insert into emptab(Name,Age,Salary) values(?,?,?)");  


		              


	JSONParser jsonparser=new JSONParser();
	
	
	FileReader reader=new FileReader (".\\Jsonfile\\Employee.json") ;
	Object obj=jsonparser.parse(reader);
	JSONObject empjsonobj=(JSONObject) obj;
	
	JSONArray array=(JSONArray)empjsonobj.get("Employee");
	
	for(int i=0;i<array.size();i++) {
		JSONObject employee=(JSONObject)array.get(i);
		
		//Long Id=(Long)employee.get("Id");
	    String Name=(String)employee.get("Name");
		Long Age=(Long) employee.get("Age");
	    Long salary=(Long) employee.get("Salary");
		
		
		System.out.println("Details of the "+i+" employee is ");
		//System.out.println("Id: "+Id);
	    System.out.println("Name: "+Name);
	    System.out.println("Age: "+Age);
	    System.out.println("Salary: "+salary);
	    //ps.setInt(1, Sno);
	    //ps.setLong(1, Id);
		ps.setString(1, Name);
		ps.setLong(2, Age);
		ps.setLong(3, salary);
		
		int x=ps.executeUpdate();  
		System.out.println(x+" records affected");  
		
		
		
		
		
	}
	
	/*int i=ps.executeUpdate();  
	System.out.println(i+" records affected");  */
	              
	con.close();  
		}catch (SQLIntegrityConstraintViolationException e) {
			System.out.println("You Have Entered Wrong Id, please Enter Correct Id");
		}
		
		/*catch(Exception e) {
			{e.printStackTrace();
		}*/
	
	

}}
