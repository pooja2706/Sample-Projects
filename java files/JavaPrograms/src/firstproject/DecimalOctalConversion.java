package firstproject;
import java.util.Scanner;
public class DecimalOctalConversion {

	public static void main(String[] args) {
		
		Scanner input=new Scanner(System.in);
		while(true) {
		System.out.println("Enter 1 for octal to decimal conversion\nEnter 2 for decimal to octal conversion");
		int type=input.nextInt();
		
		switch(type) {
		
		case 1: System.out.print("Enter the octal number: ");
				int num=input.nextInt();
				System.out.println(octalToDecimal(num));
				break;
				
		case 2: System.out.print("Enter the decimal number: ");
				int num1=input.nextInt();
				System.out.println(decimalToOctal(num1));
				break;
				
		default: System.out.println("Enter a valid integer: ");
		
		}
		}
		
	}
	
	public static int octalToDecimal(int a) {
		int decimal=0, i=1;
		while(a!=0) {
			decimal+=(a%10)*i;
			i*=8;
			a/=8;
		}
		return decimal;
	}
	
	public static int decimalToOctal(int a) {
		int binary=0, i=1;
		while(a>=1) {
			binary+=(a%8)*i;
			i*=10;
			a/=8;
		}
		return binary;
		
	}
}
