/**
 * 
 */
package firstjavaclass;

import java.util.Scanner;

/**
 * @author zohir_alom
 *
 */
public class ScannerUser {

	String mother;
	String father;
	String son;
	static String daughter1;
	static String daughter2;
	static boolean fmember;
	public static void main(String[] args) {
		
		Scanner family = new Scanner(System.in);
		//local variable........
		int familymember;
		System.out.println("Enter number of family member: ");
		familymember=family.nextInt();
		
		//instance variable.......
		ScannerUser fm=new ScannerUser();
		System.out.println("Enter Mother Name: ");
		fm.mother=family.next();
		System.out.println("Enter Father Name: ");
		fm.father=family.next();
		System.out.println("Enter Son Name: ");
		fm.son=family.next();
		
		//static variable........
		System.out.println("Enter Daughter1 Name: ");
		ScannerUser.daughter1=family.next();
		System.out.println("Enter Daughter2 Name: ");
		ScannerUser.daughter2=family.next();
		System.out.println("Confirm Family member True/False: ");
		ScannerUser.fmember=family.nextBoolean();
		
		System.out.println("All Are My Lovely Fmily Member");

	}

}
