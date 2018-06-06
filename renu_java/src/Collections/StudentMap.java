package Collections;

import java.util.HashMap;
import java.util.Map;

public class StudentMap {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Map <Integer,String>StudentMap=new HashMap<Integer,String>();
		
		StudentMap.put(1000,"renu");
		StudentMap.put(2000, "Satya");
		StudentMap.put(3000, "salman");
		StudentMap.put(5000, "raju");
		StudentMap.put(3000, "salman1");
		
		System.out.println(StudentMap.get(1000));
		System.out.println(StudentMap.get(2000));
		System.out.println(StudentMap.get(3000));
		System.out.println(StudentMap.get(5000));
				
		System.out.println(StudentMap);
	}

}
