package com.ramaselvathangamm.leetcode;

import java.util.Scanner;

public class IsStraightLine {

	public static boolean checkStraightLine(int[][] coordinates) {
		if (coordinates.length <= 2)
			return true;
		int x0 = coordinates[0][0];
		int y0 = coordinates[0][1];
		int x1 = coordinates[1][0];
		int y1 = coordinates[1][1];
		for (int i = 2; i < coordinates.length; i++) {
			int x = coordinates[i][0];
			int y = coordinates[i][1];
			if ((y1 - y0) * (x - x0) != (y - y0) * (x1 - x0))
				return false;
		}
		return true;
	}

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int[][] coordinates = { { 1, 2 }, { 2, 3 }, { 3, 4 }, { 4, 5 }, { 5, 6 }, { 6, 7 } };
		boolean res = checkStraightLine(coordinates);
		System.out.println(res);
		scan.close();

	}

}
