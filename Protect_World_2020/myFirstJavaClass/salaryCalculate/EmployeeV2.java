package salaryCalculate;

import java.util.Scanner;

public class EmployeeV2 {
	static String emp_name;
	static double emp_hourly_rate;
	static double emp_total_hour;
	static double gross_pay;
	
	public static void Welcome(){
		System.out.println("\n *******WelCome To Employee Calculator******* \n");
	}
	public static void GetInfo(){
		Scanner my = new Scanner(System.in);
		
		System.out.print("Enter Employee Name: ");
		emp_name=my.nextLine();
		
		System.out.print("Enter Employee Hourly Rate: ");
		emp_hourly_rate=my.nextDouble();
		
		System.out.print("Enter Employee Total Hour: ");
		emp_total_hour=my.nextDouble();
	}
	public static void Calculate(){
		gross_pay = emp_hourly_rate * emp_total_hour;
		System.out.print("Gross pay = "+gross_pay);
	}
	public static void Exit(){
		System.out.println("\n");
		System.out.println(" ### Thank You For Using Employee Calculator ###\n");
		System.out.println("<><><><><><><><><><><><><><><><>");
	}

	public static void main(String[] args) {
		for(int i=0;i<5;i++){
		Welcome();
		GetInfo();
		Calculate();
		Exit();

	  }
		
	}

}
