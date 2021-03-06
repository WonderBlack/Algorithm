package chap5;

import java.util.Scanner;

public class RecurX2 {

	public static void main(String[] args) {
		Scanner stdIn = new Scanner(System.in);

		System.out.print("整数を入力せよ：");
		int x = stdIn.nextInt();

		recur(x);
	}

	// 再帰を除去したrecur
	static void recur(int n) {
		IntStack s = new IntStack(n);

		while (true) {
			if (n > 0) {
				s.push(n);// nの値をプッシュ
				n = n - 1;
				continue;
			}
			if (s.isEmpty() != true) {
				n = s.pop();// 保存していた値をnにポップ
				System.out.println(n);// 保存していた値をnにポップ
				n = n - 2;
				continue;
			}
			break;
		}
	}

}
