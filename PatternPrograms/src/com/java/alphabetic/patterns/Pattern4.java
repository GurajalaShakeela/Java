package com.java.alphabetic.patterns;

public class Pattern4 {
	public static void main(String[] args) {
		char ch='A';
		for(int i=1;i<=7;i++)
		{
			for(int j=1;j<=7;j++)
			{
				if(j==1 || j==7 || i==j )
				{
				System.out.print(ch);
				ch++;
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
