package AbstractClassANDabstractMethod;

public class renuphone extends Rameshphone {//concrete class
	
	public static void main(String a[]) {
		renuphone obj=new renuphone();
		obj.cook();
		obj.move();
		obj.dance();
		obj.call();
		
		}
	
	public void cook()
	{
		System.out.println("cooking....");
		
	}
	
	public void move()
	{
		System.out.println("moving...");
	}

}
