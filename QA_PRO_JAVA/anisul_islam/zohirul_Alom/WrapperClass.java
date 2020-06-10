package zohirul_Alom;

public class WrapperClass {
	/*
	 * AutoBoxing
	 * Converting Primitive to Object
	 * 
	 * UnBoxing
	 * Converting Object to Primitive 
	 *
	 */

	public static void main(String[] args) {
	
		// AutoBoxing ->Primitive to Object
		System.out.println("AutoBoxing Primitive to Object");
		int a = 40;
		Integer b = Integer.valueOf(a);//Primitive to Object
		System.out.println("B = "+b);
		Integer e = a;
		System.out.println("E = "+e);
		
		System.out.println("******************************");
		
		//UnBoxing Object to Primitive 
		System.out.println("UnBoxing Object to Primitive");
		Double c = new Double(20.25);
		System.out.println("C = "+c);
		Double d =c.doubleValue();      //Object to Primitive
		System.out.println("D = "+d);
	}

}
