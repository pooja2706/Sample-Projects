package firstproject;

import java.util.Scanner;
public class MultiplyTwoMatrixByPassingFunction {

	public static void main(String[] args) {
		
		Scanner input=new Scanner(System.in);
		
		System.out.println("For 1st matrix,");
		
		System.out.print("Enter the number of rows: ");
		int row1=input.nextInt();
		
		System.out.print("Enter the number of columns: ");
		int col1=input.nextInt();
		
		System.out.println("For 2nd matrix,");
		
		System.out.print("Enter the number of rows: ");
		int row2=input.nextInt();
		
		System.out.print("Enter the number of columns: ");
		int col2=input.nextInt();
		
		if(col1!=row2) {
			System.out.print("Column of 1st matrix should be equal to row of 2nd matrix.");
		}
		
		
		int[][] a=new int[row1][col1];
		int[][] b=new int[row2][col2];
		int i,j;
		
		System.out.println("Enter elements of 1st matrix: ");
		for(i=0; i<row1; i++) {
			
			for(j=0; j<col1; j++) {
				a[i][j]=input.nextInt();
			}
		}
		
		System.out.println("Enter elements of 2nd matrix: ");
        for(i=0; i<row2; i++) {
			
			for(j=0; j<col2; j++) {
				b[i][j]=input.nextInt();
			}
		}
        int[][] product= new int[row1][col2];
        product=multiply(a, b, row1, row2, col1, col2);
        
        displayProduct(product, row1, col2);
        
		
	}
	
	public static int[][] multiply(int[][] a, int[][] b, int r1, int r2, int c1, int c2) {
		
		int[][] product=new int[r1][c2];
		for(int i=0; i<r1; i++) {
			for(int j=0; j<c2; j++) {
				product[i][j]=0;
				for(int k=0; k<r2; k++) {
					product[i][j]+=a[i][k]*b[k][j];
				}
			}
		}
		return product;
		
	}
	
	public static void displayProduct(int[][] p, int r1, int c2){
		for(int i=0; i<r1; i++) {
			for(int j=0; j<c2; j++) {
				System.out.print(p[i][j]+"\t");
			}System.out.println();
		}
	}
}
