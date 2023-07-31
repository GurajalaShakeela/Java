package com.java.arrays.programs.level1;

import java.util.Scanner;

public class AdditionOfArray {
	public static void main(String[] args) {
		Scanner scan=new Scanner(System.in);
		int[] arr=new int[scan.nextInt()];
		System.out.println("Enter array contents: ");
		for(int i=0;i<=arr.length-1;i++)
		{
			arr[i]=scan.nextInt();
		}
		System.out.println("Display array contents are :");
		for(int a:arr)
		{
			System.out.print((a+5)+" ");
		}
		scan.close();
	}

}
