package curriculum_B;

import java.util.Objects;
import java.util.Random;
import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;



public class Qes1_3 {

	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ
		
		
	    
	    // scannerで入力した値を取得
		Scanner scanner = new Scanner(System.in);
		// 正規表現パターンの読み込み、半角英数字の判定を行う
		boolean result;
		
	    // Random関数を使う
	    Random rand = new Random();
	    // ジャンケンの回数をカウントする変数を作成
	    int count = 0;
	    
		// nameが１０文字以上の場合「名前を１０文字以内にしてください」と表示
		// nameが空文字の場合「名前を入力してください」と表示
		// 正常だった場合「ユーザー名「入力したユーザー名」を登録しました」と表示
	    // 半角英数字でない場合「半角英数字のみで名前を入力してください」と表示
	    while(true) {
	    	String name = scanner.next();
	    	
	    	
			Pattern p1 = Pattern.compile("^[A-Za-z0-9]+$"); 
		    Matcher m1 = p1.matcher(name); 
		    result = m1.matches();
		    
	    	

		    if (Objects.isNull(name) || name.length() <= 0) {
			    System.out.println("名前を１０文字以内にしてください");
			    continue;
		    } else if (name.length()  >= 10) {
			    System.out.println("名前を入力してください");
			    continue;
		    } else if (!result){
			    System.out.println("半角英数字のみで名前を入力してください");
			    continue;
		    } else {
			    System.out.println("ユーザー名「" + name + "」を登録しました");
			// じゃんけん対決ゲームを作成
			// 手の種類を配列で作成
			
			    while(true) {
			    	String[] hands = {"グー", "チョキ", "パー"};
			    	System.out.println("出す手を決めてください");
			    	System.out.println("0が「グー」、１が「チョキ」、２が「パー」です");
			// 出す手を取得
			    	int num = scanner.nextInt();
			    	String myHand = hands[num];
			
			// 相手の出す手を取得
			// ランダム関数で相手の出す手をランダム化
			    	int numE = rand.nextInt(3);
			    	String enemyHand = hands[numE];
			
			// それぞれが出した手を表示
			    	System.out.println(name + "の手は" + myHand);
			    	System.out.println("相手の手は" + enemyHand);
			// ジャンケンの処理
			    	// あいこの場合
			    	if (myHand.equals(enemyHand)) {
			    		System.out.println("Draw あいこ　もう一回しましょう！");
			    		count++;
			    	// 自分がグーの場合の処理	
			    	} else if ((myHand.equals("グー")&&enemyHand.equals("パー")) || (myHand.equals("チョキ")&&enemyHand.equals("グー")) || (myHand.equals("パー")&&enemyHand.equals("チョキ"))) {
			    		if(enemyHand == "パー") {
			    			System.out.println("俺の勝ち");
			    			System.out.println("なんで負けたか、明日までに考えといてください");
			    			System.out.println("そしたら何かが見えてくるはずです");
			    			count++;
			    		
			    	// 自分がチョキの場合の処理
			    	    } else if (enemyHand== "グー") {
			    		
			    	    	System.out.println("俺の勝ち");
			    	    	System.out.println("負けは次につながるチャンスです");
			    	    	System.out.println("ネバーギブアップ");
			    	    	count++;
			    		
			    	// 自分がパーの場合の処理
			    	    } else if(enemyHand == "チョキ") {
			    	    	System.out.println("俺の勝ち");
			    			System.out.println("たかがジャンケン、そう思ってないですか？");
			    			System.out.println("それやったら次も、俺が勝ちますよ");
			    			count++;
			    	    }
			    	} else {
			    		System.out.println("やるやん");
		    			System.out.println("次は俺にリベンジさせて");
		    			count++;
		    			break;	
			    	}
			    }
			// ジャンケンの回数を表示
			System.out.println("勝つまでにかかった合計回数は"+count+"です");
			break;
		    }
		} 

	}

}
