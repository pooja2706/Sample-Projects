package firstproject;

import java.util.concurrent.TimeUnit;
import java.util.Scanner;

public class MillisecondsToSecondsAndMinutes {

	public static void main(String[] args) {
		
		Scanner input=new Scanner(System.in);
		
		while(true) {
			System.out.print("Enter time in milliseconds: ");
			long ms=input.nextLong();
			
			long sec=TimeUnit.MILLISECONDS.toSeconds(ms);
			long min=TimeUnit.MILLISECONDS.toMinutes(ms);
			
			System.out.println("Time in seconds: "+sec+"\nTime in minutes: "+min);
			input.close();

		}
	}
}
