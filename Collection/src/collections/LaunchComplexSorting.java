package collections;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

class Cricketer
{
	int age;
	String name;
	double avg;
	
	public Cricketer(int age, String name, double avg) {
		super();
		this.age = age;
		this.name = name;
		this.avg = avg;
	}

	@Override
	public String toString() {
		return "Cricketer [age=" + age + ", name=" + name + ", avg=" + avg + "]";
	}

	

	public String getName() {
		return name;
	}
		
}

// -- by using these method we achieve a Comparator
// implements
// anonymous inner class
// Lambda expression

// By using implements
class Alpha1 implements Comparator<Cricketer> {

	@Override
	public int compare(Cricketer p1, Cricketer p2) {
		
		if(p1.avg > p2.avg)
			return 1;
		else
			return -1;
	}
	
}

public class LaunchComplexSorting {

	public static void main(String[] args) {
		
		Cricketer c1 = new Cricketer(34,"Virat",93.7);
		Cricketer c2 = new Cricketer(37,"Rohit",85.4);
		Cricketer c3 = new Cricketer(32,"KL Rahul",78.2);
		
		ArrayList<Cricketer> list = new ArrayList<>();
		list.add(c1);
		list.add(c2);
		list.add(c3);
		System.out.println(list); // before sorting
		System.out.println("**************************");
		
	// Option-1
//		Alpha1 alpha = new Alpha1();
//		Collections.sort(list, alpha);
//		System.out.println(list); 
	
	// Option-2 -> anonymous inner class
		Comparator<Cricketer> comp = new Comparator<>() {

			@Override
			public int compare(Cricketer p1, Cricketer p2) {
				if(p1.age > p2.age)
					return 1;
				else
					return -1;
			}
			
		};
//		Collections.sort(list,comp);
//		System.out.println(list); // after sorting
		
		
	// Option-3 -> By Using Lambda
		Comparator<Cricketer> compr = (Cricketer p1, Cricketer p2) -> p1.getName().compareTo(p2.getName());
		
		Collections.sort(list,compr);
		System.out.println(list); // after sorting

	}

}
