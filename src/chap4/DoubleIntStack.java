// １つの配列を共有して２つのスタックを実現するコード
package chap4;

public class DoubleIntStack {

	private int max;// スタックの容量
	private int ptrA;// スタックAのポインタ
	private int ptrB;// スタックBのポインタ
	private int[] stk;// スタックの本体

	// 実行時例外：スタックが空
	public class EmptyIntStackException extends RuntimeException {
		public EmptyIntStackException() {
			System.out.println("スタックは空です。");
		}
	}

	// 実行時例外：スタックが満杯
	public class OverflowIntStackException extends RuntimeException {
		public OverflowIntStackException() {
			System.out.println("スタックは満杯です。");
		}
	}

	// コンストラクタ
	public DoubleIntStack(int capacity) {
		ptrA = 0;// ptrAの低はstk[0]
		ptrB = capacity - 1;// ptrBの低はstk[capacity - 1]つまり配列の最後尾
		// ptrAとptrBの頂上は双方がぶつかった場所になる
		max = capacity;
		try {
			stk = new int[max];// スタック本体用の配列作成
		} catch (OutOfMemoryError e) {// 生成出来なかった
			max = 0;
		}
	}

	// スタックAにxをプッシュ
	public int pushA(int x) throws OverflowIntStackException {
		if ((ptrA + 1) == ptrB) {// スタックは満杯
			throw new OverflowIntStackException();
		}
		return stk[ptrA++] = x;// xを代入後ptrAを１増やす
	}

	// スタックBにxをプッシュ
	public int pushB(int x) throws OverflowIntStackException {
		if (ptrA == (ptrB - 1)) {// スタックは満杯
			throw new OverflowIntStackException();
		}
		return stk[ptrB--] = x;// xを代入後ptrBを１減らす
	}

	// スタックAからデータをポップ（頂上のデータを取り出す）
	public int popA() throws EmptyIntStackException {
		if (ptrA <= 0) {// スタックが空なら
			throw new EmptyIntStackException();
		}
		return stk[--ptrA];// ポインタを１つ戻し最後尾のデータを返却
	}

	// スタックBからデータをポップ（頂上のデータを取り出す）
	public int popB() throws EmptyIntStackException {
		if (ptrB >= (max - 1)) {// スタックが空なら
			throw new EmptyIntStackException();
		}
		return stk[++ptrB];// ポインタを１つ戻し最後尾のデータを返却
	}

	// スタックAからデータをピーク（頂上のデータを覗き見）
	public int peekA() throws EmptyIntStackException {
		if (ptrA <= 0) {// スタックが空なら
			throw new EmptyIntStackException();
		}
		return stk[ptrA - 1];// ポインタの１つ前にある最後尾のデータを返却
	}

	// スタックBからデータをピーク（頂上のデータを覗き見）
	public int peekB() throws EmptyIntStackException {
		if (ptrB >= (max - 1)) {// スタックが空なら
			throw new EmptyIntStackException();
		}
		return stk[ptrB + 1];// ポインタの１つ前にある最後尾のデータを返却
	}

	// スタックAからxを探してインデックスを返す（みつからなければ-1を返す）
	public int indexOfA(int x) {
		for (int i = ptrA - 1; i >= 0; i--) {// 頂上側から線形探索
			if (stk[i] == x) {
				return i;// 探索成功
			}
		}
		return -1;// 探索失敗
	}

	// スタックBからxを探してインデックスを返す（みつからなければ-1を返す）
	public int indexOfB(int x) {
		for (int i = ptrB + 1; i <= (max - 1); i++) {// 頂上側から線形探索
			if (stk[i] == x) {
				return i;// 探索成功
			}
		}
		return -1;// 探索失敗
	}

	// スタックAを空にする
	public void clearA() {
		ptrA = 0;
	}

	// スタックBを空にする
	public void clearB() {
		ptrB = (max - 1);
	}

	// スタックAの容量を返す
	public int capacityA() {
		return ptrB - 1;
	}

	// スタックBの容量を返す
	public int capacityB() {
		return (max - 1) - (ptrA + 1);
	}

	// スタックAに積まれているデータ数を返す
	public int sizeA() {
		return ptrA;
	}

	// スタックBに積まれているデータ数を返す
	public int sizeB() {
		return (max - 1) - ptrB;
	}

	// スタックAは空であるか
	public boolean isEmptyA() {
		return ptrA <= 0;
	}

	// スタックBは空であるか
	public boolean isEmptyB() {
		return ptrB >= (max - 1);
	}

	// スタックAは満杯であるか
	public boolean isFullA() {
		return ptrA >= (ptrB - 1);
	}

	// スタックBは満杯であるか
	public boolean isFullB() {
		return ptrB <= (ptrA + 1);
	}

	// スタックAの全データを低→頂上の順に表示
	public void dumpA() {
		if (ptrA <= 0) {
			System.out.println("スタックは空です。");
		} else {
			for (int i = 0; i < ptrA; i++) {
				System.out.print(stk[i] + " ");
			}
			System.out.println();
		}
	}

	// スタックBの全データを低→頂上の順に表示
	public void dumpB() {
		if (ptrB >= (max - 1)) {
			System.out.println("スタックは空です。");
		} else {
			for (int i = (max - 1); i > ptrB; i--) {
				System.out.print(stk[i] + " ");
			}
			System.out.println();
		}
	}

}
