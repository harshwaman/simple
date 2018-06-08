package pattern;

public class Pattern1 {

	public static void main(String[] args) {
		
	/*	1 
		2 3 
		4 5 6 
		7 8 9 10 
		11 12 13 14 15*/
		
		int i,j,k=1;
		
		for(i=1;i<=5;i++) {
			for(j=1;j<i+1;j++){
				System.out.print(k++ +" ");
			}
			System.out.println();
		}
		
		//the line below this given an output
		//\u000d System.out.println("comment executed");
	}

}
