package map;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map.Entry;
import java.util.Scanner;
import java.util.Set;

class Passport {
	
	private String name;
	private String city;
	private String country;
	
	public Passport(String name, String city, String country) {
		super();
		this.name = name;
		this.city = city;
		this.country = country;
	}

	@Override
	public String toString() {
		return "Passport [name=" + name + ", city=" + city + ", country=" + country + "]";
	}
	
	
	
}

public class LaunchMap3 {

	public static void main(String[] args) {
		System.out.println("Passport Information App");
		
		Passport pass1 = new Passport("Mr.Wayne","Gauthom","NewYork");
		Passport pass2 = new Passport("Sharma","Delhi","India");
		Passport pass3 = new Passport("Akhtar","Munbai","India");
		
		Integer id1 = Integer.valueOf(101);
		Integer id2 = Integer.valueOf(102);
		Integer id3 = Integer.valueOf(103);
		
		HashMap<Integer,Passport> hm = new HashMap<>();
		hm.put(id1, pass1);
		hm.put(id2, pass2);
		hm.put(id3, pass3);
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter your Passport Number to get Info.");
		Integer id = sc.nextInt();
		
		 Set<Entry<Integer, Passport>> entry = hm.entrySet();
		 Iterator<Entry<Integer, Passport>> itr = entry.iterator();
		 Boolean flag = false;
		 
		 while(itr.hasNext()) {
			 Entry<Integer, Passport> keyValue = itr.next();
			 Integer key = keyValue.getKey();
			 if(key.equals(id)) {
				 System.out.println("Please find your info below");
				 System.out.println(keyValue.getValue());
				 flag = true;
				 break; // Exit loop when match is found
			 }
//			 System.out.println("loop is repeating");
		 }
		 if(!flag) {
			 System.out.println("Unable to find record based on your id ! try again");
		 }

	}

}













