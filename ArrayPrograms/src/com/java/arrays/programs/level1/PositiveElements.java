package com.java.arrays.programs.level1;

import java.util.Scanner;

public class PositiveElements {
	public static void main(String[] args) {
		Scanner scan=new Scanner(System.in);
		System.out.println("Enter the length of the array");
		int arr[]=new int[scan.nextInt()];
		System.out.println("Enter the contents of array");
		for(int i=0;i<=arr.length-1;i++)
		{
			arr[i]=scan.nextInt();
		}
		System.out.println("the Content elements are..");
		for(int x:arr)
		{
			if(x>=0)
			{
				System.out.print(x+" ");
			}
		}
		scan.close();
			
	}

}
