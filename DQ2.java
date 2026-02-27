package ASSIGNMENT_1;
import java.util.*;
public class DQ2 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("enter your body weight in kg : ");
		double w = sc.nextDouble();
		System.out.println("enter your height in meter : ");
		double h = sc.nextDouble();
		double bmi=w/(h*h);
		if(bmi<18.5) {
			System.out.println("the person is underweight");
		}
		else if (bmi<24.9) {
			System.out.println("the person normal weight");
		}
		else if (bmi<29.9) {
			System.out.println("the person is overweight");
		}
		else {
			System.out.println("the person is obese");
		}
		
		
	}

}
