 package bits;

import java.util.Scanner;

public class ClearithBit {

	public static void main(String args[]) {
		
		Scanner sc=new Scanner(System.in);
		
		System.out.println("Enter a number");
		int n=sc.nextInt();
		
		System.out.println("Enter the postion to clear");
				int i =sc.nextInt();
				
				int mask=1<<i;
				
				System.out.println(~(mask)&n);

				//I am herex
	}
}
