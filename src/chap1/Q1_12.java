package chap1;

public class Q1_12 {
	public static void main(String[] args) {
		System.out.printf("   ");
		System.out.printf("|");
		for (int j = 1; j <= 9; j++) {
			System.out.printf("%3d", 1 * j);
		}
		System.out.println();
		for (int i = 1; i <= 10; i++) {
			if (i == 2) {
				System.out.printf("%1s", "+");
			}
			System.out.printf("%3s", "---");
		}
		System.out.println();
		for (int j = 1; j <= 9; j++) {
			for (int i = 0; i <= 9; i++) {
				if (i == 0) {
					System.out.printf("%1s", " ");
					System.out.printf("%1d", j);
					System.out.printf("%1s", " ");
					System.out.printf("%1s", "|");
				} else {
					System.out.printf("%3d", j * i);
				}

			}
			System.out.println();
		}
	}
}
