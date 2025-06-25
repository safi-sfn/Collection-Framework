package Class1;

import java.util.LinkedList;

public class LaunchLinkedList {

	public static void main(String[] args) {
		
		LinkedList lList = new LinkedList();
		lList.add(24);
		lList.add(20);
		lList.add(56);
		lList.add(93);
		lList.add(48.90);
		System.out.println(lList);
		
		lList.addFirst(50);
		lList.add(null);
		System.out.println(lList);
		
		lList.offer("java");
		lList.offerFirst("SpringBoot");
		System.out.println(lList);
		
		System.out.println(lList.peekFirst()+" , "+lList.peekLast());
		System.out.println(lList);
		System.out.println(lList.pollFirst()+" , "+lList.pollLast());
		System.out.println(lList);
		

	}

}
