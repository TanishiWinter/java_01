package to.msn.wings.selfleran2.chap01;

 import java.time.LocalDateTime;

public class Hello {

	public static void main(String[] args) {
		LocalDateTime time = LocalDateTime.now();
		System.out.println(time);
		// TODO 自動生成されたメソッド・スタブ

		final double TAX = 1.08;
		int price = 1000;
		double sum = price * TAX;
		System.out.print(sum);
		
	}

}
