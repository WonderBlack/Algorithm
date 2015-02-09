package chap1;

import java.util.Scanner;

public class Q1_14 {
	public static void main(String[] args) {
		Scanner stdIn = new Scanner(System.in);
		System.out.println("整数を入力してください。");
		int a = stdIn.nextInt();
		while(a < 0) {
			System.out.println("整数を入力してください。");
			a = stdIn.nextInt();
		}
		for (int i = 0; i <= a; i++) {
			for (int j = 0; j <= a; j++) {
				System.out.print("*");
			}
			System.out.println();
		}


	}
}
