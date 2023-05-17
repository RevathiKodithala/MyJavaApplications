package ComparableandComparator;

import java.util.ArrayList;
import java.util.Collections;

public class ComparableEx implements Comparable<ComparableEx>{
	
	private int id;
	private String name;
	private int age;
	
	public ComparableEx(int id, String name, int age) {
		this.id = id;
		this.name = name;
		this.age = age;
	}
	
	

	public int compareTo(ComparableEx st) {
		if(age==st.age) {
		return 0;}
		else if(age>st.age){
			return 1;
		}else{
			return -1;
		}
		
	}
		public class testsort {
			public static void main(String[]args) {
				ArrayList<ComparableEx> al=new ArrayList<ComparableEx> ();
				al.add(new ComparableEx(1,"Revathi",20));
				al.add(new ComparableEx(2,"saranya",25));
				al.add(new ComparableEx(3,"padhu",18));
				
				Collections.sort(al);
				for(ComparableEx st:al) {
					System.out.println(st.id+" "+st.name+" "+st.age);  
				}
				
			}
		}
		
	

}
