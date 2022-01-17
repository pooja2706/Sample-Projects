package firstproject;

import java.util.Scanner;

public class AverageUsingArrays {

	public static void main(String[] args) {
		
		Scanner input=new Scanner(System.in);
		while(true) {
		System.out.print("Enter the number of terms: ");
		int term=input.nextInt();
		double sum=0;
		double[] num;
		num=new double[term];
		System.out.println("Enter numbers: ");
		
		for(int i=0; i<term; i++) {
			num[i]=input.nextInt();
			sum+=num[i];
		
		}
		System.out.println(sum/term);
	}
	}
}
