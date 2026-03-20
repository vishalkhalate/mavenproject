package loopday12;

import java.util.Scanner;

public class assgnmentreversenumberusingstringbuilder {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner sc=new Scanner(System.in);
		
		System.out.println("Enter any number:");
		
		int num=sc.nextInt();
		
		StringBuilder sb=new StringBuilder();
		
		sb.append(num);
		
		StringBuilder rev=sb.reverse();
		
		System.out.println("reverse number is:"+rev);

	}

}
