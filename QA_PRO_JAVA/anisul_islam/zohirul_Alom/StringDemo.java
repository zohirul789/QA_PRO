package zohirul_Alom;

public class StringDemo {

	public static void main(String[] args) {
	
		String a1 ="ZOHIRUL ALOM";
		String a2 = new String("");
		
		System.out.println("A1 = "+a1);
		System.out.println("A2 = "+a2);
		
		int len = a1.length();
		System.out.println("Lenth ="+len);
		
		if(a1.contains(a2)){
			System.out.println("Equals");
		}
		else{
			System.out.println("Not Equals");
		}
		
		boolean con = a1.contains("ALOM");
		System.out.println(con);
		boolean emp = a2.isEmpty();
		System.out.println(emp);

	}

}
