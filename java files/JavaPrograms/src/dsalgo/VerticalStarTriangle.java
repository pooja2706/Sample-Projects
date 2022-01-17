package dsalgo;

import java.util.Scanner;

public class VerticalStarTriangle {

	public static void main(String[] args) {
		Scanner input=new Scanner(System.in);
		
		while(true) {
			
			System.out.print("Enter the number of lines: ");
			int num=input.nextInt();
			
			for(int i=1; i<=num; i++) {
				for(int j=1; j<=i; j++) {
					System.out.print("*");
				}System.out.println();
				
				if(i==num) {
					for(int m=num-1; m>0; m--) {
						for(int n=1; n<=m; n++) {
							System.out.print("*");
						}System.out.println();
					}System.out.println();
					break;
				}
			}
			
		}
	}
}
