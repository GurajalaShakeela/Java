package com.kodnest.java.programming.level5;
public class Hexagon1 {
	public static void main(String[] args) {
		for(int i=4;i<=8;i++)
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
