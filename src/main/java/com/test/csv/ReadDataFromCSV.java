package com.test.csv;

import java.io.BufferedReader;

import java.io.FileReader;
import java.io.IOException;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;

import org.json.simple.parser.ParseException;
import static java.lang.Integer.parseInt;

public class ReadDataFromCSV {
private static final BufferedReader LineReader = null;
public static void main(String[] args) throws IOException, ParseException,ClassNotFoundException,SQLException{
	int batchSize = 20;
		
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
		Connection con= DriverManager.getConnection(  
				"jdbc:mysql://localhost:3306/mydb","root","root");
		 con.setAutoCommit(false);
		PreparedStatement ps=con.prepareStatement(  
				"insert into empcsv(EmpId,EmpName,EmpAge,EmpSalary) values(?,?,?,?)");
		
		 BufferedReader lineReader = new BufferedReader(new FileReader(".\\CSVfile\\employee.csv"));
         String lineText = null;

         int count = 0;

         lineReader.readLine(); // skip header line
         while((lineText = lineReader.readLine()) != null) {
             String[] data = lineText.split(",");
             String EmpId = data[0];
             String EmpName = data[1];
             String EmpAge = data[2];
             String EmpSalary = data[3];
             
             //System.out.println("Details of the "+i+" employee is ");
     		System.out.println("EmpId: "+EmpId);
     	    System.out.println("EmpName: "+EmpName);
     	    System.out.println("EmpAge: "+EmpAge);
     	    System.out.println("EmpSalary: "+EmpSalary);
             
             ps.setLong(1,parseInt(EmpId));
             ps.setString(2,EmpName);
             ps.setString(3,EmpAge);
             ps.setLong(4,parseInt(EmpSalary));
             
             ps.addBatch();
             
             if (count % batchSize == 0) {
                 ps.executeBatch();
             }
             
             
         }lineReader.close();
             
             // execute the remaining queries
             ps.executeBatch();
  
             con.commit();
             
             con.close();
             
             System.out.println("Data inserted successfuly");
             
         } 
		catch(Exception e) {
			{e.printStackTrace();
		}
             


}}}


