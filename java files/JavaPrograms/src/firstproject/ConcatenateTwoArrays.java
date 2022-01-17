package firstproject;

import java.util.Arrays;

public class ConcatenateTwoArrays {

	public static void main(String[] args) {
		int[] arr1= {1,2,2,5};
		int [] arr2= {3,5,6,7};
		
		int aLength=arr1.length;
		int bLength=arr2.length;
		
		int[] result=new int[aLength+bLength];
		
		System.arraycopy(arr1, 0, result, 0, aLength);
		System.arraycopy(arr2, 0, result, aLength, bLength);
		
		System.out.print(Arrays.toString(result));
	}
}
