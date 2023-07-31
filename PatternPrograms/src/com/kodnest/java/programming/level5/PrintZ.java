package com.kodnest.java.programming.level5;

public class PrintZ {
	public static void main(String[] args) {
		int n=10;
		for(int i=1;i<=n;i++)
		{
			for(int j=1;j<=n;j++)
			{
				if(i==1 || i==n || j==n-i)
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


