package genericsExamples;

import java.awt.List;
import java.util.ArrayList;

class Human {
	
	int a;
   public void disp() {
	   System.out.println("Human are best creature");
   }
}

class Student extends Human {
	
}

class Employees {
	
}


public class LaunchGenerics3 {

	public static void main(String[] args) {
	
//		Object obj = new Object();
//		String st = new String();
//		obj=st;
//		st=obj; //error or to downcast
		
//		Human h = new Human();
//		Student stu = new Student();
//		h=stu;
//		stu=p; // C.E  or downcasting
		
		
		
//		ArrayList<Human> humanList1 = new ArrayList<>();
//		ArrayList<Student> stuList1 = new ArrayList<>();
//		humanList1 = stuList1; // C.E 
		
		// Unknown  --> (?) --> wild card
//		ArrayList<?> humanList1 = new ArrayList<>();     
//		ArrayList<Student> stuList1 = new ArrayList<>();
//		humanList1 = stuList1;
		
		// upperbound  
		// collection work with any type Either of Human or child of Human or(subclass of Human)
//		ArrayList<? extends Human> humanList1 = new ArrayList<>();
//		ArrayList<Student> stuList1 = new ArrayList<>();
//		ArrayList<Employees> empList1 = new ArrayList<>();
//		humanList1 = stuList1;
//		humanList1 = empList1;  // C.E
		
		// lowerbound
		// collection work with  Human or parent of Human  (superclass of Human)
//		ArrayList<? super Human> humanList1 = new ArrayList<>();
//		ArrayList<Student> stuList1 = new ArrayList<>();
//		ArrayList<Employees> empList1 = new ArrayList<>();
//		ArrayList<Object> objList1 = new ArrayList<>();
//		humanList1=stuList1; // C.E
//		humanList1 = empList1; // C.E
//		humanList1 = objList1;
		
	}

}
