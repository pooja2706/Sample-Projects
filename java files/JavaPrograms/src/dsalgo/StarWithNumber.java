package dsalgo;

import java.util.Scanner;

public class StarWithNumber {

	public static void main(String[] args) {
		Scanner input=new Scanner(System.in);
		
		while(true) {
		System.out.print("Enter the number of lines: ");
		int num=input.nextInt();
		
		for(int n=1; n<=num; n++) {
			
			int i=n;
			
			while(i!=0) {
			System.out.print("*");
			i--;
			}
			int a=num-n;
			while(a>=0) {
				System.out.print(" ");
				a--;
			}
			System.out.println(n);
		}
		}
	}
}
