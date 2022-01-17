package firstproject;

import java.util.Scanner;
public class MultiplyingTwoMatrix {
	public static void main(String[] args) {
		
		Scanner input=new Scanner(System.in);
		while(true) {
		System.out.print("Enter the number of rows of first matrix: ");
		int row1=input.nextInt();
		
		System.out.print("Enter the number of columns of first matrix: ");
		int col1=input.nextInt();
		
		System.out.print("Enter the number of rows of second matrix: ");
		int row2=input.nextInt();
		
		System.out.print("Enter the number of columns of second matrix: ");
		int col2=input.nextInt();
		
		if(col1!=row2) {
			System.out.print("Enter the matrix whose number of columns matches with second matrix's number of rows");
		}
		
		int[][] a=new int[row1][col2];
		int[][] b=new int[row1][col2];
		int i,j;
		
		System.out.println("Enter the elements of the first matrix: ");
		for(i=0; i<row1; i++) {
			for(j=0; j<col1; j++) {
				a[i][j]=input.nextInt();
			}
		}
		
		System.out.println("Enter the elements of second matrix: ");
		for(i=0; i<row2; i++) {
			for(j=0; j<col2; j++) {
				b[i][j]=input.nextInt();
			}
		}
		
		for(i=0; i<row1; i++) {
			
			for(j=0; j<col2; j++) {
				int sum=0;
				
				for(int k=0; k<row2; k++ ) {
					sum+=a[i][k]*b[k][j];	
				}
				
				System.out.print(sum+"\t");
			}
			System.out.print("\n");
		}
	}
	}
}
