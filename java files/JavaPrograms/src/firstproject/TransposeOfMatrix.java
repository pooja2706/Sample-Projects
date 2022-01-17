package firstproject;

import java.util.Scanner;

public class TransposeOfMatrix {

	public static void main(String[] args) {
	
		Scanner input=new Scanner(System.in);
		
		System.out.print("Enter the number of rows: ");
		int row=input.nextInt();
		
		System.out.print("Enter the number of columns: ");
		int col=input.nextInt();
		
		int[][] a= new int[row][col];
		
		for(int i=0; i<row; i++) {
			
			for(int j=0; j<col; j++){
				a[i][j]=input.nextInt();
				
				}
			}
		
		for(int i=0; i<col; i++) {
			for(int j=0; j<row; j++) {
				System.out.print(a[j][i]+"\t");
			}System.out.println();
		}
		input.close();

	}
}
