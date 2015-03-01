package chap1;

import java.util.Scanner;

public class SumWhile {

	public static void main(String[] args) {
		Scanner stdIn = new Scanner(System.in);

		System.out.println("1からnまでの和を求めます。");
		int n = stdIn.nextInt();
		int sum = 0;
		int i = 1;

		while (i <= n) {
			sum += i;
			i++;
		}

		System.out.println("1からnまでの合計は" + sum);
		System.out.println(i);
	}

}
