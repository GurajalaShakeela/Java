package com.kodnest.java.programming.level5;

public class Rhombus {
	public static void main(String[] args) {
		for(int i=1;i<=8;i++)
		{
			for(int j=1;j<=8-i;j++)
			{
				System.out.print(" ");
			}
			for(int k=1;k<=8;k++)
			{
				if(i==1 || i==8 || k==1 || k==8)
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
