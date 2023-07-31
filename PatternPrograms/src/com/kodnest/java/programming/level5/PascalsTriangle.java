package com.kodnest.java.programming.level5;

public class PascalsTriangle {
	public static void main(String[] args) {
		int sum=1,n = 5;   
	    for(int i=0;i<n;i++)
	    {
	        for( int j=1;j<n-i;j++)
	        {
	        	System.out.print(" ");	
	        }
	        for(int k=0;k<=i;k++)
	        {
	            if (k==0||i==0)
	            {
	                sum=1;
	            }
	            else
	            {
	               sum=sum*(i-k+1)/k;
	            }
	            System.out.print(" "+sum);
	        }
	        System.out.println();
	    }     
	}
}


