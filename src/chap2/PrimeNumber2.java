package chap2;

public class PrimeNumber2 {

	public static void main(String[] args) {
		int counter = 0; // 除算の回数
		int ptr = 0; // 得られた素数の個数
		int[] prime = new int[500]; // 素数を格納する配列

		prime[ptr++] = 2; // ２は素数である
		prime[ptr++] = 3; // ３は素数である

		for (int n = 5; n <= 1000; n += 2) { // 対象は基数のみ
			int i;
			for (i = 1; i < ptr; i++) { // 既に得られた素数で割ってみる
				counter++;
				if (n % prime[i] == 0) {
					break;
				}
			}
			if (ptr == i) {
				prime[ptr++] = n;
			}
		}

		for (int i = 0; i < ptr; i++) {
			System.out.println(prime[i]);
		}

		System.out.println("除算を行った回数:" + counter);
	}

}
