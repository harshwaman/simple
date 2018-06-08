package pattern;

public class Pattern12 {

	public static void main(String[] args) {
	/*	  A
	     B B
	    C   C
	   D     D
	  E       E
	 F         F
	G           G
	 F         F
	  E       E
	   D     D
	    C   C
	     B B
	      A*/
		int n=7,m=0;
		char c='A';
		for(int i=1;i<=13;i++) {
			int a=i<=7?m++:m--;
			char l=i<7?c++:c--;
			for(int j=1;j<=13;j++) {
				if(j==n+1-m||j==n-1+m) {
					System.out.print(l);
				}
				else {
					System.out.print(" ");
				}
			}
			System.out.println();
		}

	}

}
