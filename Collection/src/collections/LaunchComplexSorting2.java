package collections;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

class TestCricket implements Comparable<TestCricket> {
	
	String name;
	int score;
	
	public TestCricket(String name, int score) {
		this.name = name;
		this.score = score;
	}

	public String getName() {
		return name;
	}

	public int getScore() {
		return score;
	}

	@Override
	public String toString() {
		return "TestCricketer [name=" + name + ", score=" + score + "]";
	}

	
	// Comparable's method
	@Override
	public int compareTo(TestCricket o) {
				
		if(this.score > o.score)
			return 1;
		else
			return -1;
	}
	
	
}

public class LaunchComplexSorting2 {

	public static void main(String[] args) {
		
//		TestCricket tcr = new TestCricket();
		ArrayList<TestCricket> arTc = new ArrayList<>();
		arTc.add(new TestCricket("Rohit",9000));
		arTc.add(new TestCricket("Virat",10000));
		arTc.add(new TestCricket("Sachin",15000));
		arTc.add(new TestCricket("Dhoni",7000));
		
//		System.out.println(arTc);
	// Sort by name with the help of lambda
//		Comparator<TestCricket> comp = (p1,p2) -> p1.getName().compareToIgnoreCase(p2.getName());
//		Collections.sort(arTc,comp);
//		System.out.println(arTc);
	
	// sort by score with the help of lambda
//		Comparator<TestCricket> comp2 = (p1,p2) -> {
//			if( p1.getScore()>p2.getScore()) 
//				return 1;
//			else
//				return -1;
//					};				
//		Collections.sort(arTc,comp2);
		
	
	// After Comparable 
		System.out.println(arTc);
		Collections.sort(arTc);
		System.out.println(arTc);
		

	}

}
