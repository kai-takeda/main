package prefecture2;

import java.util.Scanner;

public class getNum {
	// 入力した値をリスト化して返す
	public int[] numb() {
		Scanner scanner = new Scanner(System.in);
		System.out.println("数字を入力してください(0-11の間)");
		String numberS = scanner.nextLine();
		// 入力した数字を,で分割する
		String[] numbers = numberS.split(",");
		// 文字列をint型にして返す
		int[] nums = new int[numbers.length];
		for(int i = 0; i < numbers.length; i++) {
			nums[i] = Integer.parseInt(numbers[i]);
		}
		return nums;
	}
		

}
