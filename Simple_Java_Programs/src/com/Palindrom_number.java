package com;

import java.util.Scanner;

public class Palindrom_number {

	public static void main(String[] args) {
		
		Scanner sc= new Scanner(System.in);
		
		System.out.print("Enter number: ");
		
		int number=sc.nextInt();
		int palindrom=number;
		int reverse=0;
		
		while(palindrom!= 0) {
			int reminder=palindrom%10;
			reverse = reverse*10+reminder;
			palindrom=palindrom/10;
			
		}
		
		if(number==reverse) {
			System.out.println(number+" is palindrom number.");
		}
		else {
			System.out.println(number+" is not paluindrom number.");
		}

	}

}
