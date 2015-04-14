package chap4;

import java.util.Scanner;

public class IntQueueTester {
	
	public static void main(String[] args) {
		Scanner stdIn = new Scanner(System.in);
		System.out.println("キューの容量は？");
		int cap = stdIn.nextInt();
		IntQueue s = new IntQueue(cap);// 最大cap個プッシュできるキュー
		
		while (true) {
			System.out.println("現在のデータ数：" + s.size() + " / " + s.capacity());
			System.out.print("(1)エンキュー　(2)デキュー　(3)ピーク　(4)ダンプ　(5)サーチ　(0)終了：");
			
			int menu = stdIn.nextInt();
			if (menu == 0) {
				break;
			}
			
			int x;
			
			switch (menu) {
			case 1:// エンキュー
				System.out.print("データ：");
				x = stdIn.nextInt();
				try {
					s.enque(x);
				} catch (IntQueue.OverflowIntQueueException e) {
					System.out.println("キューが満杯です。");
				}
				break;
				
			case 2:// デキュー
				try {
					x = s.deque();
					System.out.println("デキューしたデータは" + x + "です。");
				} catch (IntQueue.EmptyIntQueueException e) {
					System.out.println("キューが空です。");
				}
				break;
				
			case 3:// ピーク
				try {
					x = s.peek();
					System.out.println("ピークしたデータは" + x + "です。");
				} catch (IntQueue.EmptyIntQueueException e) {
					System.out.println("キューが空です。");
				}
				break;
				
			case 4: // ダンプ
				s.dump();
				break;
				
			case 5: // サーチ
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
