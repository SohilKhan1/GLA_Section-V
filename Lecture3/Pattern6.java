package Lecture3;

public class Pattern6 {
	public static void main(String[] args) {
		int n = 5;

		int nst = n;
		int nsp = 0;
		int row = 1;
		while (row <= n) {

			// Space
			for (int i = 1; i <= nsp; i++) {
				System.out.print("  ");
			}

			// Star
			for (int i = 1; i <= nst; i++) {
				System.out.print("* ");
			}

			System.out.println();
			nst = nst - 1;
			nsp = nsp + 2;
			row++;
		}

	}

}
