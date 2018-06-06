package ExceptionHandling;

public class Operatios {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int x=10;
		int y=0;
		
		try{
		int z=x/y;          //unchecked Exception or Run time Exception
		System.out.println(z);
		}
		
		catch(Exception e)
		{
			System.out.println("Cannot divide by zero");
		}
		finally
		{
			System.out.println("Exception Handled");
		}
		
		
		
	}

}
