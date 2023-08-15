package Lecture2;

public class Pattern1 {
	public static void main(String[] args) {
		int n = 5;

		int nst = n; // nst = number of stars
		int row = 1;
		while (row <= n) {

			for (int i = 1; i <= nst; i++) {
				System.out.print("* ");
			}

			System.out.println();
			row++;
		}

	}

}
