package enum_;

enum Week {
	MON, TUE, WED, THU, FRI, SAT, SUN
}


public class LaunchEnum1 {

	public static void main(String[] args) {
		
		Week week = Week.MON;
		System.out.println(week);
		
		int index = Week.FRI.ordinal();
		System.out.println(index);
		
		Week values[] = Week.values();
		for(Week data:values) {
			System.out.println(data.ordinal()+" -> "+data);
		}

	}

}
