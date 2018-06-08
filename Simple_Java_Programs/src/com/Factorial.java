package com;

import java.util.Scanner;

public class Factorial {
	
	public int fact(int n) {
		if(n<2) {
			return 1;
		}
		else {
			return n*fact(n-1);
		}
	}

	public static void main(String[] args) {
		
		Scanner sc= new Scanner(System.in);
		Factorial fc=new Factorial();
		
		System.out.print("Enter number: ");
		int n=sc.nextInt();
		System.out.println("Factorial: "+fc.fact(n));

	}

}
