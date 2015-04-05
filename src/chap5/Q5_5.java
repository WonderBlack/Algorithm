package chap5;

import java.util.Scanner;

public class Q5_5 {
	public static void main(String[] args) {
		Scanner stdIn = new Scanner(System.in);

		System.out.print("整数を入力せよ：");
		int x = stdIn.nextInt();

		recur3(x);
		System.out.println();
		recur4(x);

	}
	
	static void recur3(int n) {
		if (n > 0) {
			recur3(n -1);
			recur3(n -2);
			System.out.println(n);
		}
	}

	static void recur4(int n) {
		
		while (n > 0) {
			System.out.println(n - 1);
			System.out.println(n - 2);
			System.out.println(n);

			n--;
		}

	}
}
