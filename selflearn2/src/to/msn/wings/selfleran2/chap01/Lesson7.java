package to.msn.wings.selfleran2.chap01;

public class Lesson7 {
	
	public static int adda(int x, int y) {
		int ansa = x + y;
		return ansa;
	}

	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ
		
		System.out.println("メソッドを呼び出します");
		hello("湊");
		hello("朝香");
		hello("菅原");
		add(100,20);
		add(200,50);
		int ansa = adda(100, 10);
		int hat = adda(200,100);
		System.out.println(ansa +","+hat);
		System.out.println("呼び出し完了");

	}
	
	public static void hello(String name) {
		System.out.println(name+"さんいらっしゃい");
	}
	
	public static void add(int x,int y) {
		int ans = x+y;
		System.out.println(x+"+"+y+"="+ans);
	}

}
