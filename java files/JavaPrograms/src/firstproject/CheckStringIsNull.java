package firstproject;

import java.util.Scanner;

public class CheckStringIsNull {

	public static void main(String[] args) {
		
		Scanner input=new Scanner(System.in);
		
		while(true) {
			
			System.out.print("Enter a string: ");
			String str=input.nextLine();
			
		System.out.println("The string is "+ isNullEmpty(str));
		input.close();

		}

		}
	public static String isNullEmpty(String str) {
		if(str.equals("null")) {
			return "NULL";
		}
		else if(str.isEmpty()) {
			return "EMPTY";
		}
		else {
			return "Neither NULL nor EMPTY";
		}
		
		}
}
