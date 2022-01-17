package dsalgo;

import java.util.Scanner;

public class BlankStarPattern {

	public static void main(String[] args) {
		
		Scanner input=new Scanner(System.in);
		
		while(true) {
		System.out.print("Enter the number of lines: ");
		int num=input.nextInt();
		
		for(int i=1; i<num; i++) {
			
			for(int j=1; j<=2*num-1; j++) {
				if(j==1||j==2*i-1) {
					System.out.print("*");
				}
				else System.out.print(" ");
			}
			System.out.println();
		}
		for(int j=1; j<=num; j++) {
			System.out.print("* ");
		}
		System.out.println();
	}
	}
}
