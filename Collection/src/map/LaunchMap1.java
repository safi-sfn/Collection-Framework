package map;

import java.util.HashMap;
import java.util.Hashtable;
import java.util.LinkedHashMap;
import java.util.TreeMap;

class Courses {
	
	int cId;
	String cName;

	public Courses(int cId, String cName) {
		super();
		this.cId = cId;
		this.cName = cName;
	}



	@Override
	public String toString() {
		return "Courses [cId=" + cId + ", cName=" + cName + "]";
	}
	
}

public class LaunchMap1 {

	public static void main(String[] args) {
		
//		HashMap hm = new HashMap();
//		hm.put(1, "Java");
//		hm.put(2, "SpringBoot");
//		hm.put(3,"web development");
//		System.out.println(hm);
//		
//		Courses c = new Courses(1,"Java");
//		HashMap hm2 = new HashMap();
//		hm2.put(c, "Hydar Abbas");
//		System.out.println(hm2);
		
		System.out.println("***********************");

//		HashMap<Integer,String> hm3 = new HashMap<>();		
//		hm3.put(1, "Java");         // First entry with key=1
//		hm3.put(2, "Microservice"); // New key
//		hm3.put(1,"SpringBoot");    // Same key=1
//		hm3.put(4,"AI");           // New key
//		hm3.put(5, null);         // value can be null
//		hm3.put(null,"MySQL");     // key can be  null
////		hm3.put(null, null);  
//		System.out.println(hm3);    
		// Output: {1=SpringBoot, 2=Microservice, 4=AI}
		//When you put() a value with an existing key, it replaces the old value. thats why "SpringBoot" replace "Java"
		
		
//		LinkedHashMap<Integer,String> hm3 = new LinkedHashMap<>();
//		
//		hm3.put(1, "Java");         // First entry with key=1
//		hm3.put(2, "Microservice"); // New key
//		hm3.put(1,"SpringBoot");    // Same key=1
//		hm3.put(4,"AI");           // New key
//		hm3.put(5, null);         // value can be null
//		hm3.put(null,"MySQL");     // key can be  null
////		hm3.put(null, null);  
//		System.out.println(hm3);
		
		
//		TreeMap tm = new TreeMap();
//		tm.put(3, "three");
//		tm.put(1,"one");
//		tm.put(4,"Four");
//		tm.put(2, "two");
////		tm.put(null, "five");   // key cannot be null in TreeMap
//		tm.put(5, null);   // value can be null
//		System.out.println(tm);
		
		
		Hashtable tm = new Hashtable();
		tm.put(3, "three");
		tm.put(1,"one");
		tm.put(4,"Four");
		tm.put(2, "two");
//		tm.put(null, "five");   // key cannot be null in Hashtable
//		tm.put(5, null);   // value cannot be null in Hashtable
		System.out.println(tm);
		
		
	}

}
