package wrapping;

public class Wrapping {
	int a=20;
	
	public void wrap1(){
	
		Integer obj= new Integer(a);
		
		
		
		int b= obj;
		
		System.out.println(obj);
		
		System.out.println(b);
	}
	
	
	

	public static void main(String[] args) {
		
		
		Wrapping wr= new Wrapping();
		
		wr.wrap1();		
			
			
			
		}
		
		
		

	}
