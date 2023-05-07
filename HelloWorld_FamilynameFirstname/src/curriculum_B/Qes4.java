package curriculum_B;

public class Qes4 {

	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ
		// 計算用の配列を２つ作成する
		int[] nums = {1, 2, 3, 4, 5, 6, 7, 8, 9};
		int[] nums1 = {1, 2, 3, 4, 5, 6, 7, 8, 9};
		
		
		// 掛け算の九九をfor文で作成
		for (int num:nums) {
			for (int num1:nums1) {
				// 最小文字数を２桁に設定、満たない場合は左に0をつける
				System.out.print(String.format("%02d * %02d =%02d", num, num1, num*num1));
				if (num1 == 9) {
					continue;
				}
				System.out.print(" || ");
			}
			System.out.println();
		}
		
		
	}

}
