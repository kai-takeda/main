package do_it;

import java.util.Objects;

import do_process.lesson_22_p;

public class lesson_22_i {

	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ
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
		
		// インスタンスを変数に代入
		lesson_22_p lessonp = new lesson_22_p("日本", "寿司", "和食", "yyyy.MM.dd HH:mm:ss"); 
		// 表示
		
		
		
		// lessonpに対してnull判定を行う。null出なければ表示
		if (Objects.isNull(lessonp)) {
            System.out.println("Object is Null");
        } else {
        	lessonp.myIndroduce();
    		lessonp.r_date();
        }
	}
		

}
