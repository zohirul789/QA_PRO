package zohirul_Alom;

public class StringDemo2 {

	public static void main(String[] args) {
		
		String firstname ="zohirul";
		String lastname = " alom";
		
		String fullname	= firstname.concat(lastname);
		System.out.println("Full name: "+fullname);
		
		String UPPERNAME = fullname.toUpperCase();
		System.out.println("Full Name: "+UPPERNAME);
		
		String lowername = fullname.toLowerCase();
		System.out.println("Full Name: "+lowername);
		
		boolean fname = firstname.startsWith("z");
		System.out.println("FirstName Start With z :"+fname);
		
		boolean lname = lastname.endsWith("m");
		System.out.println("Last Name Ends With m :"+lname);
	}

}
