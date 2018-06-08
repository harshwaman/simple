package pattern;

public class Pattern10 {

	public static void main(String[] args) {
	/*	    *
		   ***
		  *****
		 *******
		*********
		 *******
		  *****
		   ***
		    *   */
		int m=0;
		int n=5;
		for(int i=1;i<=9;i++) {
			int a=i<=n?m++:m--;
			for(int j=1;j<=9;j++) {
				if(j>=n+1-m&&j<=n-1+m) {
					System.out.print("*");
				}
				else {
					System.out.print(" ");
				}
			}
			System.out.println();
		}

	}

}
