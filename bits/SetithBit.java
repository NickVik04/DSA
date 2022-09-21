package bits;

import java.util.Scanner;

public class SetithBit {

	public static void main(String args[]) {
		
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the number");
		int n=sc.nextInt();
		
		System.out.println("Enter the postition to set bit");
		int i=sc.nextInt();
	
			
		
		int mask=1<<i;
		
		System.out.println(n|mask);
		
	}
}
