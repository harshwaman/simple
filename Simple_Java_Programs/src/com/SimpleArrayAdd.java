package com;

public class SimpleArrayAdd {

	public static void main(String[] args) {
		
		int arr []= {12,23,34,45,10,6,9,7};
		
		for(int i=0;i<=arr.length-1;i++) {
			for(int j=1;j<=arr.length-1;j++){
				int a=arr[i]+arr[j];
				if(a==16) {
					System.out.println(arr[i]+" and "+arr[j]);
				}
			}
			
		}
	}

}
