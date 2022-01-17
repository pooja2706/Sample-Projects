package javaLab;

import java.util.Scanner;
public class PrimeNumber {
	
	void checkPrime(int num) {
		int result=0;
		if(num==1) {
			result=0;
		}
		else if(num==2){
			result=1;
		}
		else {
		for(int i=2; i<num; i++) {
			if(num%i==0) {
				result=0;
				break;
			}
			else {
				result=1;
			}
		}
		}
		if(result==0) {
			System.out.println(num+" is not a prime number");
		}
		else {
			System.out.println(num+" is a prime number");
		}
		
		
	}
	
	public static void main(String[] args) {
		Scanner in=new Scanner(System.in);
		while(true) {

			 System.out.print("Enter a number: ");
					int num=in.nextInt();
					
					PrimeNumber n1=new PrimeNumber();
					n1.checkPrime(num);
			}
		}
		
		
	}

