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
	private int hp;
	private int mp;
	private int power;
	private int speed;
	private int protect;
	
	Random rand = new Random();
	// セッターを作成
	public void setName(String name) {
		this.name = name;
	}
	public void setHP(int hp) {
		this.hp = hp;
	}
	public void setMP(int mp) {
		this.mp = mp;
	}
	public void setPower(int power) {
		this.power = power;
	}
	public void setSpeed(int speed) {
		this.speed = speed;
	}
	public void setProtect(int protect) {
		this.protect = protect;
	}
	
	// ゲッターを作成
	public String getName() {
		return this.name;
	}
	public int getHP() {
		return this.hp;
	}
	public int getMP() {
		return this.mp;
	}
	public int getPower() {
		return this.power;
	}
	public int getSpeed() {
		return this.speed;
	}
	public int getProtect() {
		return this.protect;
	}
	// 表示する勇者のステータスを作成。
	public void goFight() {
		System.out.println("こんにちは「" + this.getName() + "」さん");
		System.out.println("ステータス");
		System.out.println("HP：" + this.getHP());
		System.out.println("MP：" + this.getMP());
		System.out.println("攻撃力：" + this.getPower());
		System.out.println("素早さ：" + this.getSpeed());
		System.out.println("防御力：" + this.getProtect());
		System.out.println("");
		System.out.println("さあ冒険に出かけよう！");
		System.out.println();
	}

}

