package ASSIGNMENT_1;
import java.util.*;
public class DQ11 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		        // Input three integers
		        System.out.print("Enter a: ");
		        int a = sc.nextInt();

		        System.out.print("Enter b: ");
		        int b = sc.nextInt();

		        System.out.print("Enter c: ");
		        int c = sc.nextInt();

		        boolean valid = false;

		        // Check: a + b = c
		        if (a + b == c) {
		            System.out.println("Valid Formula: a + b = c");
		            valid = true;
		        }

		        // Check: a - b = c
		        if (a - b == c) {
		            System.out.println("Valid Formula: a - b = c");
		            valid = true;
		        }

		        // Check: a * b = c
		        if (a * b == c) {
		            System.out.println("Valid Formula: a * b = c");
		            valid = true;
		        }

		        // Check: a / b = c (only if b != 0 and divisible)
		        if (b != 0 && a / b == c && a % b == 0) {
		            System.out.println("Valid Formula: a / b = c");
		            valid = true;
		        }

		        // Check: a = b + c
		        if (b + c == a) {
		            System.out.println("Valid Formula: a = b + c");
		            valid = true;
		        }

		        // Check: a = b - c
		        if (b - c == a) {
		            System.out.println("Valid Formula: a = b - c");
		            valid = true;
		        }

		        // Check: a = b * c
		        if (b * c == a) {
		            System.out.println("Valid Formula: a = b * c");
		            valid = true;
		        }

		        // Check: a = b / c (only if c != 0 and divisible)
		        if (c != 0 && b / c == a && b % c == 0) {
		            System.out.println("Valid Formula: a = b / c");
		            valid = true;
		        }

		        // If no valid equation found
		        if (!valid) {
		            System.out.println("No valid arithmetic formula can be formed.");
		        }
		    
		


	}

}
