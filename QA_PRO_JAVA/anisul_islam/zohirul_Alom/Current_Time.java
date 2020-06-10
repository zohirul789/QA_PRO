package zohirul_Alom;

import java.time.LocalTime;
import java.time.format.DateTimeFormatter;

public class Current_Time {

	public static void main(String[] args) {
		
		LocalTime time = LocalTime.now();
		DateTimeFormatter formatter = DateTimeFormatter.ofPattern("hh:mm:ss");
		String currenttime = time.format(formatter);
		System.out.println("Current Time: "+currenttime);

	}

}
