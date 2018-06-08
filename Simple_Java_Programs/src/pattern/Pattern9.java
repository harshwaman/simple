package pattern;

public class Pattern9 {

	public static void main(String[] args) {
	  /*ABCDCBA
		ABC CBA
		AB   BA
		A     A*/
		
		int i,j;
		char k;
		for(i=1;i<=4;i++) {
			k='A';
			for(j=1;j<=7;j++) {
				if(j<=5-i||j>=3+i) {
					char a=j<4?k++:k--;
					System.out.print(a);
				}
				else {
					System.out.print(" ");
					if(j==4)
						k--;
				}
			}
			System.out.println();
		}

	}

}
