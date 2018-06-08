package pattern;

public class Pattern6 {

	public static void main(String[] args) {
		/*
		 1 
		121
	   12321
      1234321
	 123454321
		 */
		int k;
		for(int i=1;i<=5;i++) {
			k=1;
			for(int j=1;j<=9;j++) {
				if(j>=6-i&&j<=4+i) {
				int a=j<5?k++:k--;
					System.out.print(a);
				}
				else {
					System.out.print(" ");
				}
			}
			System.out.println();
		}

	}

}
