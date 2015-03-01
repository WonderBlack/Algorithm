package chap2;

import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Scanner;

public class Q2_11 {
	static int y;// 西暦年
	static int m;// 月
	static int d;// 日

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		System.out.println("〜日前、〜日後の日付を調べます。");

		System.out.println("何日後を調べますか？");
		int d = s.nextInt();
		YMD Y = new YMD(y, m, d);
		Y.after(d);
		
		System.out.println("何日前を調べますか？");
		d = s.nextInt();
		Y.before(d);
	}

	public static class YMD {
		int y;// 西暦年
		int m;// 月
		int d;// 日

		YMD(int y, int m, int d) {
			this.y = y;
			this.m = m;
			this.d = d;
		}

		void after(int n) { // n日後の日付を返す
			Calendar cal = Calendar.getInstance();
			SimpleDateFormat sdf = new SimpleDateFormat("yyyy年MM月dd日");
			cal.add(Calendar.DATE, n);
			System.out.println(n + "日後は" + sdf.format(cal.getTime()) + "です。");
		}

		void before(int n) { // n日前の日付を返す
			Calendar cal = Calendar.getInstance();
			SimpleDateFormat sdf = new SimpleDateFormat("yyyy年MM月dd日");
			cal.add(Calendar.DATE, -n);
			System.out.println(n + "日前は" + sdf.format(cal.getTime()) + "です。");
		}

	}
}
