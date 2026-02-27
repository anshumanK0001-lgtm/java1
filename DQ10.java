package ASSIGNMENT_1;
import java.util.*;
public class DQ10 {
	public static double sumColumn(double[][] m , int columnIndex) {
		double sum=0;
		for(int i = 0; i<m.length ; i++) {
			sum+=m[i][columnIndex];
		}return sum;
	}
	

	public static void main(String[] args) {
		Scanner sc  = new Scanner(System.in);
		System.out.println(" enter a 3-by-4 matrix row by column ");
		double a[][]=new double[3][4];
		for(int i=0 ; i<3; i++) {
			for(int j =0 ; j<4 ; j++) {
				a[i][j]=sc.nextDouble();
			}
		}
		
		for(int j=0 ; j<4 ; j++) {
				System.out.println("sum of the elements at column "+j+" is "+sumColumn(a,j));
		}
		
		
		

	}

}
