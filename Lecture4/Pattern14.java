package Lecture4;

public class Pattern14 {
	public static void main(String[] args) {
		int n = 5;

		int nst = 1;
		int nsp = n - 1;
		int row = 1;
		int trow = (2 * n) - 1;
		while (row <= trow) {

			// Space
			for (int i = 1; i <= nsp; i++) {
				System.out.print("  ");
			}

			// Star
			for (int i = 1; i <= nst; i++) {
				System.out.print("* ");
			}

			if (row < n) {
				nst++;
				nsp--;
			} else {
				nst--;
				nsp++;
			}

			System.out.println();
			row++;
		}

	}

}
