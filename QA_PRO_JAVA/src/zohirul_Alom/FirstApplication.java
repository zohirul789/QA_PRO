package zohirul_Alom;
/**
 * @author zohir_alom
 * 
 */
public class FirstApplication {
	
	//Instance variable.......
	String name="zohirul alom";
	String state="new york";
	//static variable.......
	static String city = "ozone park";
	static int zipcode = 11417;
	
	
	public static void main(String[] args) {
		//local variable........
		String myInfo="Information";
		System.out.println(myInfo);
		
		FirstApplication my = new  FirstApplication();
		System.out.println("My name is: "+my.name);
		System.out.println("My state is: "+my.state);
		
		System.out.println("My city is: "+FirstApplication.city);
		System.out.println("My zipcode is: "+FirstApplication.zipcode);
		
		System.out.println(" \"THIS IS MY CURRENT INFORMATION\" ");
		


		
		
	
		
		
		
		
		
		
	}
}