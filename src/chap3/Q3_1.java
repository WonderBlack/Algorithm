package chap3;

import java.util.Scanner;

public class Q3_1 {

	// 配列aの先頭n個の要素からkyeと一致する要素を線形探索（番兵法）
	static int seqSearchSen(int[] a, int n, int key) {
		int i = 0;

		a[n] = key;// 番兵を追加

		int flg = -1;

		for (i = 0; i < n; i++) {
			if (a[i] == key) {
				flg = i;
			}
		}
		return flg;
	}

	public static void main(String[] args) {
		Scanner stdIn = new Scanner(System.in);

		System.out.print("要素数：");
		int num = stdIn.nextInt();
		int[] x = new int[num + 1];// 要素数num + 1の配列

		for (int i = 0; i < num; i++) {
			System.out.print("x[" + i + "]：");
			x[i] = stdIn.nextInt();
		}

		System.out.print("探す値：");// キーの読み込み
		int ky = stdIn.nextInt();

		int idx = seqSearchSen(x, num, ky);// 配列xから値がkyの要素を探索

		if (idx == -1) {
			System.out.println("その値の要素は存在しません。");
		} else {
			System.out.println("その値はx[" + idx + "]にあります。");
		}
	}

}
