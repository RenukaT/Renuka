package StaticMethod;

public class AverageStaticMethod {

	public String sName;
	public double mMarks;
	public double pMarks;
	public double cMarks;
	public double avgMarks;
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//Memory will share both objects as it is static method.

		AverageStaticMethod renu=new AverageStaticMethod();
		
		renu.sName="renu";
		renu.mMarks=100.10;
		renu.pMarks=20.10;
		renu.cMarks=30.10;
		//when method is static, we need to call static(avg) method with class name or with 
		//only with static method name.
		renu.avgMarks=AverageStaticMethod.avg(renu.mMarks,renu.pMarks,renu.cMarks);
		System.out.println("renu's avg marks is " +renu.avgMarks);
		
		
		AverageStaticMethod satya=new AverageStaticMethod();
		
		satya.sName="renu";
		satya.mMarks=200.10;
		satya.pMarks=10.10;
		satya.cMarks=40.10;
		satya.avgMarks=avg(satya.mMarks,satya.pMarks,satya.cMarks);
		System.out.println("satya's avg marks is " +satya.avgMarks);
	}

	//Static Method (if method is same for all objects, we can create static method 
	//so that memory will not be waste.
	
	public static double avg(double m,double p,double c)
	{
		return (m+p+c)/3;
	}
}
