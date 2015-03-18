package chap5;

import java.util.Scanner;

public class Q5_1 {

	// 非負の整数値nの階乗値を返却
	static int factorial(int n) {
		int x = 1;
		for (int i = 1; i < n; i++) {
			x = x * (i + 1);
		}
		return x;
	}

	public static void main(String[] args) {
		Scanner stdIn = new Scanner(System.in);

		System.out.println("整数を入力せよ：");
		int x = stdIn.nextInt();

		System.out.println(x + "の階乗は" + factorial(x) + "です。");
	}

}
