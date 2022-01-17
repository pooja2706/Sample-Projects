package dsalgo;

import java.util.Scanner;
import java.util.Arrays;

public class LargestSumContiguousArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner input=new Scanner(System.in);
		
		while(true) {
		System.out.print("Enter the number of array elements: ");
		int num=input.nextInt();
		KthMaxMin m=new KthMaxMin();
		int[] arr=m.takingInput(num);
		System.out.println(Arrays.toString(arr));
		
		int max=maxSubArraySum(arr, num);
		System.out.println("The maximum sum of contiguous subarray is "+max);
	}
	}
	
	public static int maxSubArraySum(int[] arr, int num) {
		
		int maxSoFar=0, maxEnding=0;
		
		for(int i=0; i<num; i++) {
			maxEnding+=arr[i];
			if(maxEnding<0) {
				maxEnding=0;
			}
			if(maxSoFar<maxEnding) {
				maxSoFar=maxEnding;
			}
			
		}
		return maxSoFar;
	}

}
