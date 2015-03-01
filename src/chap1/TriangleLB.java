package chap1;

import java.util.Scanner;

public class TriangleLB {
	static Scanner stdIn = new Scanner(System.in);
	static int n;

	public static void main(String[] args) {
		do {
			System.out.print("段数は：");
			n = stdIn.nextInt();
		} while (n <= 0);
		
		triagnleLB(n);
		triagnleRB(n);
		triagnleLU(n);
		triangleRU(n);

	}

	static void triagnleLB(int n) {
		System.out.println("左下直角の三角形を表示します。");

		for (int i = 1; i <= n; i++) {
			for (int j = 1; j <= i; j++) {
				System.out.print('*');
			}
			System.out.println();
		}
	}
	
	static void triagnleRB(int n) {
		System.out.println("右下直角の三角形を表示します。");

		for (int i = 1; i <= n; i++) {
			for (int j = n; j > i; j--) {
				System.out.print(" ");
			}
			for (int j = 1; j <= i; j++) {
				System.out.print('*');
			}
			System.out.println();
		}
	}
	
	static void triagnleLU(int n) {
		System.out.println("左上直角の三角形を表示します。");
		for (int i = 0; i < n; i++) {
			for (int j = i; j < n; j++) {
				System.out.print("*");
			}
			System.out.println();
		}
	}
	
	static void triangleRU(int n) {
		System.out.println("右上直角の三角形を表示します。");
		for (int i = 0; i < n; i++) {
			for (int j = 0; j < i; j++) {
				System.out.print(" ");
			}
			for (int j = i; j < n; j++) {
				System.out.print("*");
			}
			System.out.println();
		}
	}

}
