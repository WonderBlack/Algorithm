package chap4;

import java.util.Scanner;

public class DoubleIntStackTester {

	public static void main(String[] args) {
		Scanner stdIn = new Scanner(System.in);
		System.out.println("スタックのサイズは？");
		int n = stdIn.nextInt();
		DoubleIntStack s = new DoubleIntStack(n); // 最大n個プッシュできるスタック

		while (true) {
			System.out.println("現在のスタックAのデータ数：" + s.sizeA() + " / "
					+ s.capacityA());
			System.out.println("現在のスタックBのデータ数：" + s.sizeB() + " / "
					+ s.capacityB());

			System.out
					.print("(11)プッシュA　(21)ポップA　(31)ピークA　(41)ダンプA　(51)検索A　(61)クリアA　(71)スタックの容量A　(81)スタックは空か？A　(91)スタックは満杯か？A　(0)終了：");
			System.out.println();
			System.out
					.print("(12)プッシュB　(22)ポップB　(32)ピークB　(42)ダンプB　(52)検索B　(62)クリアB　(72)スタックの容量B　(82)スタックは空か？B　(92)スタックは満杯か？B　(0)終了：");

			int menu = stdIn.nextInt();
			if (menu == 0)
				break;

			int x;
			boolean y;

			switch (menu) {
			case 11:
				System.out.print("データ：");// プッシュA
				x = stdIn.nextInt();
				try {
					s.pushA(x);
				} catch (IntStack.OverflowIntStackException e) {
					System.out.println("スタックが満杯です。");
				}
				break;

			case 12:
				System.out.print("データ：");// プッシュB
				x = stdIn.nextInt();
				try {
					s.pushB(x);
				} catch (IntStack.OverflowIntStackException e) {
					System.out.println("スタックが満杯です。");
				}
				break;

			case 21:// ポップA
				try {
					x = s.popA();
					System.out.println("ポップしたデータは" + x + "です。");
				} catch (IntStack.EmptyIntStackException e) {
					System.out.println("スタックが空です。");
				}
				break;
			case 22:// ポップB
				try {
					x = s.popB();
					System.out.println("ポップしたデータは" + x + "です。");
				} catch (IntStack.EmptyIntStackException e) {
					System.out.println("スタックが空です。");
				}
				break;

			case 31:// ピークA
				try {
					x = s.peekA();
					System.out.println("ピークしたデータは" + x + "です。");
				} catch (IntStack.EmptyIntStackException e) {
					System.out.println("スタックが空です。");
				}
				break;

			case 32:// ピークB
				try {
					x = s.peekB();
					System.out.println("ピークしたデータは" + x + "です。");
				} catch (IntStack.EmptyIntStackException e) {
					System.out.println("スタックが空です。");
				}
				break;

			case 41:// ダンプA
				s.dumpA();
				break;

			case 42:// ダンプB
				s.dumpB();
				break;

			case 51:// 検索A
				System.out.println("検索したい値は？");
				x = stdIn.nextInt();
				x = s.indexOfA(x);
				if (x == -1) {
					System.out.println("その値は存在しません。");
				} else {
					System.out.println("その値は[" + x + "]に存在します。");
				}
				break;

			case 52:// 検索B
				System.out.println("検索したい値は？");
				x = stdIn.nextInt();
				x = s.indexOfB(x);
				if (x == -1) {
					System.out.println("その値は存在しません。");
				} else {
					System.out.println("その値は[" + x + "]に存在します。");
				}
				break;

			case 61:// クリアA
				s.clearA();
				break;

			case 62:// クリアB
				s.clearB();
				break;

			case 71:// 容量の確認A
				x = s.capacityA();
				System.out.println("スタックAの容量は" + x + "です。");
				break;

			case 72:// 容量の確認B
				x = s.capacityB();
				System.out.println("スタックB容量は" + x + "です。");
				break;

			case 81:// スタックAは空か？
				y = s.isEmptyA();
				if (y == true) {
					System.out.println("スタックAは空です。");
				} else {
					System.out.println("スタックAは空ではありません。");
				}
				break;

			case 82:// スタックBは空か？
				y = s.isEmptyB();
				if (y == true) {
					System.out.println("スタックBは空です。");
				} else {
					System.out.println("スタックBは空ではありません。");
				}
				break;

			case 91:// スタックAは満杯か？
				y = s.isFullA();
				if (y == true) {
					System.out.println("スタックAは満杯です。");
				} else {
					System.out.println("スタックAは満杯ではありません。");
				}
				break;

			case 92:// スタックBは満杯か？
				y = s.isFullB();
				if (y == true) {
					System.out.println("スタックBは満杯です。");
				} else {
					System.out.println("スタックBは満杯ではありません。");
				}
				break;
			}

		}
	}
}
