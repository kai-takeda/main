package prefecture1;

import java.util.Arrays;
import java.util.Objects;
import java.util.Scanner;

import prefecture2.prefecture_kinds;

public class Main {
	
/*
 	
 	0, "北海道:札幌市:83424"
	1, "青森県:青森市:9646"
	2, "岩手県:盛岡市:15275"
	3, "宮城県:仙台市:7282"
	4, "秋田県:秋田市:11638"
	5, "山形県:山形市:9323"
	6, "福島県:福島市:13784"
	7, "茨城県:水戸市:6097"
	8, "栃木県:宇都宮市:6408"
	9, "群馬県:前橋市:6362"
	10, "埼玉県:さいたま市:3798"
 	
 	コンソールに数字と昇順・降順の値が入力されると上記配列に対応する
 	都道府県がソートされてコンソールに出力されるように作ってください
   	※Packageを2つ作ってください
   	※複数選択できるようにしてください
   	
   	例:
   	8,5,9,.....
   	と入力された場合（昇順）
   	
   	都道府県名：山形県
	県庁所在地：山形市
	面積：9323.0km2
   	
   	都道府県名：栃木県
	県庁所在地：宇都宮市
	面積：6408.0km2

   	都道府県名：群馬県
	県庁所在地：前橋市
	面積：6362.0km2
	
 */

	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ
		// インスタンスを作成
		prefecture_kinds pre0 = new prefecture_kinds(0, "北海道", "札幌市", 83424);
		prefecture_kinds pre1 = new prefecture_kinds(1, "青森県", "青森市", 9646);
		prefecture_kinds pre2 = new prefecture_kinds(2, "岩手県", "盛岡市", 15275);
		prefecture_kinds pre3 = new prefecture_kinds(3, "宮城県", "仙台市", 7282);
		prefecture_kinds pre4 = new prefecture_kinds(4,"秋田県", "秋田市", 11638);
		prefecture_kinds pre5 = new prefecture_kinds(5, "山形県", "山形市", 9323);
		prefecture_kinds pre6 = new prefecture_kinds(6, "福島県", "福島市", 13784);
		prefecture_kinds pre7 = new prefecture_kinds(7, "茨城県", "水戸市", 6097);
		prefecture_kinds pre8 = new prefecture_kinds(8, "栃木県", "宇都宮市", 6408);
		prefecture_kinds pre9 = new prefecture_kinds(9, "群馬県", "前橋市", 6362);
		prefecture_kinds pre10 = new prefecture_kinds(10, "埼玉県", "さいたま市", 3798);
		
		// 作成したインスタンスを配列に代入
		prefecture_kinds[] pre = new prefecture_kinds[11];
		pre[0] = pre0;
		pre[1] = pre1;
		pre[2] = pre2;
		pre[3] = pre3;
		pre[4] = pre4;
		pre[5] = pre5;
		pre[6] = pre6;
		pre[7] = pre7;
		pre[8] = pre8;
		pre[9] = pre9;
		pre[10] = pre10;
		
		Scanner scanner = new Scanner(System.in);
		// 昇順か降順どちらにするか決める
		System.out.println("昇順か降順どちらにするか入力してください");
		String order = scanner.nextLine();
		// 数字を入力させる
		System.out.println("数字を入力してください(0-11の間)");
		String numberS = scanner.nextLine();
		// 入力した数字を,で分割する
		String[] numbers = numberS.split(",");
		
		if (Objects.isNull(pre)) {
            System.out.println("Object is Null");
		} else {
			// 文字列として受け取った数字をint型に変更
			int[] nums = new int[numbers.length];
			for(int i = 0; i < numbers.length; i++) {
				nums[i] = Integer.parseInt(numbers[i]);
			}
			// 昇順に並び替える
			if (order.equals("昇順")) {
				Arrays.sort(nums);
				for (int w = 0; w < nums.length; w++) {
					pre[nums[w]].show();
					System.out.println("");
				}
			// 光順に並び替える
			} else if(order.equals("降順")){
				Arrays.sort(nums);

				for (int f = 0, l = nums.length - 1; f < l; f++, l--){
				  int temp = nums[f];
				  nums[f]  = nums[l];
				  nums[l] = temp;
				}
				for (int e = 0; e < nums.length; e++) {
					pre[nums[e]].show();
					System.out.println("");
				}
			}
		
		}
		
		
		

	}

}
