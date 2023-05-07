package curriculum_B;

public class Qes_5 {

	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ
		
		int[] nums = {1, 2, 3, 4, 5, 6, 7, 8, 9};
		int[] nums1 = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11};
		
		
		// 掛け算の九九をfor文で作成
		for (int num:nums) {
			for (int num1:nums1) {
				// 最小文字数を２桁に設定、満たない場合は左に0をつける
				// num1の値が10より小さい場合num1を２桁に
				if (num1 <10) {
					System.out.print(String.format("%02d * %02d =%03d", num1, num, num*num1));
				// それ以外の場合num1を３桁に
				} else {
					System.out.print(String.format("%03d * %02d =%03d", num1, num, num*num1));
				}
				// 一番右の||は削除
				if (num1 == 11) {
					continue;
				}
				// 計算式の間に||を入力
				System.out.print(" || ");
			}
			// 改行処理
			System.out.println();
		}

	}

}
