package com;

import java.util.Scanner;

public class StringPlindrom {

	public static void main(String[] args) {
		
		Scanner sc=new Scanner(System.in);
		System.out.print("Enter String: ");
		
		String st=sc.nextLine();
		String b="";
		
		int n=st.length();
		for(int i=n-1; i>=0;i--) {
			
			b=b+st.charAt(i);
		}
		
		if(st.equals(b)) {
			System.out.println(st+" is palindrom");
		}
		else {
			System.out.println(st+" is not palindrom");
		}

	}

}
