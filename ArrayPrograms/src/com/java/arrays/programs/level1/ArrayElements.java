package com.java.arrays.programs.level1;

import java.util.Scanner;

public class ArrayElements {
	public static void main(String[] args) {
		Scanner scan=new Scanner(System.in);
		int[] arr=new int[scan.nextInt()];
		System.out.println("Enter array contents: ");
		ArrayElements e1=new ArrayElements();
		int[] a=e1.elementsOfArray(arr);
		for(int x:a)
		{
			System.out.print(x+" ");
		}
	}	

	public int[] elementsOfArray(int[] arr)
	
	{
		Scanner scan=new Scanner(System.in);
		for(int i=0;i<=arr.length-1;i++)
		{
			arr[i]=scan.nextInt();
		}
		System.out.println("Display array elements :");
		return arr;
		
	}
}
	
	


