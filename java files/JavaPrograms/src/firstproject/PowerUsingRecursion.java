package firstproject;

import java.util.Scanner;
public class PowerUsingRecursion {
	
	public static void main(String[] args) {
		while(true) {
	Scanner input=new Scanner(System.in);
	System.out.print("Enter the base: ");
	int base = input.nextInt();
	
	System.out.print("Enter the mantissa: ");
	int mntsa=input.nextInt();
	
	System.out.println(power(base,mntsa));
	}

	}
	
	public static int power(int bs, int exp) {
		
		if(exp>1) {
			return bs*power(bs, exp-1);
		}
		else return bs;
	}
}
