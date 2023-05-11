package man1;

/*
問題1：クラスフィールド「count」を定義してください（初期値：0,データ型：int）

問題2：Personコンストラクタの中でクラスフィールドcountに1を足してください

問題3：Main.javaで System.out.printlnを使い「合計〇〇人です」と出力してください。〇〇はcountの値です。

問題4：クラスメソッド「printCount」を定義してください（データ型：void）

問題5：クラスメソッドの中にクラスフィールド「count」を用いて「合計〇〇人です」と出力してください

問題6：クラスメソッド「printCount」を呼び出してください
*/
public class Person {
	// インスタンスフィールドを定義
	public static int count = 0;
	public String name;
	public int age;
	public double height;
	public double weight;
	
	// コンストラクタを定義
	Person(String name, int age, double height, double weight){
		Person.count++;
		this.name = name;
		this.age = age;
		this.height = height;
		this.weight = weight;
	}
	// bmiメソッドを定義
	public double bmi(){
		return this.weight / this.height / this.height;
	}
	// 人物の情報を表示するprintメソッドを定義
	public void print(){
		System.out.println("名前は" + this.name + "です");
		System.out.println("年は" + this.age + "です");
	}
	// 生成されたインスタンスの数を表示するprintCountメソッドを定義
	public static void printCount() {
		System.out.println("合計は" + Person.count + "人です");
	}

}
