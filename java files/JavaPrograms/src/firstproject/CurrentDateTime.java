package firstproject;

import java.time.LocalDateTime;

public class CurrentDateTime {

	public static void main(String[] args) {
		LocalDateTime current=LocalDateTime.now();
		System.out.print("Current date and time is: "+current);
	}
}
