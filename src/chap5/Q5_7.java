package chap5;

import java.util.Scanner;

//ハノイの塔

public class Q5_7 {
	static int cnt = 1;


	// no枚の円盤をx軸からy軸へ移動
	static void move(int no, int x, int y) {// no = 円盤の枚数, x = 開始軸, y = 目的軸
		
		// 底の円盤を除いたグループを開始軸から中間軸へ移動
		if (no > 1) {
			move(no - 1, x, 6 - x - y);
		}

		// 一番下の円盤を目的軸に移動
		System.out.println("ステップ" + cnt);
		cnt++;
		System.out.println("円盤[" + no + "]を" + x + "軸から" + y + "軸へ移動");

		// 底の円盤を除いたグループを中間軸から目的軸に移動
		if (no > 1) {
			move(no - 1, 6 - x - y, y);
		}
		
	}

	public static void main(String[] args) {
		Scanner stdIn = new Scanner(System.in);

		System.out.println("ハノイの塔");
		System.out.print("円盤の枚数：");
		int n = stdIn.nextInt();

		move(n, 1, 3);// 第１軸に積まれたn枚を第３軸に移動
	}
}
