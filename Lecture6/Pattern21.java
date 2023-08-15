package Lecture6;

public class Pattern21 {
	public static void main(String[] args) {
		int n = 5;

		int nst = 1;
		int nsp = (2 * n) - 3;
		int row = 1;
		while (row <= n) {
			// Star
			for (int i = 1; i <= nst; i++) {
				System.out.print("* ");
			}

			// Space
			for (int i = 1; i <= nsp; i++) {
				System.out.print("  ");
			}

			// Star
			if (row == n) {
				nst = nst - 1;
			}
			for (int i = 1; i <= nst; i++) {
				System.out.print("* ");
			}

			nst++;
			nsp -= 2;

			System.out.println();
			row++;
		}

	}

}
