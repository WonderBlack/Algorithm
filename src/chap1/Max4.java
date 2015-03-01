package chap1;

import java.util.Scanner;

public class Max4 {
	static int max;

	public static void main(String[] args) {

		Scanner stdIn = new Scanner(System.in);
		System.out.println("三つの整数の最大値を求めます。");
		System.out.println("aの値：");
		int a = stdIn.nextInt();
		System.out.println("bの値：");
		int b = stdIn.nextInt();
		System.out.println("cの値：");
		int c = stdIn.nextInt();
		System.out.println("dの値：");
		int d = stdIn.nextInt();
		max = max4(a, b, c, d);
		System.out.println("最大値は" + max);
	}

	static int max4(int a, int b, int c, int d) {
		max = a;
		if (b > max) {
			max = b;
		}
		if (c > max) {
			max = c;
		}
		if (d > max) {
			max = d;
		}

		return max;

	}
}
