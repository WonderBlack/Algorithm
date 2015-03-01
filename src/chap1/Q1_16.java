package chap1;

import java.util.Scanner;

public class Q1_16 {
	static Scanner stdIn = new Scanner(System.in);
	static int n;

	public static void main(String[] args) {
		do {
			System.out.print("段数は：");
			n = stdIn.nextInt();
		} while (n <= 0);
		spira(n);
	}

	static void spira(int n) {
		int x = 1;// *の個数
		int y = 0;// スペースの個数
		int z = n + (n - 1);// 一行あたりのマス目の数
		for (int i = 1; i <= n; i++) {// i = 段数
			y = (z - x) / 2;// マス目の数から*の数を引いて２等分し左右一方あたりのスペースの数を算出
			for (int j = 0; j < y; j++) {
				System.out.print(" ");
			}
			for (int j = 0; j < x; j++) {// xの数分*を描画
				System.out.print("*");
			}
			x += 2;// 一段上がるごとに２ずつ*の数が増える。
			System.out.println();
		}
	}

}
