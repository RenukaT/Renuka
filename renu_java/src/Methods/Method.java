package Methods;

public class Method {
public int a;
public int b;
public int c;
public int d;
public int e;
public int f;

public static void main(String a[]) {
	Method obj=new Method();
	obj.a=100;
	obj.b=200;
	int c=obj.a+obj.b;
	System.out.println(c);
	
	obj.d=400;
	obj.e=500;
	int f=obj.d+obj.e;
	System.out.println(f);
	
}
}