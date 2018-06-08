package pattern;

public class Pattern11 {

	public static void main(String[] args) {
		/* 1
		  212
		 32123
		4321234
		 32123
		  212
		   1  */

		int n=4,k=1, m=0;
		for(int i=1;i<=7;i++) {
			int a=i<=n?m++:m--;
			int b=i<n?k++:k--;
			for(int j=1;j<=7;j++) {
				if(j>=n+1-m&&j<=n-1+m) {
					int c=j>=n?b++:b--;	
					System.out.print(c);
				}
				else {
					System.out.print(" ");
				}
			}
			System.out.println();
		}

	}


}
