package classesandObjects;


public class Employee {
	public int empId;
	public String empNmae;
	public double salary;
	public static String  companyName;
	
	public static void main(String a[]) {
		// TODO Auto-generated method stub
		
		Employee.companyName="ITc";
		
		Employee renu=new Employee();
		renu.empId=100;
		renu.empNmae="renu";
		renu.salary=10000;
		//renu.companyName="ITC";
		
		System.out.println(renu.empId);
		System.out.println(renu.empNmae);
		System.out.println(renu.salary);
		
		System.out.println(Employee.companyName);
		
		
		Employee raju=new Employee();
		
		raju.empId=200;
		raju.empNmae="raju";
		raju.salary=200000;
		//raju.companyName="ITC";
		
		System.out.println(raju.empId);
		System.out.println(raju.empNmae);
		System.out.println(raju.salary);
		
		System.out.println(Employee.companyName);
		

	}
}
