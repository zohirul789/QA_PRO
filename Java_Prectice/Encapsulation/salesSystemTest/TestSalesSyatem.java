package salesSystemTest;

import salesSystemInfo.Customer;
import salesSystemInfo.OrderSystem;

public class TestSalesSyatem {

	public static void main(String[] args) {
		OrderSystem ord = new OrderSystem();
		Customer csm = new Customer();
		 csm = ord.userinput();
		ord.calculateOrder(csm);
		ord.printRecipet(csm);	
		}

		
		

	}

