package to.msn.wings.selfleran2.chap01;

public class Hukusyuu {

	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ
		
		//復習しました
		for(int i = 10; i > 1; i--) {
			if(i%2==0) {
				System.out.println(i);
			}
		}
		
		//合計値と個数
		int sum = 0;
		int cnt = 0;
		
		for(int i = 1; i < 11; i++) {
			if(i%2==0) {
				sum += i;
				cnt++ ;
			}
		}
		System.out.println("合計値は"+sum+"、個数は"+cnt);

	}

}
