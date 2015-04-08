package chap4;

import java.util.Scanner;

public class Q4_1 {

	public static void main(String[] args) {
		Scanner stdIn = new Scanner(System.in);
		System.out.println("スタックのサイズは？");
		int n = stdIn.nextInt();
		IntStack s = new IntStack(n); // 最大n個プッシュできるスタック

		while (true) {
			System.out.println("現在のデータ数：" + s.size() + " / " + s.capacity());
			System.out
					.print("(1)プッシュ　(2)ポップ　(3)ピーク　(4)ダンプ　(5)検索　(6)クリア　(7)スタックの容量　(8)スタックは空か？　(9)スタックは満杯か？　(0)終了：");

			int menu = stdIn.nextInt();
			if (menu == 0)
				break;

			int x;
			boolean y;

			switch (menu) {
			case 1:
				System.out.print("データ：");// プッシュ
				x = stdIn.nextInt();
				try {
					s.push(x);
				} catch (IntStack.OverflowIntStackException e) {
					System.out.println("スタックが満杯です。");
				}
				break;

			case 2:// ポップ
				try {
					x = s.pop();
					System.out.println("ポップしたデータは" + x + "です。");
				} catch (IntStack.EmptyIntStackException e) {
					System.out.println("スタックが空です。");
				}
				break;

			case 3:// ピーク
				try {
					x = s.peek();
					System.out.println("ピークしたデータは" + x + "です。");
				} catch (IntStack.EmptyIntStackException e) {
					System.out.println("スタックが空です。");
				}
				break;

			case 4:// ダンプ
				s.dump();
				break;

			case 5:// 検索
				System.out.println("検索したい値は？");
				x = stdIn.nextInt();
				x = s.indexOf(x);
				if (x == -1) {
					System.out.println("その値は存在しません。");
				} else {
					System.out.println("その値は[" + x + "]に存在します。");
				}
				break;

			case 6:// クリア
				s.clear();
				break;

			case 7:// 容量の確認
				x = s.capacity();
				System.out.println("容量は" + x + "です。");
				break;

			case 8:// スタックは空か？
				y = s.isEmpty();
				if (y == true) {
					System.out.println("スタックは空です。");
				} else {
					System.out.println("スタックは空ではありません。");
				}
				break;

			case 9:// スタックは満杯か？
				y = s.isFull();
				if (y == true) {
					System.out.println("スタックは満杯です。");
				} else {
					System.out.println("スタックは満杯ではありません。");
				}
				break;
			}

		}
	}

}
