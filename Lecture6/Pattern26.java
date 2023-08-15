package Lecture6;

public class Pattern26 {
	public static void main(String[] args) {
		int n = 5;

		int nst = 1;
		int nsp = n - 1;
		int row = 1;
		while (row <= n) {

			int val = 1;

			// Space
			for (int i = 1; i <= nsp; i++) {
				System.out.print(" " + " ");
			}

			// Val
			for (int i = 1; i <= nst; i++) {
				System.out.print(val +" ");
				val++;
			}

			nst += 2;
			nsp--;

			System.out.println();
			row++;
		}

	}

}
