package javaPrectice;

public class CoronaVirus {
	//update information on 03/28/2020
	String country="UNITED STATE OF AMERICA";
	String state ="NEW YORK";
	int confirm=113000;
	static int death=2010;
	static int recover=3231;
	

	public static void main(String[] args) {
		
		int possition=1;
		System.out.println("Country possition Number is : " + possition);
		
		CoronaVirus covid= new CoronaVirus();
		System.out.println("Name of the country is: " + covid.country);
		System.out.println("State of the country is: " + covid.state);
		System.out.println("Efected people is: " + covid.confirm);
		
		System.out.println("Total death is: " + CoronaVirus.death);
		System.out.println("Total recovered number is: " + CoronaVirus.recover);
		
		
		System.out.println("STAY HOME SAVE THOUSAND OF LIFES!");
		
		
		

	}

}
