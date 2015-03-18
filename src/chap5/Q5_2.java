package chap5;

import java.util.Scanner;

public class Q5_2 {

	// 整数値x, yの最大公約数を求めて返却
	static int gcd(int x, int y) {
		int z;
		while (y != 0) {
			System.out.print("割られる数xは" + x);
			System.out.println("　割る数yは" + y);
			z = y;
			y = x % y;
			System.out.println("剰余は" + y);
			x = z;
		}
		return x;
	}

	public static void main(String[] args) {
		Scanner stdIn = new Scanner(System.in);
		System.out.println("２つの整数の最大公約数を求めます。");

		System.out.print("整数を入力せよ：");
		int x = stdIn.nextInt();
		System.out.print("整数を入力せよ：");
		int y = stdIn.nextInt();

		System.out.println("最大公約数は" + gcd(x, y) + "です。");
	}

}
