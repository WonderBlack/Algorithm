package chap3;

import java.util.Scanner;

public class Q3_4 {

	// 配列aの先頭n個の要素からkeyと一致する要素を２分探索
	static int binSearch(int[] a, int n, int key) {
		int pl = 0;// 探索範囲先頭のインデックス
		int pr = n - 1;// 探索範囲末尾のインデックス

		System.out.print("   |");
		for (int i = 0; i < a.length; i++) {
			System.out.printf("%4d", i);
		}
		System.out.println("  ");
		System.out.print("---+");
		for (int i = 0; i < a.length; i++) {
			System.out.printf("%4s", "----");
		}
		System.out.println("--");

<<<<<<< HEAD
		for (int i = 0; i < a.length; i++) {

			int pc = (pl + pr) / 2;// 中央要素のインデックス
			// マークを表示するfor文
			System.out.print("   |");
			for (int j = 0; j < a.length; j++) {
				if (pl == j) {// 先頭値とjが一致したら
					if (pl == pc) {// 先頭値と中央値が同じなら

					} else {
						System.out.printf("%4s", "<- ");
					}
				}
				if (pc == j) {// 中央値とjが一致したら
					if (pl == pr) {// 先頭値と末尾値が同じなら
						System.out.printf("%4s", " <-+->");
					} else if (pl == pc) {// 先頭値と中央値が同じなら
						System.out.printf("%4s", "<-+");
					} else if (pc == pr) {// 末尾値と中央値が同じなら
						System.out.printf("%4s", "+->");
					} else {
						System.out.printf("%4s", "+");
					}
				}
				if (pr == j) {// 末尾値とjが一致したら
					if (pc == pr) {// 末尾値と中央値が同じなら

					} else {
						System.out.printf("%4s", "    ->");
					}
				}
				if (j != pl && j != pc && j != pr) {
					System.out.printf("%4s", "    ");
				}
			}
			System.out.println();
			// 数字を表示するfor文
			System.out.printf("%3d", pc);
			System.out.print("|");
=======
		int pc = (pl + pr) / 2;// 中央要素のインデックス
		System.out.print("   |");
		// マークを表示するfor文
		for (int j = 0; j < a.length; j++) {
			if (j == pl) {
				System.out.print(" <- ");
			} else if (j == pr) {
				System.out.print("  ->");
			} else if (j == pc) {
				System.out.print("   +");
			} else {
				System.out.print("    ");
			}
		}
		System.out.println();
		System.out.printf("%3d", pc);
		System.out.print("|");
		// 要素を表示するfor文
		for (int j = 0; j < a.length; j++) {
			System.out.printf("%4d", a[j]);
		}
		System.out.println();
		if (a[pc] == key) {
			return pc;// 探索成功
		} else if (a[pc] < key) {// 中央値よりkwyが大きかったら
			pl = pc + 1;// 探索範囲を後半に絞り込む
		} else {// 中央値よりkeyが小さかったら
			pr = pc - 1;// 探索範囲を前半に絞り込む
		}

		for (int i = 0; i < a.length; i++) {
			pc = (pl + pr) / 2;// 中央要素のインデックス
			System.out.print("   |");
			// マークを表示するfor文
			for (int j = 0; j < a.length; j++) {
				if (j == pl) {
					System.out.print(" <- ");
				} else if (j == pr) {
					System.out.print("  ->");
				} else if (j == pc) {
					System.out.print("   +");
				} else {
					System.out.print("    ");
				}
			}
			System.out.println();
			System.out.printf("%3d", pc);
			System.out.print("|");
			// 要素を表示するfor文
>>>>>>> origin/master
			for (int j = 0; j < a.length; j++) {
				System.out.printf("%4d", a[j]);
			}
			System.out.println();
<<<<<<< HEAD

=======
>>>>>>> origin/master
			if (a[pc] == key) {
				return pc;// 探索成功
			} else if (a[pc] < key) {// 中央値よりkwyが大きかったら
				pl = pc + 1;// 探索範囲を後半に絞り込む
			} else {// 中央値よりkeyが小さかったら
				pr = pc - 1;// 探索範囲を前半に絞り込む
			}
<<<<<<< HEAD
			
			if (pl > pr || pr < pl) {
				break;
			}
		}

		// do {
		// pc = (pl + pr) / 2;// 中央要素のインデックス
=======
		}

		// do {
		// int pc = (pl + pr) / 2;// 中央要素のインデックス
>>>>>>> origin/master
		// if (a[pc] == key) {
		// return pc;// 探索成功
		// } else if (a[pc] < key) {// 中央値よりkwyが大きかったら
		// pl = pc + 1;// 探索範囲を後半に絞り込む
		// } else {// 中央値よりkeyが小さかったら
		// pr = pc - 1;// 探索範囲を前半に絞り込む
		// }
<<<<<<< HEAD
=======
		//
>>>>>>> origin/master
		// } while (pl <= pr);

		return -1;// 探索失敗
	}

	public static void main(String[] args) {
		Scanner stdIn = new Scanner(System.in);

		System.out.print("要素数：");
		int num = stdIn.nextInt();
		int[] x = new int[num];// 要素数numの配列

		System.out.println("昇順に入力してください。");

		System.out.print("x[0]：");// 先頭要素の読み込み
		x[0] = stdIn.nextInt();

		for (int i = 1; i < num; i++) {
			do {
				System.out.print("x[" + i + "]：");
				x[i] = stdIn.nextInt();
			} while (x[i] < x[i - 1]);// 一つ前の要素より小さければ再入力
		}

		System.out.print("探す値：");// キー値の読込み
		int ky = stdIn.nextInt();

		int idx = binSearch(x, num, ky);// 配列xから値がkyの要素を探索

		if (idx == -1) {
			System.out.println("その値の要素は存在しません。");
		} else {
			System.out.println("その値はx[" + idx + "]にあります。");
		}
	}

}
