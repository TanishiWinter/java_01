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
		
		// long→int変換をする
		long m1 = 10;
		int i1 = (int)m1;
		System.out.println(i1);
		
		// 多次元配列の宣言
		int[][] list = {
				{1,2,3},
				{4,5,6},
				{7,8,9},
		};
		System.out.println(list[2][2]);
		
		// 多次元配列の宣言(ギザギザ配列)
		int[][] list1 = {
				{1,2},
				{3,4,5,6},
				{7,8,9},
		};
		System.out.println(list1[1][3]);
		
		//文字連結の実行(仮)
		var builder = new StringBuilder(1000);
		for (var h = 0; h < 100000; h++) {
			builder.append("いろは");
		}
		var result = builder.toString();
		
	}

}
