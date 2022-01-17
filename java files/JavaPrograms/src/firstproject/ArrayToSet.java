package firstproject;

import java.util.*;
public class ArrayToSet {

	public static void main(String[] args) {
		String[] arr= {"a", "b", "c"};
		Set<String> set=new HashSet<>(Arrays.asList(arr));
		System.out.println("Array is: "+Arrays.toString(arr));
		System.out.print("Set is: "+set);
	}
}
