package firstproject;

import java.util.Scanner;

public class CountVowelsAndConsonants {

	public static void main(String[] args) {
		
		Scanner input=new Scanner(System.in);
		
		while(true) {
			
			int vowel=0, consonant=0;
			
			System.out.print("Enter a sentence: ");
			String sentence=input.nextLine();
			char x='A', y='a' ;
			for(; x<='Z'&&y<='z'; x++, y++) {
				if(x=='A'||x=='E'||x=='I'||x=='O'||x=='U'||y=='a'||y=='e'||y=='i'||y=='o'||y=='u') {
					for(int i=0; i<sentence.length(); i++) {
						if(x==sentence.charAt(i)||y==sentence.charAt(i)) {
							vowel++;
						}
					}
				}
				else
					for(int i=0; i<sentence.length(); i++) {
						if(x==sentence.charAt(i)||y==sentence.charAt(i)) {
							consonant++;
						}
					}
			
		}
			System.out.println("Vowels are: "+vowel+"\nConsonants are: "+consonant);
		}
	}
}
