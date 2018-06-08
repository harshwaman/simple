package com;

import java.util.Scanner;

public class Prime_number {
	
	public static void main(String[] args) {
		
		Scanner sc= new Scanner(System.in);
		System.out.println("Enter number upto which Prime number Print: ");
		
		int number=sc.nextInt();
		
		System.out.print("Prime number upto "+number+" numbers: ");
		for(int i=2; i<=number; i++) {
			if(i==2||i==3) {
				System.out.print(i+" ");
			}
			else if((i*i-1)%24==0) {
	
				System.out.print(i+" ");
			}
		}
	}

}
