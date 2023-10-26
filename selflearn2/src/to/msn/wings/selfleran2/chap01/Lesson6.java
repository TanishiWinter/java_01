package to.msn.wings.selfleran2.chap01;

public class Lesson6 {

	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ
		
		int[] scores = {20, 30, 40,50, 80};
	    int sum = 0;
	    
	    for(int i = 0; i < scores.length; i++) {
	    	sum += scores[i];
	    }
	    
	    int avr = sum/scores.length;
	    
		System.out.print("合計点は" + sum +  "\n平均点は" + avr);
		
		int cnt = 0;
		
		for(int i = 0; i < scores.length; i++) {
			if(scores[i]>=50) {
				cnt ++;
			}
		}
		
		System.out.println("\n50点以上は"+cnt+"個でした");
		
		int[] seq = new int[10];
		
		//塩基配列をランダムに生成
		for(int i = 0; i < seq.length; i++) {
			seq[i] = new java.util.Random().nextInt(4);
		}
		
		for(int i = 0; i < seq.length; i++) {
			char[] base = {'A','T','G','C'};
			System.out.print(base[seq[i]]);
			
			int[][] score = new int[2][3];
			score[0][0] = 40;
			score[0][1] = 50;
			score[0][2] = 60;
			score[1][0] = 70;
			score[1][1] = 80;
			score[1][2] = 90;
			System.out.print(score[1][1]);
			
		}

	}

}
