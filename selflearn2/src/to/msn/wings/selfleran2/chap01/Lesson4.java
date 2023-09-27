package to.msn.wings.selfleran2.chap01;

public class Lesson4 {

	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ
		//Swich文を利用した条件式
		System.out.println("あなたの運勢を占います");
		int fortune = new java.util.Random().nextInt(5) + 1;
		switch (fortune) {
		case 1:
			System.out.println("大吉");
			break;
		case 2:
			System.out.println("中吉");
			break;
		case 3:
			System.out.println("末吉");
			break;
		case 4:
			System.out.println("吉");
			break;
		case 5:
			System.out.println("凶");
			break;
		}
		
		//乗算
		for (int i = 0; i < 3; i++) {
			System.out.println("現在" + (i + 1) + "週目");
		}
		
		//偶数と奇数で場合分け
		for (int i = 1; i < 11; i++) {
			if (i % 2 == 0) {
				System.out.println(i + "は偶数");
			} else {
				System.out.println(i + "は奇数");
			}
		}
		
		
		int sum = 0;
		int cnt = 0;
		for (int i = 1; i < 11; i++) {
			if(i % 2 == 0) {
				sum += i;
				cnt++;
			}
		}
		System.out.println("1～10までの偶数の合計値は" + sum + "です");
		System.out.println("1～10までの偶数の個数は" + cnt + "です");

	}

}
