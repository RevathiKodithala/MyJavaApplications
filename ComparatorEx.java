package ComparableandComparator;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

public class ComparatorEx implements Comparator<ComparatorEx> {
	

	 int id;
	 String name;
	int age;
	
	public ComparatorEx(int id, String name, int age) {
		this.id = id;
		this.name = name;
		this.age = age;
	}
 
		public class TestComparator {

			public static void main(String[] args) {
				ArrayList<ComparatorEx> al=new ArrayList<ComparatorEx> ();
				al.add(new ComparatorEx(1,"Revathi",24));
				al.add(new ComparatorEx(2,"Saranya",25));
				al.add(new ComparatorEx(3,"Padhu",28));

				
				System.out.println("Sorting by Name");  
				//Using NameComparator to sort the elements  
				Collections.sort(al,new NameComparator());  
				//Traversing the elements of list  
				for(ComparatorEx st: al){  
				System.out.println(st.id+" "+st.name+" "+st.age);  
				} 
				
				
				System.out.println("sorting by Age");  
				//Using AgeComparator to sort the elements  
				Collections.sort(al,new AgeComparator());  
				//Travering the list again  
				for(ComparatorEx st: al){  
				System.out.println(st.id+" "+st.name+" "+st.age);  
				}  
			}

		}
		//code for Namecomparator
  /*  public class NameComparator implements Comparator<ComparatorEx> {
		@Override
		public int compare(ComparatorEx o1, ComparatorEx o2) {
			
			return o1.name.compareTo(o2.name);
		}}*/

		@Override
		public int compare(ComparatorEx o1, ComparatorEx o2) {
			// TODO Auto-generated method stub
			return 0;
		}
		
		//code for age Comparator
	/*public class AgeComparator implements Comparator<ComparatorEx> {
	   @Override
	public int compare(ComparatorEx o1, ComparatorEx o2) {
		if(o1.age==o2.age) {
			return 0;
		}else if(o1.age>o2.age) {
			return 1;
		}else {
			return -1;
		}}
		*/
	}



