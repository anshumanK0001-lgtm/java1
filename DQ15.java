package ASSIGNMENT_1;
import java.util.*;
public class DQ15 {

	public static void main(String[] args) {
		Random rand = new Random();
		int a[][]=new int[4][4];
		for (int i = 0; i<4 ; i++) {
			for(int j =0 ; j<4 ; j++) {
				a[i][j]=rand.nextInt(2)+0;
			}
		}
		for (int i = 0; i<4 ; i++) {
			for(int j =0 ; j<4 ; j++) {
				System.out.print(a[i][j]+" ");
			}System.out.println();
		}
		
		int   count1=0 , row=0 , col = 0;
		for(int i =0 ; i<4 ; i++) {
			int count = 0;
			for(int j=0 ; j<4 ; j++) {
				if(a[i][j]==1)
					count++;
			}
			if (count>count1) {
				row=i;
				count1=count;
			}
		}int  c1=0;
		for(int i =0 ; i<4 ; i++) {
			int c=0;
			for(int j=0 ; j<4 ; j++) {
				if(a[j][i]==1)
					c++;
			}
			if (c>c1) {
				col=i;
				c1=c;
			}
		}
		System.out.println("the largest row index : "+row);
		System.out.println("the largest column index : "+col);
		

	}

}
