package map;

class Passport {
	
	private String name;
	private String city;
	private String country;
	
	public Passport(String name, String city, String country) {
		super();
		this.name = name;
		this.city = city;
		this.country = country;
	}

	@Override
	public String toString() {
		return "Passport [name=" + name + ", city=" + city + ", country=" + country + "]";
	}
	
	
	
}

public class LaunchMap3 {

	public static void main(String[] args) {
		System.out.println("Passport Information App");
		
		Passport pass1 = new Passport("Mr.Wayne","Gauthom","NewYork");
		Passport pass2 = new Passport("Sharma","Delhi","India");
		Passport pass3 = new Passport("Akhtar","Munbai","India");

	}

}













