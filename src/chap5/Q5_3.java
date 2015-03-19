package chap5;

// 複数の値の公約数を求める

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

public class Q5_3 {

	public static void main(String[] args) {

		Scanner stdIn = new Scanner(System.in);

		System.out.println("配列cdの要素数は：");
		int n = stdIn.nextInt();

		int[] x = new int[n];
		for (int i = 0; i < n; i++) {
			System.out.print("要素[" + i + "]");
			x[i] = stdIn.nextInt();
		}
		System.out.println(Arrays.toString(x));

		ArrayList<Integer> cd = gcdArray(x);

		System.out.println("配列xの公約数は以下の通り");
		for (int i = 0; i < cd.size(); i++) {
			System.out.println(cd.get(i));
		}
		
		System.out.println();

		int i = 0;
		int min = getMin(x);
		System.out.println("配列xの中身は" + Arrays.toString(x));
		System.out.println("配列xの最小値は" + min);
		int ans = gcdArray2(x, i, min);

		System.out.println("配列x" + Arrays.toString(x) + "の最大公約数は" + ans);

	}

	// 配列中の数の最大公約数を再帰的に調べるメソッド
	static int gcdArray2(int[] x, int i, int min) {// ex: x{10, 50, 150}, i = 0, min = 10
		// a = 走査対象の配列
		// i = 配列のポインタ
		// min = 配列中の最小値であると同時に最大公約数、この値から公約数になりうるかを調査スタート

		if (i < x.length) {
			// 配列の末尾に達するまで繰り返す
			// 配列の最初の値の中から約数をチェック
			System.out.println("配列x[" + i + "] " + x[i] + " に対して" + min + "が約数になるかを走査");
			if (getSurplus(x[i], min) == 0) {// 配列の値の剰余が０なら配列の次の値に対しても調べる
				System.out.println("配列x[" + i + "] " + x[i] + " に対して" + min + "は約数です");
				i++;
				return gcdArray2(x, i, min);
			} else {// 駄目ならminをディクリメントして再度配列の最初の値からチェック
				System.out.println("配列x[" + i + "] " + x[i] + " に対して" + min + "は約数ではありません");
				min--;
				i = 0;
				return gcdArray2(x, i, min);
			}
		}

		return min;
	}

	// 配列中の数の公約数を求めるメソッド
	public static ArrayList<Integer> gcdArray(int[] x) {

		ArrayList<Integer> cd = new ArrayList<Integer>();// 公約数を保存

		for (int i = 1; i <= getMin(x); i++) {// １〜配列中の最小値の間で最大公約数を走査
			int flg = 1;// 1 = OK, 0 = NG
			for (int j = 0; j < x.length; j++) {
				if (getSurplus(x[j], i) != 0) {// 剰余が０以外なら
					flg = 0;// flgをNGにする
					break;// それ以降は走査しても意味がないのでbreak
				}
			}
			// 全部走査し終わってもflgがOKのままならその数は公約数
			if (flg == 1) {
				cd.add(i);// その数を公約数を保存する配列cdに追加
			}
		}

		return cd;

	}

	// 剰余を求めるメソッド
	static int getSurplus(int x, int y) {

		int z = x % y;
		return z;

	}

	// 配列の中の最小値を求めるメソッド
	static int getMin(int[] x) {

		int min = x[0];

		for (int i = 1; i < x.length; i++) {
			if (x[i] < min) {
				min = x[i];
			}
		}

		return min;

	}

	// 配列の中の最大値を求めるメソッド
	static int getMax(int[] x) {

		int max = x[0];

		for (int i = 1; i < x.length; i++) {
			if (x[i] > max) {
				max = x[i];
			}
		}

		return max;

	}

	// 約数を求めるメソッド
	static ArrayList<Integer> getDivisor(int x) {

		ArrayList<Integer> num = new ArrayList<Integer>();

		for (int i = 1; i < x; i++) {
			if ((x % i) == 0) {
				num.add(i);
			}
		}

		return num;

	}

}
