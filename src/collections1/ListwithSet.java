/**
 * 
 */
package collections1;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/**
 * @author pavan
 *
 */
public class ListwithSet {

	public static void main(String[] args) {
		
		List<String> list= new ArrayList<String>();
		
		list.add("mohan");

		list.add("kumar");

		list.add("mohan");
		
		list.add("pranav");
		
		System.out.println("--------------Actual list is--------------");

		System.out.println(list);



	Collections.reverse(list);
	
	System.out.println("--------------Reverse list is--------------");
	
	System.out.println(list);	

	//to know that name found in list its a boolean term will return only true, false
	
	for(String s:list)	{
		
		
		System.out.println(s.equals("mohan"));
		
		
		
	}

}
}
