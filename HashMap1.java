package Map;

import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;
import java.util.TreeMap;

public class HashMap1 {
	public static void main(String []args) {
		Map<Integer,String> hs=new LinkedHashMap<Integer,String>();
		hs.put(103,"RK");
		hs.put(101,"RM");
		hs.put(104,"RL");
		hs.put(102,"RF");
		
		System.out.println(hs);
		
		//foreach loop
		for(Map.Entry<Integer, String> s:hs.entrySet()) {
			System.out.println("key:"+s.getKey()+",+Value:"+s.getValue());
			
		}
		
		//check map is empty
		if(hs.isEmpty()) {
			System.out.println("Empty");
		}else {
			System.out.println("Not Empty");
		}
		
		//convert it into Treemap sort by key
		TreeMap<Integer,String> ts=new TreeMap<Integer,String>(hs);
		System.out.println(ts);
		
		
		//sort by values
				
	}

}
