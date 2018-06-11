package com;

public class BubbleSort {

	public static void main(String[] args) {
		/*int num=567;
		while(num>0) {
			System.out.print(num%10);
			num=num/10;
		}*/
		int [] arr= {1,6,3,7,9,4,8,2,5};
		int swap;
		for(int i=0;i<arr.length-1;i++) {
			for(int j=0;j<arr.length-i-1;j++) {

				if(arr[j]>arr[j+1]) {
					swap = arr[j];
					arr[j] = arr[j+1];
					arr[j+1] = swap;
				}
			}
		}

		for(int i=0;i<arr.length;i++) {
			System.out.print(arr[i]);
		}

	}

}
