package Methods;

public class MethodsWithReturnType {


public static void main(String[] args) {
	// TODO Auto-generated method stub
	
	MethodsWithReturnType obj=new MethodsWithReturnType();
	obj.add(100, 200);
	
	
String res=obj.concat("hi","hello");
	System.out.println(res);
	
	double val=obj.avg1(1.56, 200.56, 200, 100);
	System.out.print(val);
	
	
	int x=obj.add1(100,200);
	System.out.println(x);
	}

public void add(int a,int b)
{
	int c=a+b;
	System.out.println(c);
}



public String concat(String x, String y)
{
	
	return x+y;
}

public double avg1(double m, double p, int c, int g)
{
	return (m+p+c+g)/4;
}


public int add1(int a,int b)
{
	int c=a+b;
	System.out.println(c);
	return c;
}

}