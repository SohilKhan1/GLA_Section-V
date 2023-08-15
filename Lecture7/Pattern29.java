package Lecture7;

public class Pattern29 {
	public static void main(String[] args) {
		int n = 5;

		int nst = 1;
		int nsp = n - 1;
		int row = 1;
		while (row <= n) {
			// Space
			for (int i = 1; i <= nsp; i++) {
				System.out.print(" " + " ");
			}

			// Val
			for (int i = 1; i <= nst; i++) {
				if (i == 1 || i == nst)
					System.out.print(row + " ");
				else
					System.out.print("0 ");

			}

			nst += 2;
			nsp--;

			System.out.println();
			row++;
		}

	}

}
