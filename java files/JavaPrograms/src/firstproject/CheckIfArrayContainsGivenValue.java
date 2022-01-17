package firstproject;

import java.util.Scanner;

public class CheckIfArrayContainsGivenValue {

	public static void main(String[] args) {
		
		Scanner input=new Scanner(System.in);
		
		String arr= "jdfhnv";
		int a=0;
		while(true) {
		System.out.print("Enter a value: ");
		char value=input.next().charAt(0);
		int result;
		
		for(int i=0; i<6; i++) {
			if(arr.charAt(i)==value) {
				a=1;
				result=arr.indexOf(value)+1;
				System.out.println(result);
				break;
			}
		}
		if(a==0)
			System.out.println("It is not present.");
			
	}
	}
}
