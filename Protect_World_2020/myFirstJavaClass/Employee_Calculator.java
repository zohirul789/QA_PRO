import java.util.Scanner;

public class Employee_Calculator {

	public static void main(String[] args) {
		//### Employee Calculator ##
		System.out.println("## Employee Calculator ## \n");
		
		// Create Scanner class object
		Scanner my = new Scanner(System.in);
		
		// Variable Declaration.......
		String emp_name;
		double emp_hourly_rate;
		double emp_total_hour;
		double gross_pay;
		
		// User Input...
		System.out.println("Enter Employee Name: ");
		emp_name=my.nextLine();
		
		System.out.println("Enter Employee Hourly Rate: ");
		emp_hourly_rate=my.nextDouble();
			
		System.out.println("Enter Employee Total Hour: ");
		emp_total_hour=my.nextDouble();
		System.out.println("");
		
		//Calculate Gross Pay...
		gross_pay = emp_hourly_rate * emp_total_hour;
		
		//OutPut
		System.out.println("Emp_Name: "+emp_name);
		System.out.println("Emp_Hourly_Rate: "+emp_hourly_rate);
		System.out.println("Emp_Total_Hour: "+emp_total_hour);
		System.out.println("Total Gross Pay = "+gross_pay);

	}

}
