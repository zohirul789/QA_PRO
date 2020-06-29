package prectice;

public class Array3 {

	public static void main(String[] args) {
		 
		String[] names = {"ZOHIRUL ALOM","10609 79TH ST","OZONE PARK, NY 11417"};
		int [] number = {10,20,30};
		int sum= 0;
	
		for(String x : names){
		
		System.out.println(x);
	    }
	
	    for(int y : number){
		
		sum = sum + y;
	    }
	    System.out.println();
	    System.out.println("SUM = "+sum);

	}

}
