package genericsExamples;

import java.util.ArrayList;

class Employee {
	
	Integer eId;
	String eName;
	Double eSalary;
	
	public Employee(Integer eId, String eName, Double eSalary) {
		super();
		this.eId = eId;
		this.eName = eName;
		this.eSalary = eSalary;
	}

	@Override
	public String toString() {
		return "Employee [eId=" + eId + ", eName=" + eName + ", eSalary=" + eSalary + "]";
	}
	
}

public class LaunchGeneric1 {

	public static void main(String[] args) {
		
		//type safety
				int []ar=new int[3];
				
				ar[0]=14;
				ar[1]=34;
				ar[2]=24;
				
				int data=ar[1];
				
				//Type safety
				String []str=new String[3];
				
				str[0]="Telusko";
				str[1]="Java";
				str[2]="Alien";
				
				String sData=str[2];
				sData.toUpperCase();
				
				
				//no type safety
//				ArrayList al = new ArrayList();
//				al.add("Telusko");
//				al.add("Java");
//				al.add("Alien");
//			    al.add(44);
//				
//				String data1=(String) al.get(0);
//				data1=data1.toUpperCase();
//				System.out.println(data1);
//				
//				String data2=(String) al.get(1);
//				data2=data2.toUpperCase();
//				System.out.println(data2);
//				
//				String data3=(String) al.get(2);
//				data3=data3.toUpperCase();
//				System.out.println(data3);
//				//System.out.println(al.size());
//				
//				String data4=(String) al.get(3);
//				data4=data4.toUpperCase();
//				System.out.println(data3);
				
				//type safety
				ArrayList<String> al = new ArrayList<>();
				al.add("Telusko");
				al.add("Java");
				al.add("Alien");
			 //   al.add(44);
				
				String data1=al.get(0);
				data1=data1.toUpperCase();
				System.out.println(data1);
				
				String data2= al.get(1);
				data2=data2.toUpperCase();
				System.out.println(data2);
				
				String data3= al.get(2);
				data3=data3.toUpperCase();
				System.out.println(data3);
				//System.out.println(al.size());
		
		
					
				System.out.println("***************************");	
				ArrayList<Employee> emp = new ArrayList<>();
				
				emp.add(new Employee(1,"Saurav",35000.0));
				emp.add(new Employee(2,"Jofra",55000.0));
				emp.add(new Employee(3,"David",45000.0));
					
				for(Employee em:emp) {
					System.out.println(em);
				}
	
//	       Employee<Integer> t=new Employee<>();
			ArrayList<Integer> i=new ArrayList<>();
			
			ArrayList<Integer> i2=new ArrayList<Integer>();
			
			//ArrayList<int> i3=new ArrayList<Integer>();// primitive is not allowed and it must be Reference type
		

	}

}
