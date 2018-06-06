package MethodOverloading;

public class Method {
	
	public static void main(String[] args) {
		//Compile time or static polymorphism
		Method obj=new Method();
		obj.add(100, 200);
		obj.add(10, 20,30);
		obj.add(100.20, 20);
		obj.add(10, 20.20);
		}
	
	public void add(int a,int b)
	{
		int c=a+b;
		System.out.println(c);
	}
	
	public void add(int a,int b,int c)
	{
		int x=a+b+c;
		System.out.println(x);
	}
	
	public void add(double a,int b)
	{
		double c=a+b;
		System.out.println(c);
	}
	
	public void add(int a,double b)
	{
		double c=a+b;
		System.out.println(c);
	}
	
	
}