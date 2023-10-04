package to.msn.wings.selfleran2.chap01;

public class Another_ansor {

	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ
		
		//三問目
		Boolean flg = true;
				for(int i = 1; i < 11; i++) {
					if(flg) {
						System.out.print(i);
						flg = false;
					}else {
						System.out.print("," + i);
					}
				}
				
				//四問目
				int x[] = new int[20];
				x[0] = 0;
				String str = "";
				flg = true;
				
				for (int i = 1; i < 20; i++) {
				x[i] = x[i - 1] + 5;
				}
				
				//[1]～[10]
				for(int i = 1; i < 11; i++) {
					if(x[i] % 2 != 0) {
						if(flg) {
						  str += x[i];
						  flg = false;
						}else {
						  str += "," + x[i];
						}
					}
				}
				System.out.println("\n奇数：" + str);
				str = "";
				flg = true;
				
				//[11]～[20]
				for(int i = 11; i < 20; i++) {
					if(x[i] % 2 == 0) {
						if(flg) {
							  str += x[i];
							  flg = false;
							}else {
							  str += "," + x[i];
						}
					}
				
				}
				System.out.println("偶数：" + str);

	}

}
