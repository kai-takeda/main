package hero_1;

import java.util.Objects;
import java.util.Scanner;

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
		// scannerをインスタンス化
		Scanner scanner = new Scanner(System.in);
		// それぞれの数値を入力してもらう
		System.out.println("名前を入力してください");
		String name1 = scanner.next();
		System.out.println("HPを入力してください");
		int hp1 = scanner.nextInt();
		System.out.println("MPを入力してください");
		int mp1 = scanner.nextInt();
		System.out.println("攻撃力を入力してください");
		int power1 = scanner.nextInt();
		System.out.println("素早さを入力してください");
		int speed1 = scanner.nextInt();
		System.out.println("防御力を入力してください");
		int protect1 = scanner.nextInt();
		// インスタンス化
		hero1 heroes = new hero1();
		// null判定
		if (Objects.isNull(heroes)) {
            System.out.println("Object is Null");
        } else {
        	heroes.setName(name1);
        	heroes.setHP(hp1);
        	heroes.setMP(mp1);
        	heroes.setPower(power1);
        	heroes.setSpeed(speed1);
        	heroes.setProtect(protect1);
        	heroes.goFight();
        }
		
		
		
		

	}

}
