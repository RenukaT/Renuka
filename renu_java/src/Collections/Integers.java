package Collections;

import java.util.ArrayList;
import java.util.List;

public class Integers {

	public static void main(String[] args) {
		
		List<Object> values=new ArrayList<Object>();
		
		values.add(1);
		values.add("renu");
		values.add(10.2454f);
		values.add(112);
		
		System.out.println(values.get(0));
		System.out.println(values.get(1));
		System.out.println(values.get(2));
		System.out.println(values.get(3));
		
		System.out.println(values);
		
		for(int i=0;i<values.size();i++)
		{
			System.out.println(values.get(i));
		}
	
		
	}
}
		

		


