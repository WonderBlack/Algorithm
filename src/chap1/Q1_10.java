package chap1;

import java.util.Scanner;

public class Q1_10 {
	public static void main(String[] args) {
		int a;
		int b;
		Scanner stdIn = new Scanner(System.in);
		System.out.println("aからbまでの和を求めます。");
		System.out.println("aを入力してください。");
		a = stdIn.nextInt();
		System.out.println("bを入力してください。");
		b = stdIn.nextInt();
		do {
			System.out.println("aより大きな値を入力せよ！");
			b = stdIn.nextInt();
		} while (b <= a);
		System.out.println("b - a = " + (b -a ) + "です。");
	}

}
