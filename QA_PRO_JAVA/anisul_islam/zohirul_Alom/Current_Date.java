package zohirul_Alom;

import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;

public class Current_Date {

	public static void main(String[] args) {
		
		Date date = new Date();
		
		DateFormat dateFormat = new SimpleDateFormat("dd/MM/YY");
		String currentDate = dateFormat.format(date);
		System.out.println("Current Date = "+currentDate);
		
	}

}
