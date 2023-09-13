package to.msn.wings.selfleran2.chap01;

 import java.time.LocalDateTime;

public class Hello {

	public static void main(String[] args) {
		LocalDateTime time = LocalDateTime.now();
		System.out.println(time);
		// TODO 自動生成されたメソッド・スタブ

		// テスト
		final double TAX = 1.08;
		int price = 1000;
		double sum = price * TAX;
		System.out.println(sum);
		
		// long→int変換は出来ない、なのでfloatに変換もしくはdoubleもあり
		long m = 10;
		float i = m;
		System.out.println(i);
		
	}

}
