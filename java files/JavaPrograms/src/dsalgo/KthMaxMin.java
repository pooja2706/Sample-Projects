package dsalgo;

import java.util.Arrays;
import java.util.Scanner; 

public class KthMaxMin {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner input=new Scanner(System.in);
		while(true) {
			System.out.print("Enter the number of elements: ");
			int num=input.nextInt();
			int[] a=new int[num];
			int[] arr=takingInput(num);
			ascendingOrder(arr, num);
			maxMin(arr, num);
		}
		
	}

	public static int[] takingInput(int n) {
	
	Scanner input=new Scanner(System.in);	
	int[] arr=new int[n];	
	System.out.println("Enter the elements: ");
	int i=0;
	for(; i<n; i++) {
		arr[i]=input.nextInt();
	}
	return arr;
	}

	public static void ascendingOrder(int[] arr, int n) {
	int i=0;
	int k=0;
	for(i=0; i<n; i++) {
		int b=k, c=0;
		for(int j=b; j<n; j++) {
			if(arr[b]>arr[j]) {
				arr[b]=arr[b]+arr[j];
				arr[j]=arr[b]-arr[j];
				arr[b]=arr[b]-arr[j];
				b=j;
			}
		else {
				c++;
			}
			if(c==n-k-1) {
				c=0;
				b=++k;
				System.out.println(k);						
			}
		}
}
		System.out.println(Arrays.toString(arr));
}

	public static void maxMin(int[] arr, int n) {
	Scanner input=new Scanner(System.in);
	System.out.print("Enter value of k to find kth maximum number: ");
	int kmax=input.nextInt();
	System.out.print("Enter the value of k to find kth minimum number: ");
	int kmin=input.nextInt();
	
	if(kmax>n||kmin>n) {
		System.out.println("Enter a number within the limit of your typed array: ");
	}
	else {
	System.out.println("kth maximum number is: "+arr[n-kmax]+"\nkth minimum number is: "+arr[kmin-1]);
	}
}
}