package salesSystemInfo;

import java.util.Scanner;

public class GetCustomerInput {
	
	public Customer Getinput(){
		Scanner sc = new Scanner(System.in);
		Customer cm = new Customer();
		
		System.out.print("Enter Customer Name: ");
		cm.customerName=sc.nextLine();
		
		System.out.print("Enter Product Name: ");
		cm.productName=sc.nextLine();
		
		System.out.print("Enter Product Rate: ");
		cm.productRate=sc.nextDouble();
		
		System.out.print("Enter Product Quantity: ");
		cm.productQty=sc.nextInt();
		System.out.println("\n");
		
		return cm;
	}

}
