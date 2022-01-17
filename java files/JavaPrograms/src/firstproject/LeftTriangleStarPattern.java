package firstproject;

import java.util.Scanner;

public class LeftTriangleStarPattern {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input=new Scanner(System.in);
		
		while(true) {
		System.out.print("Enter the number of lines: ");
		int line=input.nextInt();
		
		for(int i=line; i>0;i--) {
			for(int j=1; j<=line; j++) {
				if(j<i) {
					System.out.print(" ");
				}
				else{
					System.out.print("*");
				}
			}System.out.println();
		}
		System.out.println();
		input.close();

	}
	}
}
