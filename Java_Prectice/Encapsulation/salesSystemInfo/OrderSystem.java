package salesSystemInfo;

public class OrderSystem {
	public Customer userinput(){
		GetCustomerInput ui = new GetCustomerInput();
		 return ui.Getinput();
	}
	public void calculateOrder(Customer c){
		Calculate cl = new Calculate();
		cl.totalBalance(c);
		
	}
	public void printRecipet(Customer c){
		CustomerOutput print = new CustomerOutput();
		print.displayRecipet(c);
	
	}

}
