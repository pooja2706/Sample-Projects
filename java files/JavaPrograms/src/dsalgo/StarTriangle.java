package dsalgo;

import java.util.Scanner;

public class StarTriangle {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input=new Scanner(System.in);
		
		while(true) {
		System.out.print("Enter the number of lines: ");
		int num=input.nextInt();
		int a,k=1;
		for(int i=1; i<=num; i++) {
			a=1;
			for(int j=0; j<=2*num-1; j++) {
				
				if(j<=num-i||j>=num+i) {
					System.out.print(" ");
				}
				else {
					
					if(a%2==0) {
						System.out.print(" ");
					}
					else {
					System.out.print("*");
//					System.out.print(k);
					}
					a++;
				}
				
			}
			System.out.println();
			k+=2;
		}
		}

	}

}
