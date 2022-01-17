package firstproject;

import java.util.Scanner;

public class LargestElementUsingArray {
	
	public static void main(String[] args) {
		
		Scanner input=new Scanner(System.in);
		while(true) {
			
		System.out.print("Enter the number of terms: ");
		int term=input.nextInt();
		int largest=0;
		
		int[] num=new int[term];
		System.out.println("Enter the numbers(positive numbers): ");
		
		
		for(int i=0; i<term; i++) {
			
			num[i]=input.nextInt();
			largest=num[i]>largest?num[i]:largest;
			
		}
		System.out.println("The largest number is "+largest);
		input.close();

		}
		
		
	}

}
