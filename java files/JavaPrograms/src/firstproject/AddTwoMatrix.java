package firstproject;

import java.util.Scanner;

public class AddTwoMatrix {

	public static void main(String[] args) {
		
		Scanner input=new Scanner(System.in);
		while(true) {
		System.out.print("Enter the number of rows: ");
		int row=input.nextInt(); 
		
		System.out.print("Enter the number of columns: ");
		int column=input.nextInt();
		
		int[][] a=new int[row][column];
		int[][] b=new int[row][column];
		int[][] sum=new int[row][column];
		int i, j;
		
		System.out.println("Enter the elements of first matrix");
		for(i=0; i<row; i++) {
			for(j=0; j<column; j++) {
				
				a[i][j]=input.nextInt();
			}
		}
		
		System.out.println("Enter elements of second matrix");
			for(i=0; i<row; i++) {
				for(j=0; j<column; j++) {
					
					b[i][j]=input.nextInt();
				}	
		}
		
			for(i=0; i<row; i++) {
				for(j=0; j<column; j++) {
					
					sum[i][j]=a[i][j]+b[i][j];
				}
			}
			
			System.out.println("The sum of both matrices is");
			for(i=0; i<row; i++) {
				for(j=0; j<column; j++) {
					System.out.print(sum[i][j]+"\t");
				}
				System.out.print("\n");
				
			}
			input.close();
		}

		
			}
}
