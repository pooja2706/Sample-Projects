package beginnerProgram;

import java.util.Scanner;

public class fibonacciSeries {
	
	void fibonacci(int num) {
		int n1=0, n2=1, n3;
		System.out.println(n1+"\n"+n2);
		for(int i=2; i<num; i++) {
			n3=n1+n2;
			System.out.println(n3);
			n1=n2;
			n2=n3;
		}
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner in=new Scanner(System.in);
		
		while(true) {
			System.out.println("Enter the number of terms of series: ");
			int upper=in.nextInt();
			fibonacciSeries f1=new fibonacciSeries();
			f1.fibonacci(upper);
		}

	}

}
