package chap2;

import java.util.Scanner;

public class Q2_8 {

	// 各月の日数
	static int[][] mdays = {
			{ 31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31 },
			{ 31, 29, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31 }, };

	// 西暦year年は閏年か（閏年：１／平成：０）
	static int isLeap(int year) {
		return (year % 4 == 0 && year % 100 != 0 || year % 400 == 0) ? 1 : 0;
	}

	// 西暦y年m月d日の年内の経過日数を求める
	// static int dayOfYear(int y, int m, int d) {
	// int days = d;// 日数
	//
	// for (int i = 1; i < m; i++) {// １月〜(m-1)月の日数を加える
	// days += mdays[isLeap(y)][i - 1];
	// }
	// return days;
	// }

	 static int dayOfYear(int y, int m, int d) {
	
	 int total = 0;// 日数を積算
	 int ct = 1;// 計算の為の月を表す
	 while (total < d) {
	 total++;
	 }
	 while (ct < m) {
	 total += mdays[isLeap(y)][ct - 1];
	 ct++;
	 }
	 return total;
	
	 }

//	static int dayOfYear(int y, int m, int d) {
//		while (--m != 0) {
//			d += mdays[isLeap(y)][m - 1];
//			System.out.println(m);
//		}
//
//		return (d);
//	}

	public static void main(String[] args) {
		Scanner stdIn = new Scanner(System.in);
		int retry;// もう一度？

		System.out.println("年内の経過日数を求めます。");

		do {
			System.out.print("年：");
			int year = stdIn.nextInt();// 年
			System.out.print("月：");
			int month = stdIn.nextInt();// 月
			System.out.print("日：");
			int day = stdIn.nextInt();// 日

			System.out.printf("年内で%d日目です。\n", dayOfYear(year, month, day));

			System.out.print("もう一度しますか？（1•••はい・0•••いいえ）：");
			retry = stdIn.nextInt();
		} while (retry == 1);
	}
}
