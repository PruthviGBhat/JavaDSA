import java.util.*;
public class MatrixMultiplication{
	public static void main(String[] args) {
	    Scanner sc = new Scanner(System.in);
	    System.out.println("Enter no of rows and columns");
		int n1=sc.nextInt();
		int m1=sc.nextInt();
		int n2=sc.nextInt();
		int m2=sc.nextInt();
		int firstmatrix[][] = new int[n1][m1];
		int secondmatrix[][] = new int[n2][m2];
		
		System.out.println("Enter the firstmatrix");
		for(int i=0;i<firstmatrix.length;i++){
		    for(int j=0;j<firstmatrix[0].length;j++){
		        firstmatrix[i][j]=sc.nextInt();
		    }
		}
			System.out.println("Enter the secondmatrix");
		for(int i=0;i<secondmatrix.length;i++){
		    for(int j=0;j<secondmatrix[0].length;j++){
		        secondmatrix[i][j]=sc.nextInt();
		    }
		}
		if(m1!=n2){
		    System.out.println("Invalid input");
		    return;
		}
		int product[][]=new int[n1][m2];
		for(int i=0;i<product.length;i++){
		    for(int j=0;j<product[0].length;j++){
		        for(int k=0;k<n1;k++){
		            product[i][j]=product[i][j]+firstmatrix[i][k]*secondmatrix[k][j];
		        }
		    }
		}
		for(int i=0;i<product.length;i++){
		    for(int j=0;j<product[0].length;j++){
		        System.out.print(product[i][j]+" ");
		    }
		    System.out.println();
		}
	}
}