package com.kodnest.java.programming.level5;

public class Pentagon {
	public static void main(String[] args) {
		for(int i=1;i<=8;i++)
		{
			for(int j=1;j<=8-i;j++)
			{
				System.out.print(" ");
			}
			for(int k=1;k<=2*i-1;k++)
			{
				System.out.print("*");
			}
			System.out.println();
		}
		for(int i=7;i>=4;i--)
		{
			for(int j=8-i;j>0;j--)
			{
				System.out.print(" ");
			}
			for(int k=1;k<=i;k++)
			{
				System.out.print("*");
			}
			for(int l=1;l<i;l++)
			{
				System.out.print("*");
			}
			System.out.println();
		}
	}

}
