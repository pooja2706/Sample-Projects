package beginnerProgram;

import java.util.Scanner;

public class checkEvenOrOdd {
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
		
		checkEvenOrOdd n1=new checkEvenOrOdd();
		n1.check(num);
		}
		
	}

}
