package zohirul_Alom;

import java.util.Scanner;

public class Circle {
	// for triangle A= 0.5 * base* height ;
	// for circle A = 3.1416 * radius * radius;

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		double radius, area;
		
		System.out.println("Enter radius: ");
		radius=sc.nextDouble();
		
		area=3.1416 * radius * radius;
		System.out.println("Area of Circle: "+area);
		
		

	}

}
