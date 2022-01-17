package dsalgo;

import java.util.Scanner;

public class MaximumMinimumArrayElements {

	public static void main(String[] args) {
		
		Scanner input=new Scanner(System.in);
	
		
		while(true) {
		System.out.print("Enter the number of elements of an array: ");
		int num=input.nextInt();
		int max=0, min=0;
		int[] elmnt=new int[num];
		System.out.println("Enter the elements: ");
		
		for(int i=0; i<num; i++) {
			elmnt[i]=input.nextInt();
			max=elmnt[i];
			min=elmnt[i];
		}
		for(int i=0; i<num; i++) {
			max=elmnt[i]>max?elmnt[i]:max;
			min=elmnt[i]<min?elmnt[i]:min;
		}
		
		System.out.println("Maximum element is: "+max+"\nMinimum element is: "+min);
	}
	}
}
