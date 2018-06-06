package AbstractClassANDabstractMethod;

public class Dog extends Animal{
	
	public static void main(String a[]) {
		Dog obj=new Dog();
		obj.animal();
		obj.legs();
		obj.colour();
		
	}
	
	public void sound()
	{
		System.out.println("barking...");
	}
	
 public void legs()
 {
	 System.out.println("i have 4 legs");
	 
 }
 
 public void colour()
 
 {
	 System.out.println("i am in white colour");
 }
}
