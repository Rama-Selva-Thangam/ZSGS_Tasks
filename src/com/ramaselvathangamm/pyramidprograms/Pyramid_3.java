package com.ramaselvathangamm.pyramidprograms;

import java.util.Scanner;

public class Pyramid_3 {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.print("Enter the Number of Rows : ");
		int rows = scan.nextInt();
		for (int i = 1; i <= rows; i++) {
			for (int j = 1; j <= i; j++) {
				System.out.print(" ");
			}
			for (int k = 1; k <= rows - i + 1; k++) {
				System.out.print("* ");
			}
			System.out.println();
		}
		scan.close();
	}
}