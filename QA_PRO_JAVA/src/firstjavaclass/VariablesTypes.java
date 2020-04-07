
package firstjavaclass;

/**
 * @author zohir_alom
 *
 */
public class VariablesTypes {

	// instance variable declaration.........
	String name = "ZOHIRUL ALOM";
	String address = "QUEENS, NEW YORK";
	
	// static variable declaration...........
	static long cell = 7189155916L;
	static boolean info = true;

	
	public static void main(String[] args) {
		// local variables........
		String title = "QA Automation engineer";
		System.out.println(title+" is my dream job");
		
	   // instance variable........
		VariablesTypes student = new VariablesTypes();
		System.out.println("my name is "+student.name);
		System.out.println("I live in "+student.address);
		
		//static variable.......
		System.out.println("my cell phone number is "+VariablesTypes.cell);
		System.out.println("my information is "+VariablesTypes.info);
		
	}

}
