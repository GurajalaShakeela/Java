package com.java.alphabetic.patterns;

public class AlphabeticPattern5 {
	public static void main(String[] args) {
		char ch='A';
		for(int i=1;i<=8;i++)
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
			ch++;
			System.out.println();
		}
	}

}
