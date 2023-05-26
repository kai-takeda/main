package prefecture2;

import java.util.Scanner;

public class getOrder {
	public static String t() {
		
		// 入力した値が昇順か降順かを判断
		String b = null;
		Scanner scanner = new Scanner(System.in);
		
		// 昇順か降順どちらかを入力してもらう
		System.out.println("昇順か降順どちらにするか入力してください");
		String order = scanner.nextLine();
		
		// 昇順の場合
		if (order.equals("昇順")) {
			b = "昇順";
			
		// 降順の場合
		} else if(order.equals("降順")) {
			b = "降順";
			
		// それ以外の時はどちらかを入力してもらうよう促す
		} else {
			System.out.println("昇順か降順を入力してください。");
		}
		return b;
	}
}
