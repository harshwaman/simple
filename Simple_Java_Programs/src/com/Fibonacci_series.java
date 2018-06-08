package com;

import java.util.Scanner;

public class Fibonacci_series {

	public static void main(String[] args) {
		System.out.println("Enter number upto which Fibonacci Series Print: ");
		int number=new Scanner(System.in).nextInt();

		System.out.print("Fibonacci series upto "+number+" numbers: ");
		for(int i=1; i<=number; i++) {
			if(i==1 || i==2) {
				System.out.print(1+" ");
			}
			else {
				int fibo1=1, fibo2=1, fibonacci=1;
				for(int j=3; j<=i; j++) {
					fibonacci=fibo1+fibo2;
					fibo1=fibo2;
					fibo2=fibonacci;
				}

				System.out.print(fibonacci+" ");
			}
		}

	}

}
