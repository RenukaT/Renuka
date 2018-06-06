package MethodOverloading;

public class averageMethod {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		averageMethod obj=new averageMethod();
		obj.avg(10, 20);
		
		int x=obj.avg(10, 20, 30);
		System.out.println(x);
		
		double y=obj.avg(10.10, 20);
		System.out.println(y);
	}

	public void avg(int a,int b)
	{
		System.out.println((a+b)/2);
	}
	
	public int avg(int a,int b,int c) 
	{
		return  (a+b+c)/3;
	}
	
	public double avg(double a, int b)
	{
		return ((a+b)/2);
	}
}
