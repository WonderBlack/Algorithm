package chap1;

import java.util.Scanner;

public class Q1_11 {
	public static void main(String[] args) {
		int n;
		Scanner stdIn = new Scanner(System.in);
		do {
			System.out.println("正の数値を入力してください。");
			n = stdIn.nextInt();
		} while (n < 0);
		int a = n;
		int figure = 0;
		while (n > 0) {
			n /= 10;
			System.out.println(n);
			figure++;
		}
//		String s = String.valueOf(a);
//		figure = s.length();
		System.out.println(a + "の桁数は" + figure + "桁です。");
	}
}
