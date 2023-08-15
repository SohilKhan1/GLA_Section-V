package Lecture4;

public class Pattern9 {
	public static void main(String[] args) {
		int n = 5;

		int nst = 1;
		int nsp = n-1;
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
			nst = nst + 2;
			nsp = nsp - 1;
			row++;
		}

	}

}
