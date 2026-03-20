package loopday12;

import java.util.Scanner;

public class assignmentreversenumberusingmodule {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter any number:");
		
		int num = sc.nextInt();
		int rev = 0;
		
		while(num != 0)
		{
			int rem = num % 10;     // get last digit
			rev = rev * 10 + rem;  // build reverse number
			num = num / 10;        // remove last digit
		}
		
		System.out.println("Reverse number is: " + rev);
	}
}