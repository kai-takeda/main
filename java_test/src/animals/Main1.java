package animals;

import java.util.Objects;
import java.util.Scanner;

public class Main1 {
	
	/*
	 
 	コンソールに下記が入力されたときにコンソール出力結果がコンソールに表示されるように作ってください
 	ライオン:2.1:80,ゾウ:3.2:40,パンダ:1.9:30,チンパンジー:0.94:25,シマウマ:2.4:65,インコ:0.1:50
  	
  	コンソール出力結果
  	
  	コンソールに文字を入力してください
  	動物名：ライオン
	体長：2.1m
	速度：80km/h
	学名：パンテラ レオ
	
	動物名：ゾウ
	体長：3.2m
	速度：40km/h
	学名：ロキソドンタ・サイクロティス
	
	動物名：パンダ
	体長：1.9m
	速度：30km/h
	学名：アイルロポダ・メラノレウカ
	
	動物名：チンパンジー
	体長：0.94m
	速度：25km/h
	学名：パン・トゥログロディテス
	
	動物名：シマウマ
	体長：2.4m
	速度：65km/h
	学名：チャップマンシマウマ
	
	動物名：インコ
	体長：0.1m
	速度：50km/h
	学名：不明

  
  */

	public static void main(String[] args) {
		
		
		
		Scanner scanner = new Scanner(System.in);
		System.out.println("コンソールに文字を入力してください");
		// コンソールの文字列を取得
		String allTypes = scanner.nextLine();
		// ,で文字列を区切り配列化する
		String[] animal_kinds = allTypes.split(",");
		for (int i = 0; i < animal_kinds.length; i++) {
			// 配列をさらに：で区切る。
			String[] animal_one = animal_kinds[i].split(":");
			// インスタンス化する
			animals_kind animal = new animals_kind();
			// 値をセッターを使って代入する
			if (Objects.isNull(animal)) {
	            System.out.println("Object is Null");
	        } else {
	        	animal.setName(animal_one[0]);
				double d = Double.parseDouble(animal_one[1]);
				animal.setHeight(d);
				int num = Integer.parseInt(animal_one[2]);
				animal.setSpeed(num);
				// switch文で名前に応じた学名をセットする
				switch(animal_one[0]) {
				case "ライオン":
					animal.setSname("パンテラ レオ");
					break;
				case "ゾウ":
					animal.setSname("ロキソドンタ・サイクロティス");
					break;
				case "パンダ":
					animal.setSname("アイルロポダ・メラノレウカ");
					break;
				case "チンパンジー":
					animal.setSname("パン・トゥログロディテス");
					break;
				case "シマウマ":
					animal.setSname("チャップマンシマウマ");
					break;
				case "インコ":
					animal.setSname("不明");
					break;
				}
				// 表示する
				animal.show();
	        }
			
		
		
			
			
			
		}
		

	}

}
