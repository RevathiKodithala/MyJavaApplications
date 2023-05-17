package List;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;





public class ArrayList1  {
	public static void main(String[]args) {
	//List a=new ArrayList();
	//ArrayList all=new ArrayList();
	//ArrayList<Integer> ah=new ArrayList<Integer>();
	ArrayList<String> als=new ArrayList<String>();
	als.add("Fruits");
	als.add("Animals");
	als.add("Vehicles");
	als.add("Movies");
	als.add("cities");
	als.add("places");
	
	System.out.println(als);
	
	//for loop
	for(int i=0;i<=als.size()-1;i++) {
		System.out.println(als.get(i));
	}
	
	//foreach loop
	als.forEach(p->{System.out.println("Forloop"+p);});
	
	//while loop
	Iterator itr=als.iterator();
	while(itr.hasNext()) {
		System.out.println("whileloop"+itr.next()); 
	}
	
	//Convert list to array
	String[] s= als.toArray(new String[als.size()]);
	
	for(String str:als) {
	System.out.println(str);}
	
	
	//check if element exixts
	if(als.contains("cities")){
		System.out.println("contains");
	}else {
		System.out.println("not exists");
	}
	
	
	
	//array to list conversion
	Integer[] arr=new Integer[5];
	arr[0]=1;
	arr[1]=2;
	arr[2]=3;
	arr[3]=4;
	arr[4]=5;
	for(int i=0;i<=arr.length-1;i++) {
	System.out.println(arr[i]);}
	
	ArrayList<Integer> l=new ArrayList<Integer>(Arrays.asList(arr));
	
	System.out.println(l);
	
	//sorting
	Collections.sort(als);
	System.out.println(als);
	Collections.sort(als, Collections.reverseOrder());
	System.out.println(als);
	
	
}}
