package annotation;

import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;
import java.lang.annotation.Annotation;

@Retention(RetentionPolicy.RUNTIME)
@Target({ElementType.FIELD, ElementType.TYPE, ElementType.METHOD, ElementType.CONSTRUCTOR})
@interface CricketPlayer {
	
	String country()default "India";
	int age()default 34;
} // @ => Specifies compiler that annotation type is being creating

//@CricketPlayer(country="England", age= 34) 
@CricketPlayer
class ViratKohli {
	
	@CricketPlayer  
	private int innings;

	@CricketPlayer  
	public int getInnings() {
		return innings;
	}
	

	public void setInnings(int innings) {
		this.innings = innings;
	}
}

public class LaunchAnnotation2 {

	public static void main(String[] args) {
		
		ViratKohli vk = new ViratKohli();
		Class<? extends ViratKohli> c = vk.getClass();
		Annotation an = c.getAnnotation(CricketPlayer.class);
		CricketPlayer cp = (CricketPlayer)an;
		int age = cp.age();
		String country = cp.country();
		System.out.println("Country: "+country+", Age: "+age);
		
		
		

	}

}
