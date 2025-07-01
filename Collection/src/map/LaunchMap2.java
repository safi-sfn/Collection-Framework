package map;

import java.util.Collection;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

interface Alpha {
	
	interface Beta {
		 static void beta() {
			System.out.println("Static method of beta");
		}
	}
}

public class LaunchMap2 {

	public static void main(String[] args) {
		
//		Alpha.Beta.beta();
		
		HashMap<Integer,String> hm = new HashMap<>();
		hm.put(1,"java"); // key-value pair -> Entry in java
		hm.put(2, "SpringBoot");
		hm.put(3, "Hibernate");
		System.out.println(hm);
		String data = hm.get(3);
		System.out.println(data);
		
		System.out.println("************************");
		
		Collection<String> values = hm.values();
		
		Iterator<String> itr = values.iterator();
		while(itr.hasNext()) {
			System.out.println(itr.next());
		}
		
		System.out.println("***********************");
		Set<Integer> set = hm.keySet();
		
		 Iterator<Integer> itr2 = set.iterator();
		 while(itr2.hasNext()) {
			 System.out.println(itr2.next());
		 }
		 
		 System.out.println("***********************");
//		 Set<Entry<Integer, String>> set2 = hm.entrySet();
//		 Iterator<Entry<Integer, String>> itr3 = set2.iterator();
		 
		 Set set2 = hm.entrySet();
		 Iterator itr3 = set2.iterator();
		 
		 while(itr3.hasNext()) {
//			  Entry<Integer, String> pair = itr3.next();
			 	Map.Entry pair= (Entry)itr3.next();
			 	System.out.println("Key : "+pair.getKey()+" , Value : "+pair.getValue());
		 }		 

	}

}
