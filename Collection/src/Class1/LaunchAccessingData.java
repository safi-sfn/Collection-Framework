package Class1;

import java.util.ArrayList;
import java.util.Iterator;

public class LaunchAccessingData {

	public static void main(String[] args) {
		
		ArrayList al = new ArrayList();
	   
//		al.add(100);
//		al.add(200);
//		al.add(300);
//		al.add(400);
		
		al.add("Apple");
		al.add("Mango");
		al.add("Banana");
		
//		Integer alData = (Integer) al.get(2);   // DownCasting(unboxing) Object->Integer
//		System.out.println(alData);
		
//		for(int i=0; i<al.size(); i++) {
////			Integer data = (Integer) al.get(i);
//			System.out.println(al.get(i));
//		}
	
//		for(Object o:al) {
//			System.out.println(o);
//		}
		
		System.out.println(al);
		Iterator itr = al.iterator();
		
		while(itr.hasNext()) {
			
			String elemnt = (String)itr.next();
			
			System.out.println(elemnt);
			
			if(elemnt.equals("Banana")) {
				itr.remove();
			}
		}
		System.out.println(al);

	}

}
