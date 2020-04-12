package inheritance;

public class Teachers extends Person{
	
	String title;
	String email;
	
	void displayInformation1(){
		System.out.println("Title: "+title);
		System.out.println("Email: "+email);
	}
}
