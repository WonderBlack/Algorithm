package chap1;

import java.util.Scanner;

public class Digits {
	public static void main(String[] args) {
		Scanner stdIn = new Scanner(System.in);
		int no;
		
		System.out.println("２桁の整数値を入力してください。");
		do {
			System.out.println("値は：");
			no = stdIn.nextInt();
		} while (no < 10 || no > 99);
		
		System.out.println("変数noの値は" + no + "になりました。");
	}

}
