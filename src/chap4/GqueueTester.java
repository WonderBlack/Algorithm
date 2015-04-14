package chap4;

import java.util.Scanner;

public class GqueueTester {
	
	public static void main(String[] args) {
		Scanner stdIn = new Scanner(System.in);
		System.out.println("キューの容量は？");
		int cap = stdIn.nextInt();
		Gqueue<String> s = new Gqueue<String>(cap);// 最大cap個プッシュできるキュー
		
		while (true) {
			System.out.println("現在のデータ数：" + s.size() + " / " + s.capacity());
			System.out.print("(1)エンキュー　(2)デキュー　(3)ピーク　(4)ダンプ(0)終了：");
			
			int menu = stdIn.nextInt();
			if (menu == 0) {
				break;
			}
			
			String x;
			
			switch (menu) {
			case 1:// エンキュー
				System.out.print("データ：");
				x = stdIn.next();
				try {
					s.enque(x);
				} catch (Gqueue.OverflowGqueueException e) {
					System.out.println("キューが満杯です。");
				}
				break;
				
			case 2:// デキュー
				try {
					x = s.deque();
					System.out.println("デキューしたデータは" + x + "です。");
				} catch (Gqueue.EmptyGqueueException e) {
					System.out.println("キューが空です。");
				}
				break;
				
			case 3:// ピーク
				try {
					x = s.peek();
					System.out.println("ピークしたデータは" + x + "です。");
				} catch (Gqueue.EmptyGqueueException e) {
					System.out.println("キューが空です。");
				}
				break;
				
			case 4: // ダンプ
				s.dump();
				break;
			}
		}
	}

}
