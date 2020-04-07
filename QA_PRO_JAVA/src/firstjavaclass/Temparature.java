package firstjavaclass;

import java.util.Scanner;

public class Temparature {

	public static void main(String[] args) {
		
		Scanner input = new Scanner(System.in);
		/*
		 * *
		double cels,farens;
		
		
		System.out.print("Celsius = ");
		cels=input.nextDouble();
		
		farens = 1.8 * cels + 32;
		
		System.out.println("Farenhieght :"+farens);
		*
		**/
		
		double farens,cels;
		
		System.out.println("Farenheight= ");
		farens=input.nextDouble();
		
		cels = 0.5 * farens*32;
		
		System.out.println("Celsius: "+cels);
		
		
		
		

	}

}
