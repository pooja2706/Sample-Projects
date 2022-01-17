package dsalgo;

import java.util.Scanner;
import java.util.ArrayList;
import java.util.Comparator;

public class ArrayUnionIntersection {
	
	public static void main(String[] args) {

		Scanner input=new Scanner(System.in);
		
		while(true) {
		ArrayList<Integer> a1=new ArrayList<>();
		ArrayList<Integer> a2=new ArrayList<>();
		
//		Inputting 1st array elements
		System.out.print("Enter the number of elements of first array: ");
		int num1=input.nextInt();
		int[] arr1=new int[num1];
		System.out.println("Enter elements of first array: ");
		for(int i=0; i<num1; i++) {
			arr1[i]=input.nextInt();
			a1.add(arr1[i]);
		}
		
//		Inputting 2nd array elements
		System.out.print("Enter the number of elements of second array: ");
		int num2=input.nextInt();
		int[] arr2=new int[num2];
		System.out.println("Enter elements of second array: ");
		for(int i=0; i<num2; i++) {
			arr2[i]=input.nextInt();
			a2.add(arr2[i]);
		}
		System.out.println("First array is: "+a1);
		System.out.println("Second array is: "+a2);
		
		union(a1, a2, num1);
		intersection(a1, a2, num1);
		input.close();

	}
	}
	
	public static void union(ArrayList<Integer> a1, ArrayList<Integer> a2, int num1) {
		ArrayList<Integer> union= (ArrayList<Integer>)a2.clone();
//		union
		for(int i=0; i<num1; i++) {
				if(!a2.contains(a1.get(i))) {
					union.add(a1.get(i));
				}
		}
		union.sort(Comparator.naturalOrder());
		System.out.println("The union of first and second array is "+union);
	}
	
	public static void intersection(ArrayList<Integer> a1, ArrayList<Integer> a2, int num1) {
//		Intersection
		ArrayList<Integer> intersection=new ArrayList<>();
		for(int i=0; i<num1; i++) {
			if(a2.contains(a1.get(i))) {
				intersection.add(a1.get(i));
			}
		}
		
		intersection.sort(Comparator.naturalOrder());
		System.out.println("The intersection of first and second array is: "+intersection);
	}

}
