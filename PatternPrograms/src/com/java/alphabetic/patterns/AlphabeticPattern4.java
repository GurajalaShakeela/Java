package com.java.alphabetic.patterns;

public class AlphabeticPattern4 {
	public static void main(String[] args) {
		for(int i=8;i>=1;i--)
		{
			char ch='H';
			for(int j=8;j>=i;j--)
			{
				System.out.print(ch);
				ch--;
			}
			System.out.println();
		}
	}

}
