package com.java.alphabetic.patterns;

public class AlphabeticPattern6 {
	public static void main(String[] args) {
		char ch='H';
		for(int i=8;i>=1;i--)
		{
			for(int j=1;j<=8;j++)
			{
				if(j==1 || j==i || i==8)
				{
					System.out.print(ch);	
				}
				else
				{
					System.out.print(" ");
				}
			}
			ch--;
			System.out.println();
		}
	}
}
