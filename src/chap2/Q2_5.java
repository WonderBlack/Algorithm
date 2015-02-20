package chap2;

import java.util.Scanner;

public class Q2_5 {
	
	static void copy (int[] a, int[] b) {
		int j = a.length-1;
		System.out.println(j);
		for (int i = 0; i < a.length; i++) {
			a[i] = b[j];
			j--;
		}
	}
	
	public static void main(String[] args) {
		Scanner stdIn = new Scanner(System.in);
		
		System.out.println("配列の要素数");
		
		int n = stdIn.nextInt();
		int[] a = new int[n];
		System.out.println("配列aを入力");
		for (int i = 0; i < n; i++) {
			System.out.print("a[" + i + "] : ");
			a[i] = stdIn.nextInt();
		}
		
		int[] b = new int[n];
		System.out.println("配列bを入力");
		for (int i = 0; i < n; i++) {
			System.out.print("b[" + i + "] : ");
			b[i] = stdIn.nextInt();
		}
		System.out.println("bの配列をaの配列にコピーします。");
		
		copy(a, b);
		
		System.out.println("配列a");
		for (int i = 0; i < a.length; i++) {
			System.out.print(a[i] + " ");
		}
		System.out.println();
		System.out.println("配列b");
		for (int i = 0; i < b.length; i++) {
			System.out.print(b[i] + " ");
		}
		
		
	}

}
