package javaPrectice;

public class Arrayoutput {

	public static void main(String[] args) {
		
		int [] [] name = new int [5][7];
		int k = 0 ;
		
		
		for(int i=0; i < 5; i++){
			for(int j = 0; j < 7; j++){
				
				name [i] [j]=k;
				k++;
				
			}
		}
			
			for(int i = 0;i<5;i++){
				
				for(int j=0; j<7;j++){
					System.out.print(" "+name [i][j]);
					
				}
				System.out.println();
			}
		}
	}


