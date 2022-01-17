package javaLab;

import java.util.Scanner;

public class evenOrOdd {
	
	void check (int num) {
		if(num%2==0) {
			System.out.println("It is even");
		}
		else {
			System.out.println("It is odd");
		}
	}
	
	public static void main(String[] args) {
		Scanner input=new Scanner(System.in);
		while(true) {
		System.out.println("Enter the number: ");
		int num=input.nextInt();
		
		evenOrOdd n1=new evenOrOdd();
		n1.check(num);
		}
		
	}

}
