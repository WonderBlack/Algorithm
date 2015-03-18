package chap5;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

public class Q5_3 {
	public static void main(String[] args) {

		Scanner stdIn = new Scanner(System.in);

		System.out.println("配列cdの要素数は：");
		int n = stdIn.nextInt();
		int[] number = new int[n];

		for (int i = 0; i < n; i++) {
			System.out.print("要素[" + i + "]");
			number[i] = stdIn.nextInt();
		}
		System.out.println(Arrays.toString(number));

		ArrayList<Integer> cd = new ArrayList<Integer>();// 公約数を保存
		
		for (int i = 1; i <= getMin(number); i++) {// 配列の最小値の数分最大公約数を走査
			int flg = 1;// 1 = OK, 0 = NG
			for (int j = 0; j < number.length; j++) {
				if (getSurplus(number[j], i) != 0) {// 剰余が０以外なら
					flg = 0;// flgをNGにする
					break;// それ以降は操作しても意味がないのでbreak
				}
			}
			// 全部走査し終わってもflgがOKのままならその数は公約数
			if (flg == 1) {
				cd.add(i);// その数を公約数を保存する配列cdに追加
			}
		}
		
		System.out.println("配列cdの公約数は以下の通り");
		for (int i = 0; i < cd.size(); i++) {
			System.out.println(cd.get(i));
		}
		
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

	// static int gcdArray(int[] a) {
	//
	// }

}
