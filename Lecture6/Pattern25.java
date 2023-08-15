package Lecture6;

public class Pattern25 {
	public static void main(String[] args) {
		int n = 5;

		int nst = 1;
		int nsp = n - 1;
		int val = 1;
		int row = 1;
		while (row <= n) {

			// Space
			for (int i = 1; i <= nsp; i++) {
				System.out.print(" " + "\t");
			}

			// Val
			for (int i = 1; i <= nst; i++) {
				System.out.print(val + "\t");
				val++;
			}

			nst += 2;
			nsp--;

			System.out.println();
			row++;
		}

	}

}
