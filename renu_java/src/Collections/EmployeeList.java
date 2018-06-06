package Collections;

import java.util.ArrayList;
import java.util.List;


public class EmployeeList {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		List<Object> EmployeeList= new ArrayList <Object>();
		
		EmployeeList.add(1000);
		EmployeeList.add(2000.799);
		EmployeeList.add(0,"renu");
		EmployeeList.add("hyderabad");
		
		EmployeeList.add("satya");
		
		
		//System.out.println(EmployeeList.get(0));
		//System.out.println(EmployeeList.get(1));
		//System.out.println(EmployeeList.get(2));
		//System.out.println(EmployeeList.get(3));
		//System.out.println(EmployeeList.get(4));
		
		//EmployeeList.clear();
		
		//System.out.println(EmployeeList.isEmpty());
		
		System.out.println(EmployeeList.size());
		
		for(int i = 0;i<EmployeeList.size();i++)
		{
		System.out.println(EmployeeList.get(i));	
		}
		
		System.out.println(EmployeeList);
		
		
	}

}
