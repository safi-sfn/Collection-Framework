package annotation;

class Animal {
	public void animalHuntsAndEats() {
		System.out.println("Animal is eating...");
	}
}

class Tiger extends Animal {
	
	@Override
	public void animalHuntsAndEats() {
		System.out.println("Tiger is Eating");
	}
}

public class LaunchAnnotation1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Tiger t = new Tiger();
		t.animalHuntsAndEats();
		
		Animal a = new Tiger();
		a.animalHuntsAndEats();
	}

}
 