package Collections;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

public class EmployeeSet {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Set<Object> EmployeeSet=new HashSet<Object>();
		
		EmployeeSet.add(1);
		EmployeeSet.add("satya");
		EmployeeSet.add(1234.2345);
		EmployeeSet.add(112);
		
	Iterator itr=EmployeeSet.iterator();
	
	while(itr.hasNext())
	{
		System.out.println(itr.next());
	}
		
		
	}

}
