package thisKeyWord;

public class operations {
public int x;
public int y;

public void setX(int x,int y)
{
	this.x = x;  //This is use to tell to compiler that left hand x is instance variable
	this.y = y;  // and right is local variable.
	
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		operations obj=new operations();
		
		obj.setX(10,20);
		System.out.println(obj.x);
		System.out.println(obj.y);
		
	}

	
}
