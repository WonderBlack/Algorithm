package chap1;

import java.util.Scanner;

public class Med3_o {

//	static int med3(int a, int b, int c) {
//		if (a >= b)
//			if (b >= c)
//				return b;
//			else if (a <= c)
//				return a;
//			else
//				return c;
//		else if (a > c)
//			return a;
//		else if (b > c)
//			return c;
//		else
//			return b;
//	}

	 static int med3(int a, int b, int c) {
	 int med = 0;
	
	 if (a <= b && a >= c || a >= b && a <= c) {
	 med = a;
	 }
	 if (b <= a && b >= c || b >= a && b <= c) {
	 med = b;
	 }
	 if (c <= a && c >= b || c >= a && c <= b) {
	 med = c;
	 }
	 return med;
	 }

	 public static void main(String[] args) {
	 Scanner stdIn = new Scanner(System.in);
	 System.out.println("三つの整数の中央値を求めます。");
	 System.out.println("aの値：");
	 int a = stdIn.nextInt();
	 System.out.println("bの値：");
	 int b = stdIn.nextInt();
	 System.out.println("cの値：");
	 int c = stdIn.nextInt();
	 int med = med3(a, b, c);
	 System.out.println("中央値は" + med);
	
	 }

//	public static void main(String[] args) {
//		System.out.println("med3(3,2,1) = " + med3(3, 2, 1)); // a＞b＞c
//		System.out.println("med3(3,2,2) = " + med3(3, 2, 2)); // a＞b＝c
//		System.out.println("med3(3,1,2) = " + med3(3, 1, 2)); // a＞c＞b
//		System.out.println("med3(3,2,3) = " + med3(3, 2, 3)); // a＝c＞b
//		System.out.println("med3(2,1,3) = " + med3(2, 1, 3)); // c＞a＞b
//		System.out.println("med3(3,3,2) = " + med3(3, 3, 2)); // a＝b＞c
//		System.out.println("med3(3,3,3) = " + med3(3, 3, 3)); // a＝b＝c
//		System.out.println("med3(2,2,3) = " + med3(2, 2, 3)); // c＞a＝b
//		System.out.println("med3(2,3,1) = " + med3(2, 3, 1)); // b＞a＞c
//		System.out.println("med3(2,3,2) = " + med3(2, 3, 2)); // b＞a＝c
//		System.out.println("med3(1,3,2) = " + med3(1, 3, 2)); // b＞c＞a
//		System.out.println("med3(2,3,3) = " + med3(2, 3, 3)); // b＝c＞a
//		System.out.println("med3(1,2,3) = " + med3(1, 2, 3)); // c＞b＞a
//	}

}
