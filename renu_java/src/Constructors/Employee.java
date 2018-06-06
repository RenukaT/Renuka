package Constructors;

public class Employee {

	public int empId;
	public String empNmae;
	
	public Employee()
	{
		System.out.println("i am in default constructor");
	}
	
	public Employee(int a,String b)
	{
		empNmae=b;
		empId=a;
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Employee renu=new Employee();
		renu.empId=1000;
		renu.empNmae="renu";
		System.out.println(renu.empId);
		System.out.println(renu.empNmae);
		
		Employee satya=new Employee(200,"satya");
		//satya.empId=1000;
		//satya.empNmae="satya";
		System.out.println(satya.empId);
		System.out.println(satya.empNmae);
		
	}

}
