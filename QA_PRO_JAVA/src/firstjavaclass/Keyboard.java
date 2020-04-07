package firstjavaclass;
/**
 * @author zohir_alom
 *
 */

import java.util.Scanner;

public class Keyboard {
	//instance variable declaration......
	String jobtitle;
	String name;
	byte address;
	//static variable declaration.....
	static long cell;
	static boolean info;

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		// local variable declaration.......
		int emp_id;
		System.out.println("Enter emp_id: ");
		emp_id=scan.nextInt();
		
		//Instance object create .....
		Keyboard information = new Keyboard();
		System.out.println("Enter your job title: ");
		information.jobtitle=scan.next();
		System.out.println("Enter your name: ");
		information.name=scan.next();
		System.out.println("Enter your address: ");
		information.address=scan.nextByte();
		
		// static object create.....
		
		System.out.println("Enter your cell number: ");
		Keyboard.cell=scan.nextLong();
		System.out.println("verify and enter TRUE OR FALSE");
		Keyboard.info=scan.nextBoolean();
		
		System.out.println("my all information is correct");
		
		
	
		
		
		

	}

}
