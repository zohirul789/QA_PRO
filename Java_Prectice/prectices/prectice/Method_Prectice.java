package prectice;

public class Method_Prectice {

	public static void main(String[] args) {
		System.out.println("### ABOUT MYSELF ####");
		System.out.println("");
		WelCome();
		PersonName();
		PersonAddress();
		PersonEmail();
		Information();
		
		System.out.println("");
		System.out.println(" \"INFORMATION ENTERED SUCESSFULLY\" ");

	}
	public static void WelCome(){
		String title ="QA AUTOMATION TESTER";
		System.out.println(title);
	}
	public static void PersonName(){
		String name = "ZOHIRUL ALOM";
		System.out.println(name);
	}
	public static void PersonAddress(){
		String address = "10609 79th ST";
		String city = "OZONE PARK";
		String state ="NEW YORK";
		int zipcode = 11417;
		
		System.out.println(address);
		System.out.println(city);
		System.out.println(state);
		System.out.println(zipcode);
	}
	public static void PersonEmail(){
		String email = "ZOHIRUL789@YAHOO.COM";
		System.out.println(email);
	}
	public static void Information(){
		boolean info = true;
		System.out.println(info);
	}

}
