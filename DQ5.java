package ASSIGNMENT_1;
import java.util.*;
public class DQ5 {
	public static int sum_Of_Digits(int n) {
		while(n>9) {
			int sum=0;
			while(n>0) {
			int rem=n%10;
			sum=sum+rem;
			n=n/10;
			}	
		n=sum;
			
		}return n;
		/*IT'S ANOTHER LOGIC {USING NESTED IF AND ONE WHILE LOOP}
		 * while(true) {
			int rem=n%10;
			sum=sum+rem;
			n=n/10;
			if (n==0) {
				if(sum<=9) {
					
					break;
				}
				n=sum;
				sum=0;*/
	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("enter a no. : ");
		int num=sc.nextInt();
		System.out.println("the final sum = "+sum_Of_Digits(num));
		
		
	}

}
