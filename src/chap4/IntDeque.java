package chap4;

public class IntDeque {

	private int max;// キューの容量
	private int front;// 先頭要素カーソル
	private int rear;// 末尾要素カーソル
	private int num;// 現在のデータ数
	private int[] que;// キューの本体

	// 実行時例外：キューが空
	public class EmptyIntDequeException extends RuntimeException {
		public EmptyIntDequeException() {

		}
	}

	// 実行時例外：キューが満杯
	public class OverflowIntDequeException extends RuntimeException {
		public OverflowIntDequeException() {

		}
	}

	// コンストラクタ
	public IntDeque(int capacity) {
		num = front = 0;
		rear = 1;
		max = capacity;
		try {
			que = new int[max];// キュー本体用の配列を生成
		} catch (OutOfMemoryError e) {// 生成できなかった
			max = 0;
		}
	}

	// フロントエンキュー
	public int frontEnque(int x) throws OverflowIntDequeException {
		if (num >= max) {
			throw new OverflowIntDequeException();// キューは満杯
		}
		que[front] = x;// frontカーソルにxを代入
		front--;// frontカーソルを１つ前にずらす
		if (front == -1) {// frontカーソルが０以下になったら
			front = max - 1;// 配列の後尾に移る
		}
		num++;// データ数numをインクリメント
		System.out.println("frontは" + front);

		return x;
	}

	// リアエンキュー
	public int rearEnque(int x) throws OverflowIntDequeException {
		if (num >= max) {
			throw new OverflowIntDequeException();// キューは満杯
		}
		que[rear] = x;// rearカーソルにxを代入
		rear++;// rearカーソルを１つ後ろにずらす
		if (rear == max) {// rearカーソルが配列の後尾を超えたら
			rear = 0;// 配列の先頭に移る
		}
		num++;
		return x;
	}

	// フロントデキュー
	public int frontDeque() throws EmptyIntDequeException {
		if (num <= 0) {
			throw new EmptyIntDequeException();// キューは空
		}
		int x = que[front];// frontカーソルの値をxに代入
		front++;// frontカーソルを１つ後ろにずらす
		if (front == max) {// frontカーソルが配列の後尾を超えたら
			front = 0;// 配列の先頭に移る
		}
		num--;
		return x;
	}

	// リアデキュー
	public int rearDeque() throws EmptyIntDequeException {
		if (num <= 0) {
			throw new EmptyIntDequeException();// キューは空
		}
		int x = que[rear];// rearカーソルの値をxに代入
		rear--;// rearカーソルを１つ前にずらす
		if (rear == -1) {// rearカーソルが０以下になったら
			rear = max - 1;// 配列の後尾に移る
		}
		num--;
		return x;
	}

	// キューからfrontのデータをピーク（先頭データを覗く）
	public int frontPeek() throws EmptyIntDequeException {
		if (num <= 0) {
			throw new EmptyIntDequeException();// キューは空
		}
		return que[front];
	}
	
	// キューからrearのデータをピーク（後尾データを覗く）
		public int rearPeek() throws EmptyIntDequeException {
			if (num <= 0) {
				throw new EmptyIntDequeException();// キューは空
			}
			return que[rear];
		}

	// キューからxを探してインデックス（見つからなければ-1）を返す
	public int indexOf(int x) {
		for (int i = 0; i < num; i++) {
			int idx = (i + front) % max;
			if (que[idx] == x) {// 探索成功　
				return idx;
			}
		}
		return -1;// 探索失敗
	}

	// キューを空にする　
	public void clear() {
		num = front = 0;
		rear = 1;
	}

	// キューの容量を返す
	public int capacity() {
		return max;
	}

	// キューに蓄えられているデータ数を返す
	public int size() {
		return num;
	}

	// キューは空であるか
	public boolean isEmpty() {
		return num <= 0;
	}

	// キューは満杯であるか
	public boolean isFull() {
		return num >= max;
	}

	// キュー内の全データを先頭→末尾の順に表示
	public void dump() {
		int idx;
		if (num <= 0) {
			System.out.println("キューは空です。");
		} else {
			for (int i = 0; i < num; i++) {
				idx = (i + 1 + front) % max;
				//System.out.println("idxは" + idx);
				System.out.print(que[idx] + " ");
			}
			System.out.println();
		}
	}

	// 検索
	public int search(int x) {
		for (int i = 0; i < num; i++) {
			int idx = (i + front) % max;
			System.out.println("idxは" + idx);
			if (que[idx] == x) {// 探索成功　
				return i;
			}
		}
		return -1;// 探索失敗
	}
}
