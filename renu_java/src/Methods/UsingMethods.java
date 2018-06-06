package Methods;

public class UsingMethods {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		UsingMethods obj=new UsingMethods();
		obj.add(100, 300);
		obj.avg(100, 200, 300.890);
		obj.evenorodd(307);
		obj.message();
		}
	
	//Parameterized method
	public void add(int a,int b)
	{
		int c=a+b;
		System.out.println(c);
	}

	public void avg(int a,int b,double c)
	{
		double d=(a+b+c)/3;
		System.out.println(d);
	}
	
	public void evenorodd(int a)
	{
		if(a%2==0)
			System.out.println(a+"is even number");
		else
			System.out.println(a+"is odd number");
	}
	
	//non Parameterized method
	public void message()
	{
	System.out.println("hi"+"hello");	
	}
	
}
