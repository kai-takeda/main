package curriculum_A;

public class Qes1_13 {
	

	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ
		// バイト型
		byte byt;
		// 短整数型
		short sNum;
		// 整数型
		int num;
		// 長整数型
		long lNum; 
		// 単精度浮動小数点数
		float fNum;
		// 倍単精度浮動小数点数
		double dNum;
		//文字型
		char cStr;
		//文字列型
		String str;
		//ブーリアン型
		boolean bool;
		
		byt = 10;
		sNum = 100;
		num = 1000;
		lNum = 10000;
		fNum = 9.5F;
		dNum = 10.5;
		cStr = 'a';
		str = "ハロー";
		bool = true;
		
		// 11110を表示
		System.out.println(byt + sNum + num + lNum);
		// 20を表示
		System.out.println(byt * 2);
		// aハローtrueと表示
		System.out.println(cStr + str + bool);
		// 11130と表示
		System.out.println(byt + sNum + num + lNum + fNum + dNum);
		// 10000000000と表示
		System.out.println(byt * sNum * num * lNum);
		// 0.105と表示
		System.out.println(dNum / sNum);
		//-90と表示
		System.out.println(byt - sNum);
		
		// num1をint型に修正してハローJAVA43と表示
		int num1=20;			
		int num2=23;			
		System.out.println("ハローJAVA"+(num2+num1));		
		
		// String型
		String name = "山田太郎";
		// int型
		int age = 18;
		// double型
		double height = 170.5;
		// double型
		double weight = 62.2;
		// String型
		String food = "寿司";
		// double型
		double bmi = weight / ((height / 100)* (height / 100));
		
		//自己紹介文を表示
		System.out.println("初めまして" + name + "です");
		System.out.println("年齢は" + age + "歳です");
		System.out.println("身長は" + height + "cmです");
		System.out.println("体重は" + weight + "kgです");
		System.out.println("好きな食べ物は" + food + "です");
		System.out.println("BMIは" + String.format("%.1f", bmi) + "です");
		
		//上記の変数に再代入する
		

		
		name = "鈴木一郎";
		
		age = 24;
		
		height = 168.5;
		
		weight = 64.2;
		
		food = "オムライス";
		
		bmi = weight / ((height / 100)*(height / 100));
		
		// 自己紹介文を表示
		System.out.println("初めまして" + name + "です");
		System.out.println("年齢は" + age + "歳です");
		System.out.println("身長は" + height + "cmです");
		System.out.println("体重は" + weight + "kgです");
		System.out.println("好きな食べ物は" + food + "です");
		System.out.println("BMIは" + String.format("%.1f", bmi) + "です");
		// 年齢が25歳以上ならtrueを返す
		System.out.println(bool == (age >= 25) );
		
		
		//自己代入で数値を倍にする
		age += age;
		height += height;
		weight += weight;
		
		
		
		// 自己紹介文を表示
		System.out.println("初めまして" + name + "です");
		System.out.println("年齢は" + age + "歳です");
		System.out.println("身長は" + height + "cmです");
		System.out.println("体重は" + weight + "kgです");
		System.out.println("好きな食べ物は" + food + "です");
		System.out.println("BMIは" + String.format("%.2f", (bmi /2)) + "です");
		
		
		
		
		// 年齢、身長、体重を文字列に変換して結合
		String age2 = "" + age;
		String height2 = "" + height;
		String weight2 = "" + weight;
		System.out.println(age2 + height2 + weight2);
		
		// String型からint型へ変換
		int age3 = Integer.parseInt(age2);
		// int height3 = Integer.parseInt(height2);
		int height3 = (int)Double.parseDouble(height2);
		
		// 変換したデータを表示
		System.out.println(age3);
		System.out.println(height3);
		
		// 25最以上かつ160cm以上ならtruwを返す
		System.out.println(bool == ((age3>25) && (height3>160)));
		
		
		
 

		
	}

}
