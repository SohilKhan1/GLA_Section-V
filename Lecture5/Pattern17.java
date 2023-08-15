package Lecture5;

public class Pattern17 {
	public static void main(String[] args) {
		int n = 7;

		int nst = 1;
		int nsp = n / 2;
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

			if (row <= n / 2) {
				nst += 2;
				nsp--;
			} else {
				nst -= 2;
				nsp++;
			}

			System.out.println();
			row++;
		}

	}

}
