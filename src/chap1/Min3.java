package chap1;

import java.util.Scanner;

public class Min3 {
	static int min;

	public static void main(String[] args) {
		Scanner stdIn = new Scanner(System.in);
		System.out.println("三つの整数の最小値を求めます。");
		System.out.println("aの値：");
		int a = stdIn.nextInt();
		System.out.println("bの値：");
		int b = stdIn.nextInt();
		System.out.println("cの値：");
		int c = stdIn.nextInt();
		min = min3(a, b, c);
		System.out.println("最小値は" + min);
	}

	static int min3(int a, int b, int c) {
		min = a;
		if (b < min) {
			min = b;
		}
		if (c < min) {
			min = c;
		}

		return min;

	}
}
