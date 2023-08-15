package Lecture3;

public class Pattern2 {
	public static void main(String[] args) {
		int n = 5;

		int nst = 1; 
		int row = 1;
		while (row <= n) {

			for (int i = 1; i <= nst; i++) {
				System.out.print("* ");
			}

			System.out.println();
			nst++;
			row++;
		}

	}

}
