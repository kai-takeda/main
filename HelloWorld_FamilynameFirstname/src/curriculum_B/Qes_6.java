package curriculum_B;

import java.util.Random;
import java.util.Scanner;

public class Qes_6 {

	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ
		
		
		/*入力した商品の残り台数が出力されるシステムを下記の条件で作成してください										
		・拡張for文・Switch文・条件演算子を使用すること　※普通のif文は使用不可										
		・Switch文内でテレビとディスプレイは続けて書くようにしてください、条件演算子で出力される値を変更してください										
		・例：テレビorディスプレイと受け取った場合〇〇に受け取った値が入る→「〇〇の残り台数は9台です」										
		・入力される値は右記の表のどれかが入力され、入力回数の縛りはありません									
		・入力された値は「、」区切りで指定してください									
		・そのほかの値が入力された場合下記を出力されるようにしてください										
			『受け取った値』は指定の商品ではありません									
		・残り台数は0〜11までのランダムな値が出力されるようにしてください										
		*/
		
		
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
