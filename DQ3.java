package ASSIGNMENT_1;
import java.util.*;
public class DQ3 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("enter a no. : ");
		int n= sc.nextInt();
		int n1=n;
		int sum=0, pro=1;
		while(n>0) {
			int rem=n%10;
			sum=sum+rem;
			pro=pro*rem;
			n=n/10;
			
		}if(sum==pro) {
			System.out.println(n1+" is a spy no.");
			
		}else
			System.out.println(n1+" is not a spy no.");
		
		
		
		

	}

}
