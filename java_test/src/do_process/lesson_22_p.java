package do_process;

import java.text.SimpleDateFormat;
import java.util.Calendar;

/*

下記がコンソールに出力されるように作成してください

	こんにちは！ここは日本です！
	この寿司はうまい
	寿司は和食です
	今の現在日時は2023/03/09 10:23:39です

【条件】
	・JavaProjectを新規作成し、実行用のpackageと処理用のpackageを作成してください。
	・適切なファイルにフィールドで変数を必要な数作ってください。
	・thisを使って作成してください。
	・日時は今日の日付を取得してください。
	
*/

// インスタンスフィールドを定義
public class lesson_22_p {
	public String land;
	public String food;
	public String kind;
	public String date;

	//  コンストラクタを定義
	public lesson_22_p (String land, String food, String kind, String date) {
		// TODO 自動生成されたメソッド・スタブ
		this.land = land;
		this.food = food;
		this.kind = kind;
		this.date = date;
	}
	
	// 国の紹介
	public void myIndroduce() {
		System.out.println("こんにちは！ここは" + this.land + "です！");
		System.out.println("ここの" + this.food + "はうまい");
		System.out.println(this.food + "は" + this.kind + "です");
		
	}
	// 時刻の表示
	public void r_date() {
		Calendar cl = Calendar.getInstance();
		// 日付フォーマットの指定
		SimpleDateFormat sdf = new SimpleDateFormat(this.date);
		System.out.println("現在の日時は" + sdf.format(cl.getTime()) + "です");
	}

}
