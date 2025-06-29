package genericsExamples;


interface DemoClassOfGenericInterface<T>{
	
}


class AnythingGeneric<T> implements DemoClassOfGenericInterface<String> {
	
	private T ref;
	
	public AnythingGeneric(T ref) {
		this.ref=ref;
	}
	
	public void disp() {
		System.out.println("The type of T is"+ref.getClass().getName());
	}
	
	public T getRef() {
		return ref;
	}
}

public class LaunchGenerics2 {

	public static void main(String[] args) {
		
		AnythingGeneric<Integer> gen = new AnythingGeneric<>(20);
		gen.disp();
		System.out.println(gen.getRef());
		
		AnythingGeneric<String> gen2 = new AnythingGeneric<>("String type generic");
		gen2.disp();
		System.out.println(gen2.getRef());

	}

}
