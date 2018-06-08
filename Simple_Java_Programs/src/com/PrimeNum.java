package com;

import java.util.Scanner;

public class PrimeNum {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan =new Scanner(System.in);
		boolean isPrime = false;
		System.out.println("start num:");
		int start = scan.nextInt();
		System.out.println("end num:");
		int end = scan.nextInt();
		
		for(int i=start ; i<=end ; i++)
		{
			for(int j=2 ; j<i ;j++)
			{
				if(i % j ==0)
				{
					isPrime = false;
					break;
				}
				else
				{
					isPrime = true;
				}
			}
			
			if(i ==2)
			{
				 System.out.print(i+"\t");
			}
			if(isPrime==true)
			{
				System.out.print(i+"\t");
			}
		}

	}

}
