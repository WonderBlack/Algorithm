package chap2;

import java.util.Random;
import java.util.Scanner;

public class Change {

	public static void main(String[] args) {
		Scanner stdIn = new Scanner(System.in);
		Random rnd = new Random();

		System.out.println("要素数は：");
		int n = stdIn.nextInt();
		int[] num = new int[n];
		for (int i = 0; i < n; i++) {
			num[i] = rnd.nextInt(100);
		}
		System.out.println("交換前の配列");
		for (int i = 0; i < num.length; i++) {
			System.out.print(num[i] + "  ");
		}
		System.out.println();
		System.out.println();
		num = change(num);
		System.out.println();
		System.out.println("交換後の配列");
		for (int i = 0; i < num.length; i++) {
			System.out.print(num[i] + "  ");
		}
	}

	static int[] change(int[] num) {// 配列の要素の並びを反転するメソッド
		int x;// 交換する値１
		int y;// 交換する値２
		int z;// 値を仮に保管する変数
		int j = num.length - 1;// 配列の最後の要素の添え字
		for (int i = 0; i < (num.length / 2); i++) {
			x = num[i];// num[0]の値をxに代入
			y = num[j];// num[最後]の値をyに代入
			System.out.print("[要素" + i + "の値" + num[i] + "]");
			System.out.print("と[要素" + j + "の値" + num[j] + "]");
			System.out.println("を交換");
			// ２値の交換作業↓
			num[i] = y;
			num[j] = x;
			// 配列の次の要素に移る

			j--;
		}
		return num;
	}

}
