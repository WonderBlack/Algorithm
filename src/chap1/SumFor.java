package chap1;

import java.util.Scanner;

public class SumFor {

	public static void main(String[] args) {
		Scanner stdIn = new Scanner(System.in);

		System.out.println("1からnまでの和を求めます。");
		int n = stdIn.nextInt();
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
