package com.kodnest.java.programming.level5;

public class ZMirrorPattern {
	public static void main(String[] args) {
			for(int i=1;i<=8;i++)
			{
				for(int j=1;j<=8;j++)
				{
					if(i==1 || i==8 || j==i)
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
