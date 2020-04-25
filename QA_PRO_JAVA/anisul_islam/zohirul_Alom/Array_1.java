package zohirul_Alom;

public class Array_1 {
	
	// Declaring array....
	// syntax: <datatype> [] ArayName;
	// int [] number;
	// Creating Array.....
	// int [] number = new int[10];

	public static void main(String[] args) {
		
		int [] number = new int[5];
		int sum = 0;
		
		number[0] = 10;
		number[1] = 20;
		number[2] = 30;
		number[3] = 40;
		number[4] = 50;
		
		sum = number[0]+number[1]+number[2]+number[3]+number[4];
		System.out.println("Sum is = "+sum);
		
		int len = number.length;
		System.out.println("Array Size = "+len);

	}

}
