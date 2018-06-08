package pattern;

public class Pattern8 {

	public static void main(String[] args) {
		
	/*   1
		1 1
	   1 2 1
	  1 3 3 1
	 1 4 6 4 1  */
		 
		
		int i,j,k,p;
		for(i=1;i<=5;i++) {
			k=1;
			p=1;
			for(j=1;j<=9;j++) {
				if(j<=4+i&&j>=6-i&&k==1) {
					System.out.print(p);
					k=0;
				}
				else {
					System.out.print(" ");
					k=1;
				}
			}
			System.out.println();
			
		}

	}
	
	/*public static void main(String[] args) {
		 
        int n = 5;
 
        for (int i = 0; i < n; i++) {
            int number = 1;
            System.out.printf("%" + (n - i) * 2 + "s", "");
            for (int j = 0; j <= i; j++) {
                System.out.printf("%4d", number);
                number = number * (i - j) / (j + 1);
            }
            System.out.println();
        }
 
    }*/

}
