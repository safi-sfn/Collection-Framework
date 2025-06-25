package Class1;

import java.util.ArrayDeque;

public class LaunchArrayDeque {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		ArrayDeque ad = new ArrayDeque();
		ad.add(28);
		ad.add(62);
		ad.add(84.7);
//		ad.add(null);
		System.out.println(ad);
		ad.addFirst(10);
		ad.addLast(40);
		System.out.println(ad);
	}

}
