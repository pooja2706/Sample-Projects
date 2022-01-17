package firstproject;

import java.util.Scanner;
public class BinaryDecimalConversion {

	public static void main(String[] args) {
		Scanner input=new Scanner(System.in);
		while(true) {
		System.out.println("Enter 1 if to convert binary to decimal\nEnter 2 for decimal to binary conversion: ");
		
		char symbol=input.next().charAt(0);
		
		switch(symbol) {
		
		case '1' : System.out.print("Enter the binary number: ");
					int num=input.nextInt();
					System.out.println(binaryToDecimal(num));
					break;
					
		case '2' : System.out.print("Enter the decimal number: ");
				   int num2=input.nextInt();
				   System.out.println(decimalToBinary(num2));
				   break;
		
		default: System.out.println("Enter a valid number: ");
		
		input.close();
		
		}
		}
		
	}
	
	public static int binaryToDecimal(int a) {
		int sum=0, i=1;
		while(a!=0) {
			
			sum+=a%2*i; 
			i*=2;
			a/=10;
		}
		return sum;
	}
	
	public static int decimalToBinary(int a) {
		int k=0, i=1;
		while(a>=1) {
			if(a%2==1) {
				k+=i;
			}
			i*=10;
			a/=2;
		}
		
		return k;
	}
}
