package Class1;

import java.util.HashSet;
import java.util.LinkedHashSet;

public class LaunchHashSet {

	public static void main(String[] args) {
		
//		HashSet hs = new HashSet();
//		hs.add(85);
//		hs.add(49);
//		hs.add(93);
//		hs.add(56);
//		hs.add(98);
//		hs.add(24);
//		hs.add(46);
//		System.out.println(hs);
		
		LinkedHashSet lhs = new LinkedHashSet();
		// Order of insertion will maintain
		lhs.add(85);
		lhs.add(49);
		lhs.add(93);
		lhs.add(56);
		lhs.add(98);
		lhs.add(24);
		lhs.add(46);
		System.out.println(lhs);
	}

}
