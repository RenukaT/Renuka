package Inheritance;

public class QAEngineer extends Employee {
	public String designation;

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		QAEngineer renu=new QAEngineer();
		renu.empId=100;
		renu.eName="renu";
		renu.salary=20000;
		renu.compName="ITC";
		renu.designation="IT Tester";
		
		renu.display();
		
	}

	public void display()
	{
		super.display();
		System.out.println("designation is "+ designation);
	}
}
