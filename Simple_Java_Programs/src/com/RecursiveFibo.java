package com;

import java.util.Scanner;

public class RecursiveFibo {
	
	public int fibo(int n) {
		
		if(n==1) {
			return 1;
		}
		else if(n==2) {
			return 1;
		}
		else {
			return fibo(n-2)+fibo(n-1);
		}
		
	}

	public static void main(String[] args) {
		System.out.println("Enter number upto which Fibonacci Series Print: ");
		int number=new Scanner(System.in).nextInt();
		RecursiveFibo rfibo=new RecursiveFibo();

		System.out.print("Fibonacci series upto "+number+" numbers: ");
		
		for (int i = 1; i <=number ; i++) {
			
			System.out.print(rfibo.fibo(i)+" ");
			
		}
	}

}
