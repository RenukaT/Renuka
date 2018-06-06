package Inheritance;

public class C extends B{
	public int c;
	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		C obj=new C();
		obj.a=100;
		obj.b=200;
		obj.c=300;
		obj.method1();
		obj.method2();
		obj.method3();
		
	}
	
	public void method3()
	{
		System.out.println("i am in method3");
	}

}
