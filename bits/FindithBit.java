package bits;

import java.util.Scanner;

public class FindithBit {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		
		System.out.println("Enter a number");
		int n =sc.nextInt();
		System.out.println("Enter the position");
		int i=sc.nextInt();
		
		int mask=1<<i;
		
		if((mask&n)==0) {
			System.out.println(0);
		}
		
		else
			System.out.println(1);
	

	}

}
