package firstproject;

import java.util.Scanner;

public class FrequencyOfCharacterInString {

	public static void main(String[] args) {
		
		Scanner input=new Scanner(System.in);
		
		System.out.println("Enter a sentence: ");
		String sentence=input.nextLine();
		
		while(true) {
			
		System.out.println("Enter the character to know it's frequency: ");
		char ch=input.next().charAt(0);
		
		int frequency=0;
		
		for(int i=0; i<sentence.length(); i++) {
			if(ch==sentence.charAt(i)) {
				frequency++;
			}
		}
		
		System.out.println("Frequency of "+ch+" is "+ frequency);
		input.close();

		}

	}
}
