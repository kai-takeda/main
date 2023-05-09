package hero_1;

import java.util.Objects;

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
public class main {

	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ
		// インスタンス化
		hero1 heroes = new hero1();
		// null判定
		if (Objects.isNull(heroes)) {
            System.out.println("Object is Null");
        } else {
        	heroes.setName("竹田");
        	heroes.goFight();
        }
		
		
		
		

	}

}
