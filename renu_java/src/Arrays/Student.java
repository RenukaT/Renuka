package Arrays;

public class Student {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String student[]=new String[5];
		
		student[0]="renu";
		student[1]="raj";
		student[2]="satya";
		student[3]="srinu";
		student[4]="kumari";
		
		System.out.println(student[0]);
		System.out.println(student[1]);
		System.out.println(student[2]);
		System.out.println(student[3]);
		System.out.println(student[4]);
		
		for(int i = 0;i<student.length;i++)
		{
			System.out.println(student[i]);
		}
		
	}

}
