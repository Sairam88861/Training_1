package collections1;

import java.util.ArrayList;
import java.util.List;

public class ParamList {

	public static void main(String[] args) {
		
		List<String> list = new ArrayList<String >();
		
		list.add("Mohan");
		
		list.add("Aishwarya");
		
		list.add("Teju");
		
		for(String var:list){
			
			System.out.println(var);
		}
		System.out.println(list.size());
	}

}
