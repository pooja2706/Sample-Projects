package firstproject;

import java.util.Scanner;

public class RemoveWhiteSpace {

	public static void main(String[] args) {
		
		Scanner input=new Scanner(System.in);
		
		System.out.print("Enter a string: ");
		String sentence=input.nextLine();
		
			sentence=sentence.replaceAll("\\s", "");//\\s is used to finds all whitespace, tabs, new line character.
			System.out.print(sentence);
			input.close();

	}
}
