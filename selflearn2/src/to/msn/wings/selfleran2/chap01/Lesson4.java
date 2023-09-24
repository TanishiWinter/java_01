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

	}

}
