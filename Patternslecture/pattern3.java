package Patternslecture;

import java.util.Scanner;

public class pattern3 {

	public static void main(String[] args) {
		Scanner scn = new Scanner(System.in);
		int n = scn.nextInt();
		
	int nsp = n-1;
	int nst = 1;
		int row=1;
				while(row<=n) {
					int csp = 1;
					while(csp<=nsp) {
						System.out.print(" ");
						csp++;}
						int cst = 1;
						while(cst<=nst) {
							System.out.print("*");
							cst = cst +1;
					}
						System.out.println();
						
						nsp=nsp-1;
						nst=nst+1;
						row++;
		
			
	}
				

}
}