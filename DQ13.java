package ASSIGNMENT_1;
import java.util.*;
public class DQ13 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("enter the length of array : ");
		int n = sc.nextInt();
		int a[]= new int[n];
		int b[]= new int[n];
		int c[]= new int[n];
		System.out.println("enter the values into array a : ");
		for (int i =0 ; i<n ; i++) {
			a[i]=sc.nextInt();
			
		}System.out.println("enter the values into array b : ");
		for(int i =0 ; i<n ; i++ ) {
			b[i]=sc.nextInt();
		}
		System.out.println("sorted a ");
		for (int i =0 ; i<n-1 ; i++) {
			int min = i;
			for(int j= i+1 ; j < a.length ; j++) {
				if (a[j]<a[min]) {
					min=j;
				}
			
			int temp=a[min];
			a[min]=a[i];
			a[i]=temp;
			}
		}
		for (int i =0 ; i<n ; i++){
			System.out.print(a[i]+" ");
		}System.out.println();
		System.out.println("sorted b ");
		
		for(int i =0 ; i<n ; i++ ) {
			int min=i;
			for(int j =i+1 ; j<b.length ; j++) {
				if(b[j]<b[min]) {
					min=j;
			}
			int temp=b[min];
			b[min]=b[i];
			b[i]=temp;
			}
		}
		for (int i =0 ; i<n ; i++){
			System.out.print(b[i]+" ");
		}System.out.println();
		//Arrays.sort(a); Arrays.sort(b);
		System.out.println("new array ");
		for (int i = 0 ; i<n ; i++) {
			c[i]= a[i]*b[i];
		
			System.out.print(c[i]+" ");
		}
		
	}

}
