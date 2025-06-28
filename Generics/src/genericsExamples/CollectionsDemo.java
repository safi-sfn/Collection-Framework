package genericsExamples;

import java.util.ArrayList;
import java.util.List;

public class CollectionsDemo {

	public static void main(String[] args) {
		
		List<String> stringList = new ArrayList<>();
		stringList.add("One");
		stringList.add("Two");
		stringList.add("Three");
		
		for(String s:stringList) {
			System.out.println(s);
		}

	}

}
