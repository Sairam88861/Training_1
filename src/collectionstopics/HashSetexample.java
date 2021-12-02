package collectionstopics;

import java.util.HashSet;
import java.util.Iterator;

public class HashSetexample {

	public static void main(String[] args) {
 
		HashSet<String> set= new HashSet<String>();
		
		set.add("mohan");
		
		set.add("pavan");
		
		set.add("teja");
		
		
		//System.out.println(set);
		
		Iterator<String> itr= set.iterator();
		
		while(itr.hasNext()){
			
			String va = itr.next();
			
			if(va.equals("pavan")){
			
			System.out.println(va);
			}
		}
			
	}
		
	}


