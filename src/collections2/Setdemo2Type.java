package collections2;

import java.util.HashSet;
import java.util.Set;

public class Setdemo2Type {
	
	/*
	 * there is no order or there is no index for set 
	 * arguments not foloows index but unique
	 * this set can used to window handling when handling multiple windows 
	 * to keep unique window ids uses 
	 * 
	 * 
	 */
	

	public static void main(String[] args) {
		
		Set<Integer> set = new HashSet<Integer>();
		
		Set<String> set2 = new HashSet<String>();
		
		set.add(25);
		set.add(25);
		set.add(100);
		set.add(25);
		set.add(125);
		set.add(25);
		set.add(215);
		set2.add("mohan");
		set2.add("kumar");
		set2.add("raj");
		set2.add("pavan");
		set2.add("mohan");
		
		
	
	if(set.equals(set2)){
			for(Integer var:set){
				
				System.out.println(var);
				
			}
			}else{
				System.out.println("set not equals set2");
			
		}
		
Object obj = set.size();
Object obj1= set2.size();
	
		if(obj==obj1){
			
		for(String var:set2){
			
			System.out.println(var);
		}

	}else{
		System.out.println("sizes are not equal");
	}
   }
}

