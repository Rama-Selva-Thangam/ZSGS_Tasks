package october25;

import java.util.Scanner;

public class Pattern_6 {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.print("Enter the Number of Rows: ");
		int rows = scan.nextInt();
		for (int i = 1; i <= rows; i++) {
			for (int j = 1; j <= rows - i; j++) {
				System.out.print(" ");
			}
			for (int k = 1; k <= rows; k++) {
				if (i == 1 || i == rows || k == 1 || k == rows) {
					System.out.print("*");
				} else {
					System.out.print(" ");
				}

			}

			System.out.println();
		}
		scan.close();
	}
}
