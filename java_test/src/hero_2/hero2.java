package hero_2;

import java.util.Random;

/*

名前を入力したら下記がコンソールに出力されるように作ってください
	条件：数値は毎回変わるように作ってください
	 	 サブクラスを使用してください
		 スーパークラスを使用してください
		 getterとsetterを使用してください
		 packageを2つ作ってメインと処理を分けてください
		 命名する場合は規則にのっとってください
		 コンストラクタを使用してください

	こんにちは 「 名前 」 さん
	ステータス
	HP：849
	MP：862
	攻撃力：375
	素早さ：937
	防御力：24

	さあ冒険に出かけよう！

*/

public class hero2 {
	private String name;
	
	Random rand = new Random();
	// セッターを作成
	public void setName(String name) {
		this.name = name;
		
	}
	// ゲッターを作成
	public String getName() {
		return this.name;
	}
	// 表示する勇者のステータスを作成。
	public void goFight() {
		System.out.println("こんにちは「" + this.getName() + "さん");
		System.out.println("ステータス");
		System.out.println("HP：" + rand.nextInt(1000));
		System.out.println("MP：" + rand.nextInt(1000));
		System.out.println("攻撃力：" + rand.nextInt(1000));
		System.out.println("素早さ：" + rand.nextInt(1000));
		System.out.println("防御力" + rand.nextInt(1000));
		System.out.println("");
		System.out.println("さあ冒険に出かけよう！");
	}

}

