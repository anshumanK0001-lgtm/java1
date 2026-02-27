package ASSIGNMENT_1;
import java.util.*;
public class DQ9 {
	public static double sumMajorDiagonal(double[][] m) {
		double sum = 0;
		for (int i = 0 ; i<m.length ; i++) {
			for (int j=0 ; j<m.length ; j++) {
				if (i==j) {
					sum+=m[i][j];
				}
			}
		}return sum;
	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("enter the value of n : ");
		int n = sc.nextInt();
		double a[][]=new double[n][n];
		for(int i = 0 ; i<n ; i++) {
			for (int j=0 ; j<n ; j++) {
				a[i][j]=sc.nextDouble();
				
			}
		}
		System.out.println("sum of the elements in the major diagonal is "+sumMajorDiagonal(a));

		
		

	}

}
