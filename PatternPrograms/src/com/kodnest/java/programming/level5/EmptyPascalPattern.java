package com.kodnest.java.programming.level5;

public class EmptyPascalPattern {
	public static void main(String[] args) {
		int n = 5;
        for(int i=n;i>=1;i--)
        {
            for(int j=1;j<=i;j++) 
            {
                if(j==1 || j==i || i==n) 
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
        for(int i=2;i<=n;i++) 
        {
            for(int j=1;j<=i;j++) 
            {
                if(j==1 || j==i || i==n)
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


