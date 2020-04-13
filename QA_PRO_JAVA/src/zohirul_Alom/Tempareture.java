package zohirul_Alom;

import java.util.Scanner;

public class Tempareture {
	
	//F=1.8 * Celsius +32;

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		double celsius, farenheight;
		// Enter Celsisu = 15........
		System.out.println("Enter celsius: ");
		celsius=sc.nextDouble();
		
		farenheight = 1.8 * (celsius + 32);
		System.out.println("Farenheight: "+farenheight);
		
		System.out.println(" \n ");
		
		double faren, cels;
		// Enter Farenheight = 70 ........
		System.out.println("Enter Farenheight: ");
		faren=sc.nextDouble();
		
		cels= 0.55*(faren - 32);
		System.out.println("Celsius: "+cels);
		
		

	}

}
