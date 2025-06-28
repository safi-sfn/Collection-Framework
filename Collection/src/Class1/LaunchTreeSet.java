package Class1;

import java.util.TreeSet;

public class LaunchTreeSet {

	public static void main(String[] args) {
	
		TreeSet ts = new TreeSet();
		ts.add(48);
		ts.add(94);
		ts.add(83);
		ts.add(18);
		ts.add(34);
		ts.add(65);
//		ts.add(48); duplication are not allowed
//		ts.add(null);  null is not allowed
		System.out.println(ts);
		
		System.out.println(ts.higher(65)); //83
		System.out.println(ts.ceiling(65)); //65
		System.out.println(ts.ceiling(70)); //83
		
		System.out.println(ts.lower(65)); //48
		System.out.println(ts.floor(65)); //65
		System.out.println(ts.floor(60)); //48
		
		System.out.println(ts.tailSet(50));	
		System.out.println(ts.headSet(50));	
		
		
	}

}
