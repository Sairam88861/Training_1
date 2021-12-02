package collectionstopics;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class HashMapEX {

	public static void main(String[] args) {
		
		Map<String, Integer> map= new HashMap<String, Integer>();
		
		map.put("Roll number", 1254);
		
		map.put("last number", 1154);
		
		map.put("fisdt number", 1257);
		
		map.put("new number", 1244);
		
		map.put("old number", 7254);
		
		map.put("calling number", 3254);
		
		map.put("scratch number", 1251);
		
		//System.out.println(map);
		
		//System.out.println(map.get("Roll number"));
		
		//System.out.println(map.size());
		
		//System.out.println(map.containsKey("Roll number= 1254"));
		
		Set<String> key= map.keySet();
		
		for(String s: key){
			
			System.out.println(s+" "+map.get(key));
		}

	}

}
