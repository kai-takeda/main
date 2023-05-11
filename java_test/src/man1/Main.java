package man1;

public class Main {
    /*
	問題1：クラスフィールド「count」を定義してください（初期値：0,データ型：int）

	問題2：Personコンストラクタの中でクラスフィールドcountに1を足してください

	問題3：Main.javaで System.out.printlnを使い「合計〇〇人です」と出力してください。〇〇はcountの値です。
	
	問題4：クラスメソッド「printCount」を定義してください（データ型：void）

	問題5：クラスメソッドの中にクラスフィールド「count」を用いて「合計〇〇人です」と出力してください

	問題6：クラスメソッド「printCount」を呼び出してください
    */

	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ
		Person person1 = new Person("鈴木太郎", 20, 1.7, 60);
		person1.print();

		Person person2 = new Person("山田花子", 22, 1.5, 40);
		person2.print();
		// System.out.printlnを用いて人数を表示
		System.out.println("合計人数は" + Person.count + "です");
		// printCountメソッドを用いて人数を表示
		Person.printCount();
		


	}
	

}
