package salesSystemInfo;

public class CustomerOutput {
	
	
	public void displayRecipet(Customer c) {
		
		System.out.println("Customer Name: "+c.customerName);
		System.out.println("Product Name: "+c.productName);
		System.out.println("Product Rate: "+c.productRate);
		System.out.println("Product Qty: "+c.productQty);
		System.out.println("Total Amount: "+c.amountToPay);
		
	}


}
