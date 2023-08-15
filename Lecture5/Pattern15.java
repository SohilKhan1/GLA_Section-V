package Lecture5;

public class Pattern15 {
	public static void main(String[] args) {
		int n = 5;

		int nst = n;
		int nsp = 0;
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
				nst--;
				nsp += 2;
			} else {
				nst++;
				nsp -= 2;
			}

			System.out.println();
			row++;
		}

	}

}
