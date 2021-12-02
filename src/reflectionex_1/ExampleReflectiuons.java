package reflectionex_1;

import java.lang.reflect.Method;
import java.lang.reflect.Parameter;
import java.security.Policy.Parameters;

public class ExampleReflectiuons extends Test{

	public static void main(String[] args) {
		
		Test t= new Test();
		
		Class cl= t.getClass();
		
		System.out.println(cl.getSimpleName());
		
		Method[] obj=cl.getDeclaredMethods();
		
		System.out.println(obj);
		
		System.out.println(obj.length);
		
		System.out.println("super class "+cl.getSuperclass());
		
		for(Method m:obj){
			
			System.out.println(m.getName()+"   Return type is --->  "+m.getReturnType());
			
			Parameter[] param= m.getParameters();
			
			for(Parameter par:param){
				
				System.out.println(par.getName());
		
		
			}

	}

}
}