package ASSIGNMENT_1;
import java.util.*;
public class DQ12 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("enter lines (enter STOP to end) :");
		String lines[]= new String[1000]; int count=0;
		while(true) {
			String line = sc.nextLine();
			if (line.equals("STOP")) {
				break;
			}
			lines[count]=line;
			count++;
		}
		System.out.println("\nLines in Reverse Order:");

		for(int i = count-1 ; i>=0 ; i--) {
			System.out.println(lines[i]);
		}

	}

}
