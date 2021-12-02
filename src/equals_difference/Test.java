package equals_difference;

import java.util.ArrayList;
import java.util.List;
/*
 * == comparision operator which compares references and its addresses
 * 
 * .equals is comparision operator but compares data inside object references
 * 
 */

public class Test {

	public static void main(String[] args) {
		
              List <Integer> list= new ArrayList<Integer>();
              
              list.add(125);
		
              List <Integer> list1= new ArrayList<Integer>();
              
              list1.add(125);
		
              
              System.out.println(list==list1);
              
              System.out.println(list.equals(list1));
              
              String s= new String("mohan");
		
		String s1= new String("mohan");
		
		//System.out.println(T==T1);
		

		
		System.out.println(s.equals(s1));
		
		
		Equals_doubleequals eq= Equals_doubleequals.getinstance();
		
		Equals_doubleequals eq1= Equals_doubleequals.getinstance();
		
	
		System.out.println(eq==eq1);
		
		System.out.println(eq.equals(eq1));
		
		
	}

}
