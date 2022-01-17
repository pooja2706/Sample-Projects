package dsalgo;

import java.util.Scanner;
import java.util.ArrayList;

public class CyclicallyRotate {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input=new Scanner(System.in);

		while(true) {

			System.out.print("Enter the number of elements: ");
			int num=input.nextInt();
			
			if(num==0) {
				System.out.println("Enter a number greater than 0");
				continue;
			}
			ArrayList<Integer> arr=new ArrayList<>();
			System.out.println("Enter the elements: ");
			
			int[] a=new int[num];
			
			for(int i=0; i<num; i++) {
				a[i]=input.nextInt();
				arr.add(a[i]);
			}
			arr.add(0, arr.get(num-1));
			arr.remove(num);
			
			System.out.println(arr);

		}

	}

}
