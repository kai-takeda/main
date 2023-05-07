package curriculum_B;

import java.util.Random;
import java.util.Scanner;

public class Qes_6 {

	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ
		
		// scannerで入力した値を取得
		Scanner scanner = new Scanner(System.in);
		
		
		
		// 、で分ける
		//scanner.useDelimiter("、");
		
		
		// Random関数を使う
		Random rand = new Random();
		
		try {
            while (scanner.hasNext()) {
            	
            	// 入力した文字列を取得
            	String items = scanner.next();
            	//  、で分ける
            	scanner.useDelimiter("、");
                
                // 入力された文字列を配列に代入
                String[] item = items.split("、");
                
                // 配列itemから一つずつみる
                for (String buyItem:item) {
                	switch(buyItem) {
                    case "パソコン":
                    	int num = rand.nextInt(11);
                    	System.out.println(buyItem + "の残り台数は" + num + "台です。");
                    	System.out.println();
                    	continue;
                    case "冷蔵庫":
                    	int num1 = rand.nextInt(11);
                    	System.out.println(buyItem + "の残り台数は" + num1 + "台です。");
                    	System.out.println();
                    	continue;
                    case "扇風機":
                    	int num2 = rand.nextInt(11);
                    	System.out.println(buyItem + "の残り台数は" + num2 + "台です。");
                    	System.out.println();
                    	continue;
                    case "洗濯機":
                    	int num3 = rand.nextInt(11);
                    	System.out.println(buyItem + "の残り台数は" + num3 + "台です。");
                    	System.out.println();
                    	continue;
                    case "加湿器":
                    	int num4 = rand.nextInt(11);
                    	System.out.println(buyItem + "の残り台数は" + num4 + "台です。");
                    	System.out.println();
                    	continue;
                    case "テレビ", "ディスプレイ":
                    	int num5 = rand.nextInt(11);
                    	System.out.println(buyItem + "の残り台数は" + num5 + "台です。");
                    	System.out.println();
                    	continue;
                    default:
                    	System.out.println("『" + buyItem + "』は指定の商品ではありません。");
                    	System.out.println();
                    }
                }
                
                
            }
        } finally {
            scanner.close();
        }
		
		
		
			

	}

}
