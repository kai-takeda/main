package curriculum_B;

import java.util.Arrays;
import java.util.Scanner;

public class Qes_7 {

	public static void main(String[] args) {
		/*
	・N人の生徒の成績を入力できるようにしてください 入力値は上から英語・数学・理科・社会の点数としてください
	・各生徒の科目平均点、全体の科目平均点、そして各教科の平均点を出力してください
	・このプログラムの実行は必ず1回以上行われるようにしてください
	・出力例を参考にプログラミングを作成してください
		 */
		
		// 合計点用の変数を定義
		double sum0 = 0;
		double sum1 = 0;
		double sum2 = 0;
		double sum3 = 0;
		double sum4 = 0;
		Scanner scanner = new Scanner(System.in);
		
		// 生徒の人数を入力
		System.out.printf("生徒の人数を入力してください:");
		int num = scanner.nextInt();
		
		// 生徒の数の要素を持つ配列を作成
		int[][] member = new int[num][4];
		
		// 生徒のそれぞれの教科の点数を入力
		for (int i = 1; i <= num; i++) {
			
			// 英語の処理
			System.out.printf(i + "人目の『英語』の点数を入力してください:");
			int scoreE = scanner.nextInt();
			member[i-1][0] = scoreE;
			
			// 数学の処理
			System.out.printf(i + "人目の『数学』の点数を入力してください:");
			int scoreM = scanner.nextInt();
			member[i-1][1] = scoreM;
			
			// 理科の処理
			System.out.printf(i + "人目の『理科』の点数を入力してください:");
			int scoreS = scanner.nextInt();
			member[i-1][2] = scoreS;
			
			// 社会の処理
			System.out.printf(i + "人目の『社会』の点数を入力してください:");
			int scoreJ = scanner.nextInt();
			member[i-1][3] = scoreJ;
			
			//改行を挿入
			System.out.println();
		}
		// for文で値を取り出し平均点を求める
		for (int j = 1; j <= num; j++) {
			double average = Arrays.stream(member[j-1]).average().getAsDouble();
			System.out.println(j + "人目の平均点は" + String.format("%.2f", average) + "です。");
		}
		System.out.println();
		
		// for文で全ての教科の合計点を算出
		for (int s = 1; s <= num; s++) {
			sum0 += member[s-1][0];
			sum1 += member[s-1][1];
			sum2 += member[s-1][2];
			sum3 += member[s-1][3];
		}
		// 教科ごとの平均点を算出
		System.out.println("英語の平均点は" + String.format("%.2f", sum0 / num) + "です。");
		System.out.println("数学の平均点は" + String.format("%.2f", sum1 / num) + "です。");
		System.out.println("理科の平均点は" + String.format("%.2f", sum2 / num) + "です。");
		System.out.println("社会の平均点は" + String.format("%.2f", sum3 / num) + "です。");
		
		// 全テストの平均点算出
		for (int r = 1; r <= num; r++) {
			for (int u = 0; u < 4; u++) {
				sum4 += member[r-1][u];
			}
		}
		// 平均点を表示
		System.out.println("全体の平均点は" + String.format("%.2f", (sum4 / (num * 4))) + "点です。");
	}
}