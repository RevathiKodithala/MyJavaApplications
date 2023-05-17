package Set;

import java.util.HashSet;

public class Hashset1 {
	public static void main(String[]args) {
		HashSet<String> animal=new HashSet<String>();
		
		animal.add("dog");
		animal.add("cat");
		animal.add("pig");
		animal.add("duck");
		animal.add("rat");
		animal.add("pig");
		System.out.println(animal.size());
		
		System.out.println(animal);
		//iterate using foreach
		animal.stream().forEach(s->{System.out.println(s);});
		
		//check if exists
		if(animal.contains("dog")) {
			System.out.println("Contains");
		}else {
			System.out.println("not exists");
		}
		
		
	}

}
