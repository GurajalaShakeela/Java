package com.kodnest.java.programming.level5;

public class CrossPattern {
	public static void main(String[] args) {
		for(int i=1;i<=10;i++)
		{
			for(int j=1;j<=12;j++)
			{
				if(j==i || i+j==12-1)
				{
					System.out.print("*");
				}
				else
				{
					System.out.print(" ");
				}
			}
			
			System.out.println();
		}	
	}
}
