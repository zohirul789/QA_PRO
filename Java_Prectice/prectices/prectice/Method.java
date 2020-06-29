package prectice;

public class Method {
	 

	public static void main(String[] args) {
		
		WelCome();
		Addition(400,200);
		Substraction(400,200);
		Multiplication(400,200);
		Divide(400,200);
		Modular(400,200);
		

	}
	public static void WelCome(){
		System.out.println("WEL COME TO CALCULATOR");
	}
	public static void Addition(int a, int b){
		System.out.println("A + B = "+ (a + b));
		
	}
	public static void Substraction(int a, int b){
		System.out.println("A- B = "+(a-b));
		
	}
	public static void Multiplication(int a,int b){
		System.out.println("A * B = "+ (a*b));
		
	}
	public static void Divide(int a, int b ){
		System.out.println("A / B = "+ (a/b));
	}
	public static void Modular(int a,int b){
		System.out.println("A % B	H = "+ (a%b));
	}

}
