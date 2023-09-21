package to.msn.wings.selfleran2.chap01;

public class Lesson2 {

	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ
		//エスケープシーケンスを用いた例
		System.out.println("私の好きな記号は二重引用符(\")です");
		
		//乗算練習
		int a;
		int b;
		int c;
		int d;
		a = 100;
		b = 2;
		a++;
		c = a/b;
		d = a%b;
		System.out.println(a);
		System.out.println(c);
		System.out.println(a + "を" + b + "で割った余りは" + d);
		
		//強制的な型変換(イコールの右側に(入れたい型)を入力することで型変換が可能)
		int age = (int)3.2;
		System.out.println(age);
		
		//大きい方の数値の代入命令
		a = 5;
		b = 3;
		int m = Math.max(a, b);
		System.out.println("比較実験" + a + "と" + b + "とでは大きい方は" + m);

	}

}
