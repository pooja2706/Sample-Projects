package javaLab;

import java.util.Scanner;
public class leapYear {
	
	void checkLeap (int yr) {
		
		if(yr%100!=0 && yr%4==0) {
			System.out.println("It is a leap year");
		}
		else if(yr%400==0) {
			System.out.println("It is a leap year");
		}
		else {
			System.out.println("It is not a leap year");
		}
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		Scanner in=new Scanner(System.in);
		while(true) {
			System.out.println("Enter the year: ");
			int year=in.nextInt();
			
			leapYear y1=new leapYear();
			y1.checkLeap(year);
			
		}

	}

}
