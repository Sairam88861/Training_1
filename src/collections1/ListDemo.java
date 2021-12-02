package collections1;

import java.util.ArrayList;

public class ListDemo {

	public static void main(String[] args) {
		
		ArrayList list= new ArrayList();
		
		list.add("mohan");
		
		list.add(1, 20);
		
		list.add("kumar");
		
		for(Object var:list){
			
			System.out.println(var);
			
			
		}
		System.out.println("list size is : "+list.size());
	}

}
