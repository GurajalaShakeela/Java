package com.kodnest.java.programming.level5;
public class SandGlassStarProgram {
	public static void main(String[] args) {
		for(int i=8;i>1;i--)
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
	}}
