package com.java.arrays.programs.level1;

import java.util.Scanner;

public class ArrayElementsSwapping {
	public static void main(String[] args) {
		Scanner scan=new Scanner(System.in);
		int arr[]=new int[scan.nextInt()];
		System.out.println("Enter the contents of array");
		for(int i=0;i<=arr.length-1;i++)
		{
			arr[i]=scan.nextInt();
		}
		for(int x:arr)
		{
			System.out.print("Before swapping "+x+" ");
		}
		int help;
		help=arr[1];
		arr[1]=arr[2];
		arr[2]=help;
		for(int y:arr)
		{
			System.out.print("After swapping"+y+" ");
		}
		
		
		
	}

}
