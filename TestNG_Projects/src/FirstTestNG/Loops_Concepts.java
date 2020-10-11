package FirstTestNG;

import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class Loops_Concepts {

	@BeforeTest
	public void Loops_Start() {
		System.out.println("WelCom to Loops Concepts");
		System.out.println("\n");
	}
	
  @Test
  public void While_loops() {
	  System.out.println("\n");
	  int a = 0;
	  
	  while(a<10) {
		  System.out.println("hello World");
		  a++;
		  
	
	  }
		  
	  }
  @Test
	public void For_Loops() {
	  
	  System.out.println("\n");
	  for (int b = 0; b<10;b++) {
		  System.out.println("Oct 18 is My Day");
		  
	  }
	  
  }
  @Test
  public void Do_while_Loops() {
	  int c = 0;
	  
	  do {
		  
		  System.out.println("Next up coming tournament on nov 2nd");
		  c++;
	  }while(c<10);
	  //System.out.println("Loops Finished");
	  
  }
  @AfterTest
  public void Loops_End() {
	  System.out.println("\n");
	  System.out.println("Loops Ended");
  }
}
  

