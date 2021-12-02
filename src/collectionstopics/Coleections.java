package collectionstopics;

import java.io.IOException;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

import org.apache.poi.EncryptedDocumentException;

public class Coleections {

	public static void main(String[] args) throws EncryptedDocumentException, IOException {
	
		
			
			ArrayList<Integer> list= new ArrayList<Integer>();
			
			
			list.add(0, 12);
			
			list.add(1, 14);
			
			list.add(2, 14);
			
			
			
			System.out.println(list);
			
			
			System.out.println(list.size());
			
			list.remove(0);
			
			System.out.println(list);
			
			System.out.println(list.size());
			
			
			List<String> list1= new ArrayList<String>();
			
			list1.add(0, "element");
			
			String s= list1.get(0);
			
			System.out.println(s);
			
			
			for(Object var : list){
				
			//System.out.println(var);
			
			}
			
		/*	Iterator itr= list.iterator();
			
			while(itr.hasNext()){
				
				System.out.println(itr.next());
				
			}*/
			
			
	}
}
