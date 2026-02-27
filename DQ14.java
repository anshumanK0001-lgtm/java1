package ASSIGNMENT_1;
import java.util.*;
public class DQ14 {
	public static double[][] addMatrix(double[][] a , double[][] b){
		double [][]c = new double[a.length][a[0].length];
		if (a.length!=b.length || a[0].length!=b[0].length) {
			 return null;
		}
		for(int i = 0 ; i<a.length ; i++) {
			for(int j=0 ; j<a[0].length ; j++) {
				c[i][j]=a[i][j]+b[i][j];
			}
		}return c;
		
	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("enter the length of the row and column ");
		int r = sc.nextInt();
		int c = sc.nextInt();
		double a[][]= new double[r][c];
		double b[][]= new double[r][c];
		
		System.out.println("enter matrix a : ");
		for(int i = 0 ; i<a.length ; i++) {
			for(int j=0 ; j<a[0].length ; j++) {
				a[i][j]=sc.nextDouble();
			}
		}
		System.out.println("enter matrix b : ");
		for(int i = 0 ; i<a.length ; i++) {
			for(int j=0 ; j<a[0].length ; j++) {
				b[i][j]=sc.nextDouble();
			}
		}
		double [][]sum=addMatrix(a,b);
		System.out.println("display of the added matrix ");
		for(int i =0 ; i<r ; i++) {
			for(int j = 0 ; j<c ; j++) {
				System.out.print(sum[i][j]+" ");
			}
			System.out.println();
		}
		
	}

}
