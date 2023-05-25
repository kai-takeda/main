package man3;



public class Person {
	// インスタンスフィールドを定義
	public static int count = 0;
	public String firstName;
	public String lastName;
	public int age;
	public double height;
	public double weight;
	
	// コンストラクタを定義
	Person(String name, String lastName, int age, double height, double weight){
		Person.count++;
		this.firstName = name;
		this.lastName = lastName;
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
		System.out.println("名前は" + this.fullName()+ "です");
		System.out.println("年は" + this.age + "です");
	}
	// 生成されたインスタンスの数を表示するprintCountメソッドを定義
	public static void printCount() {
		System.out.println("合計は" + Person.count + "人です");
	}
	// フルネームを表示
	public String fullName(){
		return this.firstName + this.lastName;
	}
	// buyメソッドを定義
	public void buy(Car car) {
		car.setOwner(this.fullName());
		System.out.println(car.getOwner() + "が購入しました");
	}
	// buyメソッドを定義
	public void buy(Bicycle bicycle) {
		bicycle.setOwner(this.fullName());
		System.out.println(bicycle.getOwner() + "が購入しました");
	}


}
