package chap1;

import java.util.Scanner;

public class JudgeSign {
	public static void main(String[] args) {
		Scanner stdIn = new Scanner(System.in);

		System.out.println("整数を入力せよ：");
		int n = stdIn.nextInt();
//		if (n > 0) {
//			System.out.println(n + "は整数です。");
//		} else if (n == 0) {
//			System.out.println(n + "は０です。");
//		} else {
//			System.out.println(n + "は負です。");
//		}
		
		if (n == 1) {
			System.out.println("それは１です");
		} else if (n == 2) {
			System.out.println("それは２です");
		} else if (n == 3) {
			System.out.println("それは３です");
		}
	}
	

}
