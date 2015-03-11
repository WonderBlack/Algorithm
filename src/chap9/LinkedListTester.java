package chap9;

import java.util.Comparator;
import java.util.Scanner;

public class LinkedListTester {
	static Scanner stdIn = new Scanner(System.in);

	// データ（会員番号＋氏名）
	static class Data {
		static final int NO = 1;// 番号を読み込むか？
		static final int NAME = 2;// 氏名を読み込むか？

		private Integer no;// 会員番号
		private String name;// 氏名

		// 文字列表現を返す
		public String toString() {
			return "(" + no + ") " + name;
		}

		// データの読み込み
		void scanData(String guide, int sw) {
			System.out.println(guide + "するデータを入力してください。");

			if ((sw & NO) == NO) {
				System.out.print("番号：");
				no = stdIn.nextInt();
			}
			if ((sw & NAME) == NAME) {
				System.out.print("名前：");
				name = stdIn.next();
			}
		}

		// 会員番号による順序づけを行うコンパレータ
		public static final Comparator<Data> NO_ORDER = new NoOrderComparator();

		private static class NoOrderComparator implements Comparator<Data> {
			public int compare(Data d1, Data d2) {
				return (d1.no > d2.no) ? 1 : (d1.no < d2.no) ? -1 : 0;
			}
		}
		
		//氏名による順序づけを行うコンパレータ
		public static final Comparator<Data> NAME_ORDER = new NameOrderComparator();
		
		private static class NameOrderComparator implements Comparator<Data> {
			public int compare (Data d1, Data d2) {
				return d1.name.compareTo(d2.name);
			}
		}
	}
	
	//メニュー列挙型
	enum Menu {
		ADD_FIRST(	"先頭にノードを挿入"),
		ADD_LAST(	"末尾にノードを挿入"),
		RMV_FIRST(	"先頭ノードを削除"),
		RMV_LAST(	"末尾ノードを削除"),
		RMV_CRNT(	"着目ノードを削除"),
		CLEAR(	"全ノードを削除"),
		SEARCH_NO(	"番号で探索"),
		SEARCH_NAME(	"氏名で探索"),
	}

}
