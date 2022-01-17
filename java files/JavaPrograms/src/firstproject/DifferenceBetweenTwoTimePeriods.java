package firstproject;

import java.util.Scanner;

public class DifferenceBetweenTwoTimePeriods {

	int hr, min, sec;
	
	public DifferenceBetweenTwoTimePeriods(int hr, int min, int sec) {
		this.hr=hr;
		this.min=min;
		this.sec=sec;
	}
	
	public static void main(String[] args) {
		
		Scanner input=new Scanner(System.in);
		
		
		DifferenceBetweenTwoTimePeriods start=new DifferenceBetweenTwoTimePeriods(0, 0, 0), stop=new DifferenceBetweenTwoTimePeriods(0, 0, 0), diff;
		
		System.out.print("Starting time,\nHour: ");
		start.hr=input.nextInt();
		System.out.print("Minute: ");
		start.min=input.nextInt();
		System.out.print("Seconds: ");
		start.sec=input.nextInt();
		
		System.out.print("Stopping time,\nHour: ");
		stop.hr=input.nextInt();
		System.out.print("Minute: ");
		stop.min=input.nextInt();
		System.out.print("Seconds: ");
		stop.sec=input.nextInt();
		
		diff=difference(start, stop);
		
		System.out.print("The difference is "+diff.hr+"hr"+diff.min+"min"+diff.sec+"sec");
	}
	
	public static DifferenceBetweenTwoTimePeriods difference(DifferenceBetweenTwoTimePeriods start, DifferenceBetweenTwoTimePeriods stop) {
		
		DifferenceBetweenTwoTimePeriods diff=new DifferenceBetweenTwoTimePeriods(0, 0, 0);
		
		diff.hr=stop.hr-start.hr;
		diff.min=stop.min-start.min;
		diff.sec=stop.sec-start.sec;
		
		if(diff.min<0) {
			diff.hr--;;
			diff.min+=60;
		}
		if(diff.sec<0) {
			diff.min--;;
			diff.sec+=60;
		}
		return diff;
	}
}
