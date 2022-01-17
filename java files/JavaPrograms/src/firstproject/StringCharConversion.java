package firstproject;

import java.util.Scanner;
import java.util.Arrays;

public class StringCharConversion {

	public static void main(String[] args) {
		
		Scanner input=new Scanner(System.in);
		while(true) {
		System.out.print("Enter the type of conversion:\nPress 1 for char to string conversion\nPress 2 for string to char conversion\n");
		int num=input.nextInt();
		switch(num) {
		case 1: System.out.print("Enter the character value: ");
				char ch=input.next().charAt(0);
				String str=Character.toString(ch);
				System.out.println("The string value is: "+str);
				break;
				
		case 2: System.out.print("Enter the string value: ");
		 		String st=input.next();
		 		char[] c=st.toCharArray();
		 		System.out.println("The character value is: " + Arrays.toString(c));
		 		break;
		 		
		default: System.out.println("Enter a valid number!!"); 		
		}
		input.close();

		}
	}
}
