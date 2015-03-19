package chap5;

// 複数の値の公約数を求める

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

public class CopyOfQ5_3 {
	
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

		System.out.println("配列cdの公約数は以下の通り");
		for (int i = 0; i < cd.size(); i++) {
			System.out.println(cd.get(i));
		}

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
