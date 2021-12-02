package collections3_Maps;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class Demomaps {

	public static void main(String[] args) {
	
		HashMap<String, Integer> map = new HashMap<String, Integer>();
		
		map.put("Mohan", 1);
		map.put("Class", 1);
		map.put("Role", 120);
		map.put("Office", 120);
		map.put("location", 90);
		map.put("Office", 120);
		map.put("Office", 120);
		map.put("Office", 120);
		map.put("Office", 120);
		

		System.out.println(map);
		
		Set<String> keys= map.keySet();
		
		for(String key:keys){
			
			System.out.println("key--->"+key+"---value---"+map.get(key));
			
		}
		
		
			System.out.println("----------map1 values-----");
			System.out.println();
		HashMap<String, Set<Integer>> map1 = new HashMap<String, Set<Integer>>();
		
		Set<Integer> setofvalues = new HashSet<Integer>();
		
		setofvalues.add(25);
		setofvalues.add(125);
		setofvalues.add(225);
		setofvalues.add(125);
		setofvalues.add(252);
		setofvalues.add(253);
		setofvalues.add(255);
		
		map1.put("Values", setofvalues);
		
		System.out.println(map1);
		
		System.out.println("----------map2 values-----");
		System.out.println();
		
		HashMap<String, List<String>> map2 = new HashMap<String, List<String>>();
		
		List<String> list = new ArrayList<String>();
		
		list.add("mohankumar@gmail.com");
		list.add("mohankumar123@gmail.com");
		list.add("mohankumar213@gmail.com");
		list.add("mohankumar1234@gmail.com");
		
		map2.put("list of Emails", list);
		
		System.out.println(map2);
	}

}
