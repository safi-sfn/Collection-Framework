package collections;

import java.util.ArrayList;
import java.util.Collections;

public class LaunchCollections {

	public static void main(String[] args) {
		
		ArrayList<Integer> al = new ArrayList<>();
		al.add(78);
		al.add(34);
		al.add(67);
		al.add(23);
		al.add(15);
		al.add(49);
		al.add(58);
		// Arraylist maintain the Data in order of insertion 
		//(i.e in which order we have inserted the data you will see the result in same order)
		System.out.println(al);
		Collections.sort(al);
		System.out.println(al);
		
		System.out.println("**********************");
		
		ArrayList<String> al2 = new ArrayList<>();
		al2.add("one"); // lowercase 'o'
		al2.add("Two");
		al2.add("Three");
		al2.add("Four");
		System.out.println(al2); // Before Sorting
		Collections.sort(al2, String.CASE_INSENSITIVE_ORDER);
		System.out.println(al2); // After Sorting
		
		System.out.println("**********************");
		
		ArrayList<Integer> al3 = new ArrayList<>();
		al3.add(78);
		al3.add(34);
		al3.add(67);
		al3.add(34);
		al3.add(15);
		al3.add(34);
		al3.add(58);
		
		System.out.println(al3); // before frequency
		Collections.shuffle(al3); // Arrange the data in random order
		System.out.println(al3);
		int res = Collections.frequency(al3, 34);
		System.out.println(res);
		
	}

}
