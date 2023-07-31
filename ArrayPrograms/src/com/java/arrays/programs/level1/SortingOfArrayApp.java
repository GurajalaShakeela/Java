package com.java.arrays.programs.level1;

public class SortingOfArrayApp {
	void printArray(int[] arr)
	{
		System.out.println("Forward direction  :");
		for(int x:arr)
		{
			System.out.print(x+" ");
		}
		System.out.println();
		System.out.println("Reverse direction  :");
		for(int i=arr.length-1;i>=0;i--)
		{
			System.out.print(arr[i]+" ");
		}
			
	}


}
