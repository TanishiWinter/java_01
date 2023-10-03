package to.msn.wings.selfleran2.chap01;

public class Testtaisaku {

	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ
		//一問目
		for(int i = 10; i > 0; i--) {
			if (i % 2 == 0) {
				System.out.println(i);
			}
		}
		
		//二問目
		int sum = 0;
		int cnt = 0;
		for(int i = 1; i < 11; i++) {
			if(i % 2 == 0) {
			    sum += i; 
			    ++cnt;
			}
		}
		
		System.out.println("偶数の個数は" + cnt + "偶数の合計は" + sum);
		
		//三問目
		for(int i = 1; i < 11; i++) {
			if(i == 10) {
				System.out.print(i);
			}else {
				System.out.print(i + ",");
			}
		}
		
		//三問目別解
		for(int i = 1; i < 11; i++) {
			System.out.print(i);
			if(i != 10) {
				System.out.print(",");
			}
		}
		
		//三問目別解2
		int[] number = {1,2,3,4,5,6,7,8,9,10};
		for(int i = 0; i < number.length; i++) {
			System.out.print(number[i]);
			if(number[i] != 10) {
				System.out.print(",");
			}
		}
		
		//四問目
		int x[] = new int[20];
		x[0] = 0;
		String str = "";
		for (int i = 1; i < 20; i++) {
		x[i] = x[i - 1] + 5;
		}
		for(int i = 1; i < 11; i++) {
			if(x[i] % 2 != 0) {
				str += String.valueOf(x[i])+",";
			}
		}
		System.out.print(str.substring(0, str.length()));
		str = "";
		for(int i = 11; i < 20; i++) {
			if(x[i] % 2 == 0) {
				str += String.valueOf(x[i])+",";
			}
		
		}
		System.out.print(str.substring(0, str.length()-1));
			
	}

}
