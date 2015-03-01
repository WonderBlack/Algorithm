package chap1;

import java.util.Scanner;

public class SumForPos {

	public static void main(String[] args) {
		Scanner stdIn = new Scanner(System.in);
		int n;

		System.out.println("1からnまでの和を求めます。");
		n = stdIn.nextInt();
		do {
			System.out.println("nの値：");
			n = stdIn.nextInt();
		} while (n <= 0);
		
		int sum = 0;
		int i = 0;
		String str = "";

		for (i = 0; i <= n; i++) {
			sum += i;
			if (i != n) {
				str += i + " + ";
			} else if (i == n) {
				str += i + " = ";
			}
		}

		System.out.println("1からnまでの合計は" + sum);
		System.out.println(str + sum);
		// System.out.println(i);
	}

}

