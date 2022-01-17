package firstproject;

import java.util.Scanner;

public class Pyramid {
	
	public static void main (String[] args) {
		
		Scanner input =new Scanner(System.in);
		
		while(true) {
		System.out.print("Enter the number of lines: ");
		int num = input.nextInt();
		
		System.out.print("Enter what you want to enter: ");
		String ch=input.next();
		
		int s=1;
		int n=num;
			for(int i=1; i<=num; i++) {
				
				for(int j=0;j<2*num-1; j++) {
					
					System.out.print("\t");
					if(j==n) {
						for(int st=0; st<s;st++)
						System.out.print(ch+"\t");
					}
				}
				System.out.println();
				n--;
				s+=2;
			}
	}
	}

}
