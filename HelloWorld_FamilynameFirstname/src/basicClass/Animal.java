package basicClass;

import java.text.SimpleDateFormat;
import java.util.Calendar;

public class Animal {
	
	public static void main(String[] args) {
		// Q1：Dogクラスを呼び出して変数に代入し、動物の名前をコンソールに出力してください。
		Dog dog1 = new Dog();
		System.out.println(dog1.dogName);
		// Q2：Dogクラスを呼び出して変数に代入し、動物の数をコンソールに出力してください。
		Dog dog2 = new Dog(4);
		System.out.println(dog2.dogNum);
		// 現在の日時を「yyyy-MM-dd H:m:s」形式で変数に代入して、コンソールに出力してください
		
		Calendar cl = Calendar.getInstance();
		// 日付フォーマットの指定
		SimpleDateFormat sdf = new SimpleDateFormat("yyyy.MM.dd HH:mm:ss");
		System.out.println(sdf.format(cl.getTime()));
	}
}
