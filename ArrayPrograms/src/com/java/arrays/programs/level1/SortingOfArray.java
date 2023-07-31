package com.java.arrays.programs.level1;

import java.util.Scanner;

public class SortingOfArray {
	public static void main(String[] args) {
		Scanner scan=new Scanner(System.in);
		int arr[]=new int[scan.nextInt()];
		System.out.println("Enter the contents of array");
		for(int i=0;i<=arr.length-1;i++)
		{
			arr[i]=scan.nextInt();
		}
		SortingOfArrayApp p=new SortingOfArrayApp();
		p.printArray(arr);
	}
	
}
