package com.java.arrays.programs.level1;

import java.util.Scanner;

public class SwappingOfTwoNumbers {
	public static void main(String[] args) {
		Scanner scan=new Scanner(System.in);
		int a=scan.nextInt();
		int b=scan.nextInt();
		int temp;
		System.out.println("Before swapping"+a+" "+b);
		temp=a;
		a=b;
		b=temp;
		System.out.println("After swapping"+a+" "+b);
	}

}
