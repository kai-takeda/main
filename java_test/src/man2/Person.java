package man2;
/*
問題1：インスタンスフィールドに「lastName」を追加しましょう

コンストラクタのオーバーロード
問題2：lastNameの値を引数で受け取るコンストラクタを追加で定義してください
※順番はfirstNameの次

問題3：作成したコンストラクタの中に「Person.count++; this.lastName;」を追加しlastNameフィールドの値をセットしてください
*/

public class Person {
	// インスタンスフィールドを定義
	public static int count = 0;
	public String firstName;
	public String lastName;
	public int age;
	public double height, weight;
	// コンストラクタを定義
	Person(String firstName, String lastName, int age, double height, double weight){
		Person.count++;
		this.firstName = firstName;
		this.lastName = lastName;
		this.age = age;
		this.height = height;
		this.weight = weight;
	}
	// フルネームを表示するメソッドを定義
	public String fullName(){
		return this.firstName + this.lastName;
	}
	// 人物の情報を表示するprintメソッドを定義
	public void print(){
		System.out.println("名前は" + this.fullName() + "です");
		System.out.println("年は" + this.age + "です");
	}
	// bmiを表示するメソッドを定義
	public double bmi(){
		return this.weight / this.height / this.height;
	}
	// 生成された人数を表示するメソッドを定義
	public static void printCount(){
		System.out.println("合計" + Person.count + "人です");
	}

}
