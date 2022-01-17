package dsalgo;

import java.util.Scanner;
import java.util.ArrayList;



public class SumOfList {

	public static void main(String[] args) {
		Scanner input=new Scanner(System.in);
		
		System.out.print("Enter the number of elements of the list: ");
		int num=input.nextInt();
		
		System.out.println("Enter the elements: ");
		ArrayList<Integer> arr=new ArrayList<>(num);
		
		for(int i=0; i<num; i++) {
			arr.add(input.nextInt());
		}
		System.out.print(arr);
		System.out.println(sumOfList(arr));
	}
	
	public static int sumOfList(ArrayList<Integer> ar) {
		
		int sum=0;
		for(int i=0; i<ar.size(); i++){
		    sum+=ar.get(i);
		}
		return sum;
	}
}
