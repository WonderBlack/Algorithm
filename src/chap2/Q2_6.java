package chap2;

import java.util.Scanner;

public class Q2_6 {

	static int cardConvR(int x, int r, char[] d) {// x = 変換する整数 y = 基数
		int digits = d.length - 1;
		String dchar = "0123456789ABCDEFGHIJKLMNOPQRSTUVWXYZ";

		do {
			d[digits--] = dchar.charAt(x % r);
			x /= r;
		} while (x != 0);
		return digits;
	}

	public static void main(String[] args) {
		Scanner stdIn = new Scanner(System.in);
		int no;// 変換する整数
		int cd;// 基数
		int dno;// 変換後の桁数
		int retry;// もう一度？
		char[] cno = new char[32];// 変換後の各桁を格納する文字の配列

		System.out.println("10進数を基数変換します。");
		do {
			do {
				System.out.println("変換する非負の整数：");
				no = stdIn.nextInt();
			} while (no < 0);

			do {
				System.out.println("何進数に変換しますか？（2-36）：");
				cd = stdIn.nextInt();
			} while (cd < 2 || cd > 36);

			dno = cardConvR(no, cd, cno);// noをcd進数に変換

			System.out.println(cd + "進数では");
			for (int i = cno.length - 1; i >= 0; i--) {// 下位桁から順に表示
				System.out.print(cno[i]);
			}
			System.out.println("です。");

			System.out.println("もう一度しますか（1･･･はい／0･･･いいえ）：");
			retry = stdIn.nextInt();
		} while (retry == 1);
	}
}
