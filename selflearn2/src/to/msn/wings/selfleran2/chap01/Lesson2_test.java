package to.msn.wings.selfleran2.chap01;

public class Lesson2_test {

	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ
		System.out.println("占いを行います");
		System.out.println("あなたの名前を入力してください");
		String name = new java.util.Scanner(System.in).nextLine();
		System.out.println("あなたの年齢を入力してください");
		String ageString = new java.util.Scanner(System.in).nextLine();
		int age = Integer.parseInt(ageString);
		int fortune = new java.util.Random().nextInt(4);
		fortune++;
		System.out.println("占い結果が出ました");
		System.out.println(age + "歳の" + name + "さんの運気番号は" + fortune + "です");
		System.out.println("1:大吉 2:中吉 3:吉 4:凶");
		

	}

}
