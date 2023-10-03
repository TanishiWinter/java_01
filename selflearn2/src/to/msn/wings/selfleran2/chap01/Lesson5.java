package to.msn.wings.selfleran2.chap01;

import java.util.Arrays;

public class Lesson5 {

	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ

		for (int i = 1; i < 11; i++) {
			if (i % 2 == 0) {
				System.out.println(i);
				
			}
		}
		
		//テスト
		int[] arr = new int[]{1,2,3,4,5,6,7,8,9,10};
		Arrays.sort(arr);
		for (int i = 0; i < arr.length; i++) {
			if (arr[i] % 2 == 0) {
				System.out.println(arr[i]);
			}
		}
		
		int[] x = new int[20];
		String str = "";
		x[0] = 0;
		
		for(int i = 1; i < 20; i++) {
			x[i] = x[i - 1] + 5;

		}
		
		for(int i = 1; i < 11; i++) {
			if(x[i] % 2 !=0) {
				str += String.valueOf(x[i])+",";
			}
		}
		System.out.print(str);
		str = "";
		
		for(int i = 11; i < 20; i++) {
			if(x[i] % 2 == 0) {
				str += String.valueOf(x[i])+",";
			}
		}
		System.out.print(str.substring(0, str.length()-1));
		
		for(int i = 1; i < 11; i++) {
			System.out.print(i);
			if(i != 10) {
				System.out.print(",");
			}
		}
		int number[] = {1,2,3,4,5,6,7,8,9,10};
		for(int i = 0; i < number.length; i++) {
			System.out.print(number[i]);
			if(number[i] != 10) {
				System.out.print(",");
			}
		}
		
		int sum = 0;
		int cnt = 0;
		for(int i = 1; i < 11; i++) {
			if(i % 2 == 0) {
				sum += i;
				++cnt;
			}
		}
		System.out.print("数値の合計は" + sum + "個数は" + cnt);

	}

}
