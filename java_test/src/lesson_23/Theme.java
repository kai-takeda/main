package lesson_23;

import java.util.Objects;

public class Theme {

	/*
 	
 	下記がコンソールに出力されるように作成してください
 	※thisとsetterとgetterとフィールドを使ってください
 	
  	動物名：ライオン
	体長：2.1m
	速度：80km/h
 	
 */
	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ
		// インスタンスを作成、その後表示
		Theme1 theme1 = new Theme1("ライオン", 2.1, 80) ;
		
		if (Objects.isNull(theme1)) {
            System.out.println("Object is Null");
        } else {
        	System.out.println("動物名：" + theme1.getName());
    		System.out.println("体長：" + theme1.getHeight() + "m");
    		System.out.println("速度：" + theme1.getFast() + "km/h");
        }
		
		

	}

}
