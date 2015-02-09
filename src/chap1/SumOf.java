package chap1;

import java.util.Scanner;

public class SumOf {
	static int i;
	int j;
	static int sum = 0;

	public static void main(String[] args) {
		Scanner stdIn = new Scanner(System.in);
		System.out.println("aからbまでの和を求めます。");
		System.out.println("aを入力してください。");
		int a = stdIn.nextInt();
		System.out.println("bを入力してください。");
		int b = stdIn.nextInt();
		sum = sumof(a, b);
		System.out.println("aからbの合計は" + sum);
	}

	static int sumof(int a, int b) {
		int max;
		int min;
		if (a >= b) {
			max = a;
			min = b;
		} else {
			max = b;
			min = a;
		}
		System.out.println("max = " + max);
		System.out.println("min = " + min);
		for (i = min; i <= max; i++) {
			sum += i;
			System.out.println(sum);
		}
		return sum;
	}

}
