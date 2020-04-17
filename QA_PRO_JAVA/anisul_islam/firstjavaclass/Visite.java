
package firstjavaclass;

import java.util.Scanner;

/**
 * @author zohir_alom
 *
 */
public class Visite {
	
	String from;
	String to;
	Short days;
	static String airlines;
	static byte flight;

	public static void main(String[] args) {
		
		Scanner tour = new Scanner(System.in); 
		
		int passenger;
		String name;
		long passport;
		System.out.println("Enter number of passenger: ");
		passenger=tour.nextInt();
		System.out.println("Enter passenger name: ");
		name=tour.next();
		System.out.println("Enter passport number: ");
		passport=tour.nextLong();
		
		// Instance ......
		Visite destination = new Visite();
		System.out.println("Enter departure from: ");
		destination.from=tour.next();
		System.out.println("Enter arrival to: ");
		destination.to=tour.next();
		System.out.println("Enter visiting days: ");
		destination.days=tour.nextShort();
		
		//static.....
		System.out.println("Enter airlines name: ");
		Visite.airlines=tour.next();
		System.out.println("Enter flight number: ");
		Visite.flight=tour.nextByte();
		
		System.out.println("Have a safe journey");
		
		
		
		

	}

}
