package loopday12;

import java.util.Scanner;

public class assignmentrevesenumberusingstringbuffer {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		Scanner sc=new Scanner(System.in);
		
		System.out.println("enter any number");
		
		int num=sc.nextInt();
		
		StringBuffer sb=new StringBuffer(String.valueOf(num));
		
		StringBuffer rev=sb.reverse();
		
		System.out.println("Reverse number is:"+rev);

	}

	}


