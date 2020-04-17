package zohirul_Alom;

public class UnaryOperator {
	/*Unary Operator....
	 * Unary -, Unary +
	 * Increment Operator..
	 * ++A Prefix Increment, A++ Postfix Increment !
	 * --A Prefix Decrement, A--Postfix Decrement!
	 * 
	 * */

	public static void main(String[] args) {
		
		System.out.println("\"Unary +Operator/-Operator\"");
		
		int a = 20;
		int Result;
		
		Result = +a;
		System.out.println("Result = "+Result);
		
		Result = -a;
		System.out.println("Result = "+Result);
		
		System.out.println("==============================\n");
		
		System.out.println(" \"Unary PreFix Increment/PostFix Increment\" ");
		int x = 15;
		int y = 16;
		int z;
		
		z = x++; // postfix increment....
		System.out.println("Y = "+z);
		
		z = ++y; // prefix increment....
		System.out.println("Z = "+z);
		System.out.println("===============================\n");
		
		System.out.println(" \"Unary PreFix Decrement/PostFix Decrement\" ");
		
		int k = 23;
		int L = 23;
		int m ;
		int n;
		
		m = k--;
		System.out.println("M = "+m);
		n = --L;
		System.out.println("M = "+n);

	} 

}
