package ASSIGNMENT_1;
import java.util.*;
public class DQ6 {
	public static boolean isOdd(int n) {
		int res=n&1;
		if(res==1) {
			return true;
		}
		else
			return false;
	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("enter a no. : ");
		int n = sc.nextInt();
		if(isOdd(n)) {
			System.out.println(n+" is odd");
		}
		else
			System.out.println(n+" is even");
	}

}
