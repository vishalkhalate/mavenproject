package javaarray;

import java.util.Scanner;

public class arraylogic {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int a[]= {5,10,3,2,7};
		
		Scanner sc=new Scanner(System.in);
		
		System.out.println("enter search value:");
		
		int search=sc.nextInt();
		
		
		for (int i=0;i<=a.length-1;i++)
		{
			if (a[i]==search) 
			{
				System.out.println("Element found");
				break;
			}

		}
		

	}

}
