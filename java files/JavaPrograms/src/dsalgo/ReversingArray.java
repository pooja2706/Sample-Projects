package dsalgo;

import java.util.Arrays;
import java.util.Scanner; 

public class ReversingArray {

	public static void main(String[] args) {
		
		Scanner input=new Scanner(System.in);
		
		while(true) {
			
		System.out.print("Enter the number of elements: ");
		int elements=input.nextInt();
		int[] arr= new int[elements];
		
		System.out.println("Enter elements: ");
		
		for(int i=0; i<elements; i++) {
			arr[i]=input.nextInt();
			System.out.println();
		}
		
		reverse(arr);
		System.out.println();
	}
	}
	
	public static void reverse(int[] arr) {
		
		int start=0, end=arr.length-1;
		int number= arr.length%2==0 ? arr.length/2 -1 : arr.length/2 -1;
		for(int i=0; i<=number;i++) {
			arr[start]=arr[start]+arr[end];
			arr[end]=arr[start]-arr[end];
			arr[start]=arr[start]-arr[end];
			start++;
			end--;
		}
		
		System.out.print(Arrays.toString(arr));
	}
}
