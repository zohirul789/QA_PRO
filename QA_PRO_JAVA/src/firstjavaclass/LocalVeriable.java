/**
 * 
 */
package firstjavaclass;

/**
 * @author zohir_alom
 *
 */
public class LocalVeriable {

	public static void main(String[] args) {
	
		int confirmCase, death, recovered, currentCase;
		
		confirmCase = 400000;
		death = 13000;
		recovered = 17000;
		
		currentCase = confirmCase - death -recovered;
		
		double currentCase2 = (double)confirmCase - death- recovered;
		
		System.out.println("Remaining Case is: "+currentCase);
		System.out.println(currentCase2);
		System.out.println(" \"More New Case Might Be Add\" ");
		
		
		
		
		
		
		
		
	}

}
