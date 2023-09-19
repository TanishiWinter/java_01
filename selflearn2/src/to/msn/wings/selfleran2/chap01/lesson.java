package to.msn.wings.selfleran2.chap01;

public class lesson {

	public static void main(String[] args) {
		//変数の再代入
		int age;
		age = 20;
		System.out.println("私の年齢は" + age);
		age = 31;
		System.out.println("・・・いや、本当の年齢は" + age);

		//パイの面積計算
		double pi = 3.14;
		int pie = 5;
		System.out.println("半径" + pie + "cmのパイの面積は、");
		System.out.println(pie * pie * pi);
		
		System.out.println("このパイを倍にします。");
		pie = 10;
		System.out.println("半径" + pie + "cmのパイの面積は、");
		System.out.println(pie * pie * pi);
		
	}

}
