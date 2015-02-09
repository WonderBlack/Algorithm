package chap1;

import java.util.Scanner;

public class Gauss {
	public static void main(String[] args) {
		Scanner stdIn = new Scanner(System.in);

		System.out.println("1からnまでの和を求めます。");
		double n = stdIn.nextInt();
		double sum = 0;
		
		sum = (1 + n) * (n / 2);
		
		System.out.println("合計は" + sum);
	}

}
