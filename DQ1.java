package ASSIGNMENT_1;
import java.util.*;
public class DQ1 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("enter a no. greater than 2 : ");
		//int n = sc.nextInt();
		int n =Integer.parseInt(args[0]);
		int n1=n;
		int count=0;
		while(n>2) {
			n=n/2;
			count++;
		}
		System.out.println(n1+" is repeatedly divided by two "+count +" times");
		
		
		

	}

}
