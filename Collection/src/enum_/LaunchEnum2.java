package enum_;

enum Result {
	PASS, FAIL, NR;
	//BTS
//	public static final Result PASS = new Result();
//	public static final Result FAIL = new Result();
//	public static final Result NR = new Result();
	
	Result(){
		System.out.println("Result Instance/object is created");
	}
	int marks;
	public int getMarks() {
		return marks;
	}
	public void setMarks(int marks) {
		this.marks = marks;
	}
}

public class LaunchEnum2 {

	public static void main(String[] args) {
		
//		Result result = Result.PASS;
		
		Result.PASS.setMarks(56);
		int marks1 = Result.PASS.getMarks();
		System.out.println(marks1);
		
	    int marks2 = Result.FAIL.getMarks();
	    System.out.println(marks2);
		

	}

}
