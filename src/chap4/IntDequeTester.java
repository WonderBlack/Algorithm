package chap4;

import java.util.Scanner;

public class IntDequeTester {
	
	public static void main(String[] args) {
		Scanner stdIn = new Scanner(System.in);
		System.out.println("キューの容量は？");
		int cap = stdIn.nextInt();
		IntDeque s = new IntDeque(cap);// 最大cap個プッシュできるキュー
		
		while (true) {
			System.out.println("現在のデータ数：" + s.size() + " / " + s.capacity());
			System.out.print("(1)フロントエンキュー　(2)リアエンキュー　(3)フロントデキュー　(4)リアデキュー　(5)フロントピーク　(6)リアピーク　(7)ダンプ　(8)サーチ　(0)終了：");
			
			int menu = stdIn.nextInt();
			if (menu == 0) {
				break;
			}
			
			int x;
			
			switch (menu) {
			case 1:// フロントエンキュー
				System.out.print("データ：");
				x = stdIn.nextInt();
				try {
					s.frontEnque(x);
				} catch (IntQueue.OverflowIntQueueException e) {
					System.out.println("キューが満杯です。");
				}
				break;
				
			case 2:// リアエンキュー
				System.out.print("データ：");
				x = stdIn.nextInt();
				try {
					s.rearEnque(x);
				} catch (IntQueue.OverflowIntQueueException e) {
					System.out.println("キューが満杯です。");
				}
				break;
				
			case 3:// フロントデキュー
				try {
					x = s.frontDeque();
					System.out.println("フロントデキューしたデータは" + x + "です。");
				} catch (IntQueue.EmptyIntQueueException e) {
					System.out.println("キューが空です。");
				}
				break;
				
			case 4:// リアデキュー
				try {
					x = s.rearDeque();
					System.out.println("リアデキューしたデータは" + x + "です。");
				} catch (IntQueue.EmptyIntQueueException e) {
					System.out.println("キューが空です。");
				}
				break;
				
			case 5:// フロントピーク
				try {
					x = s.frontPeek();
					System.out.println("フロントピークしたデータは" + x + "です。");
				} catch (IntQueue.EmptyIntQueueException e) {
					System.out.println("キューが空です。");
				}
				break;
				
			case 6:// リアピーク
				try {
					x = s.rearPeek();
					System.out.println("リアピークしたデータは" + x + "です。");
				} catch (IntQueue.EmptyIntQueueException e) {
					System.out.println("キューが空です。");
				}
				break;
				
			case 7: // ダンプ
				s.dump();
				break;
				
			case 8: // サーチ
				x = stdIn.nextInt();
				x = s.search(x);
				if (x == 0) {
					System.out.println("その値は存在しません。");
				} else {
					System.out.println("その値はキューの" + x + "番目に存在します。");
				}
				break;
			}
		}
	}

}
