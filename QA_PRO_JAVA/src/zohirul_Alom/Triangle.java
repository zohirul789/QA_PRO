package zohirul_Alom;

import java.util.Scanner;

public class Triangle {
       public static void main(String[]args){
    
		Scanner sc = new Scanner(System.in);  
    	   double base, height, area;
    	   
    	   System.out.println("Enter Base: ");
    	   base=sc.nextDouble();
    	   System.out.println("Enter Height: ");
    	   height=sc.nextDouble();
    	   
    	   area= 0.5 * base * height;
    	   System.out.println("Area Of Triangle: "+area);
    	   
    	   
    	   
    	   
       }

}
