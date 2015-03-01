package chap2;

import java.util.Scanner;

public class Q2_2 {

	static void swap(int[] a, int idx1, int idx2) {
		int t = a[idx1];// 配列の最初の値をtに代入
		a[idx1] = a[idx2];// 配列の最初の要素に最後の要素の値を代入
		a[idx2] = t;// tに入れておいた配列の最初の値を最後の要素に代入
	}
	
	static void reverse(int[] a) {
		for (int i = 0; i < a.length; i++) {
			System.out.print(a[i] + " ");
		}
		for (int i = 0; i < a.length / 2; i++) {
			System.out.println();
			System.out.println("a[" + i + "]" + "と" + "a[" + (a.length -i -1) + "]を交換します。");
			swap(a, i, a.length - i -1); // aは配列、iは最初の要素、a.length - i -1は最後の要素
			for (int j = 0; j < a.length; j++) {
				System.out.print(a[j] + " ");
			}
		}
	}
	
	public static void main(String[] args) {
		Scanner stdIn = new Scanner(System.in);
		
		System.out.print("要素数は：");
		int num = stdIn.nextInt();
		int[] x = new int[num];
		
		System.out.println();
		for (int i = 0; i < num; i++) {
			System.out.print("x[" + i + "] : ");
			x[i] = stdIn.nextInt();
		}
		System.out.println();

		reverse(x);
		System.out.println();
		System.out.println("要素の並びを逆転しました。");
		System.out.println();
		for (int i = 0; i < num; i++) {
			System.out.println("x[" + i + "] = " + x[i]);
		}
	}

}
