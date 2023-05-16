package curriculum_A;

public class Qes1_13 {
	

	public static void main(String[] args) {
		
		/* Q1下記9個をローカル変数として宣言のみしてください	
		・バイト型・短整数型・整数型・長整数型			
		・単精度浮動小数点数型・倍精度浮動小数点数型			
		・文字型・文字列型			
		ブーリアン型*/			
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
		
		// Q2それぞれのローカル変数をローカル内でそれぞれの初期値を代入し初期化してください
		
		byt = 0;
		sNum = 0;
		num = 0;
		lNum = 0L;
		fNum = 0.0F;
		dNum = 0.0d;
		cStr = '\u0000';
		str = null;
		bool = false;
		
		// Q3初期化をしたそれぞれの変数に下記の値を代入してください		
		// 変数bytに10を代入
		byt = 10;
		// 変数sNumに100を代入
		sNum = 100;
		// 変数numに1000を代入
		num = 1000;
		// 変数lNumに10000Lを代入
		lNum = 10000L;
		// 変数fNumに9.5Fを代入
		fNum = 9.5F;
		// 変数dNumに10.5Dを代入
		dNum = 10.5D;
		// 変数cStrに'a'を代入
		cStr = 'a';
		// 変数strに"ハロー"を代入
		str = "ハロー";
		// 変数boolにtrueを代入
		bool = true;
		
		/* Q4下記の通りにコンソール出力されるようにしてください					
		上記で作成した変数を必ず使用すること					
		11110			
		20			
		a ハロー true			
		11130		11130	数字を全て足す		
			10000000000	小数点以外の数字を全てかける		
		0.105	10.5割る100をする		
		-90	10引く100をする*/
		
		// 11110を表示
		System.out.println(byt + sNum + num + lNum);
		// 20を表示
		System.out.println(byt * 2);
		// aハローtrueと表示
		System.out.println(cStr + str + bool);
		// 11130と表示
		System.out.println((int)(byt + sNum + num + lNum + fNum + dNum));
		// 10000000000と表示
		System.out.println(byt * sNum * num * lNum);
		// 0.105と表示
		System.out.println(dNum / sNum);
		//-90と表示
		System.out.println(byt - sNum);
		
		// 改行コード
		System.out.println("\n");
		/* Q5次のプログラムを実行すると「ハローJAVA2023」という結果が表示されます。								
		「ハローJAVA43」と表示とさせたいのですが、意図通りに動きません。正しく動作するように修正してください。								
		　String num="20";								
		　int num1=23;								
		　System.out.println("ハローJAVA"+(num+num1))*/							
		// num1をint型に修正してハローJAVA43と表示
		int num1=20;			
		int num2=23;			
		System.out.println("ハローJAVA"+(num2+num1));		
		// 改行コード
		System.out.println("\n");
		
		/* Q6『』で囲われた人の情報を変数にして、formatの通りコンソールに出力してください						
        ローカル変数に代入し○○に入れてください						
           『山田太郎 18歳 170.5cm 62.2kg 寿司』*/
		
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
		
		/* Q7 6で作成した自己紹介に続いてBMIが出力されるようにしてください				
		「BMIは○○です」				
		ただし計算は数値を直書きせず、全て変数を使ってすること*/				
		
		//自己紹介文を表示
		System.out.println("初めまして" + name + "です");
		System.out.println("年齢は" + age + "歳です");
		System.out.println("身長は" + height + "cmです");
		System.out.println("体重は" + weight + "kgです");
		System.out.println("好きな食べ物は" + food + "です");
		System.out.println("BMIは" + String.format("%.1f", bmi) + "です");
		// 改行コード
		System.out.println("\n");
		
		//上記の変数に再代入する
		
		/*Q8 6で宣言した変数に再代入し下記の通りコンソールに出力してください					
		　初めまして鈴木一郎です					
		　年齢は24歳です					
		　身長168.5cmです					
		　体重は64.2kgです					
		　好きな食べ物はオムライスです					
		　BMIは22.6です*/				
		
		name = "鈴木一郎";
		
		age = 24;
		
		height = 168.5;
		
		weight = 64.2;
		
		food = "オムライス";
		
		bmi = weight / ((height / 100)*(height / 100));
		
		// Q11　8で使用した【年齢・身長・体重】を文字列型に型変換し繋げて出力してください	
		// 年齢、身長、体重を文字列に変換して結合
		String age2 = "" + age;
		String height2 = "" + height;
		String weight2 = "" + weight;
		System.out.println(age2 + height2 + weight2);
		// 改行コード
		System.out.println("\n");
		
		/*Q9 8で使用した変数【年齢・身長・体重】の数値を和算で自己代入し、下記の通りコンソールに出力してください								
		　初めまして鈴木一郎です								
		　年齢は48歳です								
		　身長337.0cmです								
		　体重は128.4kgです								
		　好きな食べ物はオムライスです								
		　BMIは11.31です	*/							
		
		// 自己紹介文を表示
		System.out.println("初めまして" + name + "です");
		System.out.println("年齢は" + age + "歳です");
		System.out.println("身長は" + height + "cmです");
		System.out.println("体重は" + weight + "kgです");
		System.out.println("好きな食べ物は" + food + "です");
		System.out.println("BMIは" + String.format("%.1f", bmi) + "です");
		// 改行コード
		System.out.println("\n");
		
		// Q10 8で使用した年齢が25歳以上ならtrueが出力されるようにしてください。ただしif文は使いません							
		// 年齢が25歳以上ならtrueを返す
		System.out.println(bool == (age >= 25) );
		// 改行コード
		System.out.println("\n");
		
		
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
		// 改行コード
		System.out.println("\n");
		
		
		
		
		
		// Q12 11で変換した【年齢・身長】を整数型に変換して出力してください				
		// String型からint型へ変換
		int age3 = Integer.parseInt(age2);
		// int height3 = Integer.parseInt(height2);
		int height3 = (int)Double.parseDouble(height2);
		
		// 変換したデータを表示
		System.out.println(age3);
		System.out.println(height3);
		// 改行コード
		System.out.println("\n");
		
		/* Q13 12で変換した【年齢・身長】で【年齢が25もしくは身長が160以上】であればtrueを出力してください							
		ただしif文は使わないでください	*/						
		
		// 25最以上かつ160cm以上ならtrueを返す
		System.out.println(bool == ((age3>25) && (height3>160)));
		// 改行コード
		System.out.println("\n");
		
		
 

		
	}

}
