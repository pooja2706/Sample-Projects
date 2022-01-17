package firstproject;

import java.util.Scanner;

public class JoinTwoLists {

	public static void main(String[] args) {
		Scanner input=new Scanner(System.in);
		
		System.out.print("Enter first string: ");
		String str1=input.next();
		
		System.out.print("Enter second string: ");
		String str2=input.next();
		
		String str=str1.join(str2, args);
		System.out.print(str);
		
	}
}
