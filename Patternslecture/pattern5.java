package Patternslecture;

import java.util.Scanner;

public class pattern5 {

	public static void main(String[] args) {
		Scanner scn = new Scanner(System.in);
		int n = scn.nextInt();

		int nst = 1;
		int row = 1;
		while (row <= n) {

			int cst = 1;
			while (cst <= nst) {
				System.out.print("*");
				cst = cst + 1;

			}
			System.out.println();
			nst = nst + 1;
			row++;

		}
		int nst1 = n-1;
		int row1 = 1;
		while (row1 <= n - 1) {

			int cst1 = 1;
			while (cst1 <= nst1) {
				System.out.print("*");
				cst1 = cst1 + 1;

			}
			System.out.println();
			nst1 = nst1 - 1;
			row1++;

		}
	}

}
