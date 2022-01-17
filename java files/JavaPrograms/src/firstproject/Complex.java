package firstproject;

import java.util.Scanner;

public class Complex {

	double real;
	double img;
	
	public Complex(double real, double img) {
		this.real=real;
		this.img=img;
	}
	
	public static void main(String[] args) {
		
		Scanner input=new Scanner(System.in);
		
		double real, img;
		Complex n1=new Complex(0.0, 0.0),
				n2=new Complex(0.0, 0.0), temp;
		
		
		System.out.print("For first complex number,\nEnter real part: ");
		n1.real=input.nextDouble();
		System.out.print("Enter imaginary part: ");
		n1.img=input.nextDouble();
		
		System.out.print("For second complex number,\nEnter real part: ");
		n2.real=input.nextDouble();
		System.out.print("Enter imaginary part: ");
		n2.img=input.nextDouble();
		
		temp=add(n1, n2);
		
		System.out.print("Sum is "+temp.real+"+"+temp.img+"i");
		
	}
	
	public static Complex add(Complex n1, Complex n2) {
		
		Complex ans=new Complex(0.0, 0.0);
		
		ans.real=n1.real+n2.real;
		ans.img=n1.img+n2.img;
		
		return ans;
	}
	
}
