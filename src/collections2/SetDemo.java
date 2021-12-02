package collections2;

import java.util.HashSet;

public class SetDemo {
	
	/*
	 * set returns only unique values  
	 * i.e.. duplicate arg not allowed it will automatically remove duplicates 
	 * keep only uniques
	 */
	
	

	public static void main(String[] args) {
	
		HashSet set= new HashSet();
		
		set.add("mohan");
		
		set.add("kumar");
		
		set.add("pavan");
		
		set.add("mohan");
		
		set.add("pavan");
		
		
		System.out.println(set);
		
		for(Object var:set){
			
			System.out.println(var);
		}

	}

}
