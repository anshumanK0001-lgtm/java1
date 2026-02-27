package ASSIGNMENT_1;
import java.util.*;
public class DQ8 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("enter no. of rows and columns of 2D-array : ");
		int m=sc.nextInt();
		int n=sc.nextInt();
		int [][]a= new int[m][n];
		for (int i =0; i<m;i++) {
			for(int j=0; j<n ; j++) {
				a[i][j]=sc.nextInt();
				
			}
		}
		for (int i=0 ; i<m ; i++) {
			for(int j=0 ; j<n ; j++) {
				System.out.print(a[i][j]+" ");
			}
			System.out.println();
		}
		int sum=0;
		for(int i =0 ; i<m ; i++) {
			for(int j=0 ; j<n ; j++) {
				sum+=a[i][j];
			}
		}System.out.println("the sum of elements of the 2D-array is "+sum);
		
		

	}
}
