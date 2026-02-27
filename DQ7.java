package ASSIGNMENT_1;
import java.util.*;
public class DQ7 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("enter no. of elements of array : ");
		int n = sc.nextInt();
		int a[]= new int[n];
		System.out.println("enter elements of the array : ");
		for (int i =0 ; i< a.length;i++) {
			a[i]=sc.nextInt();
		}
		int min=0;
		for (int i=0; i<a.length;i++) {
			if (a[i]<=a[min]) {
				min=i;
			}
		}
		int minp=min+1;
		int max=0;
		for (int i=0; i<a.length;i++) {
			if (a[i]>a[max]) {
				max=i;
			}
		}
		int maxp=max+1;
		int countmin= 0,countmax=0;
		for (int i=0; i<a.length;i++) {
		if(a[min]==a[i]) {
			countmin++;
		}
		}
		for (int i=0; i<a.length;i++) {
			if(a[max]==a[i]) {
				countmax++;
				
		}
		}
		System.out.println("maximum element of the array is "+a[max]+" and occurs "+countmax+" times");
		System.out.println("minimum element of the array is "+a[min]+" and occurs "+countmin+" times");
		System.out.println("first occurrence of maximum element is at position "+maxp);
		System.out.println("last occurrence of minimum element is at position "+minp);

	}

}
