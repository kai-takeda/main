package man;

import java.util.Objects;

public class Main {
	
	/*問題1：インスタンスフィールドを定義してください

	フィールド名	データ型
	name	string
	age	int
	height	double
	問題2：コンストラクタを定義してください（下記それぞれの引数）

	name,age,height

	問題3：コンストラクタの中で各インスタンスフィールドに値をセットしてください

	インスタンスメソッド
	問題4：インスタンスフィールド「weight」を定義し、コンストラクタの中で値をセットしてください（double型）

	問題5：Main.javaの引数にweightの60を入れてください

	問題6：インスタンスメソッド「bmi」を定義してください（戻り値：double）

	問題7：bmiメソッドでインスタンスのBMIを返すようにしてください

	問題8：インスタンスメソッド「print」を定義してください（戻り値：void）

	問題9：printメソッドの中でthisを用いて「名前は〇〇です」,「年は〇〇です」「BMIは○○です」と出力してください

	問題10：人数の合計を「合計○人です」と出力してください。
	
	 */

	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ
		// インスタンス化
		Person person1 = new Person("鈴木太郎", 20, 1.7, 60);
		// null判定
		if (Objects.isNull(person1)) {
            System.out.println("Object is Null");
		} else {
			System.out.println(person1.name);
		    System.out.println(person1.age);
		    System.out.println(person1.height);
		    person1.print();
		}
	    
	    Person.printCount();

	}

}
