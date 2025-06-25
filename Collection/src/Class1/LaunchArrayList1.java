package Class1;

import java.util.ArrayList;
import java.util.Date;

public class LaunchArrayList1 {

	public static void main(String[] args) {
		
		ArrayList arrList = new ArrayList();
		arrList.add(15);
		arrList.add("pope");
		arrList.add(23.56);
		arrList.add(true);
		arrList.add(new Date());
		arrList.add(null);
		System.out.println(arrList);
		
		System.out.println("*****************************");
		
		ArrayList arrList2 = new ArrayList();
		arrList2.add(80);
		arrList2.add("Jordan");
		arrList2.add(35);
		System.out.println(arrList2);
		
		arrList2.addAll(arrList);
		System.out.println(arrList2);
		
		arrList2.add(3, "joy");
		System.out.println(arrList2);
		

	}

}
