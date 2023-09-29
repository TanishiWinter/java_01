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
		
		int[] arr = new int[]{1,2,3,4,5,6,7,8,9,10};
		Arrays.sort(arr);
		for (int i = 0; i < arr.length; i++) {
			if (arr[i] % 2 == 0) {
				System.out.println(arr[i]);
			}
		}

	}

}
