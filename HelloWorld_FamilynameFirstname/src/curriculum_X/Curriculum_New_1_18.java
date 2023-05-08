package curriculum_X;

import java.util.Arrays;
import java.util.Random;

public class Curriculum_New_1_18 {
	
	
	// Random関数を使う
    

	// Q1：引数に文字列型と整数型をいれてコンソールに「Hello JavaSE 11」と出力するメソッドを作成してください。
	public static void str_Int(String str, int num) {
		System.out.println("Hello" + " " + str + " " + num);
	}
	// Q2：引数に整数を渡すと渡した値同士を乗算しコンソールに出力するメソッドを作成してください
	public static void squere (int num1) {
		System.out.println(num1 * num1);
	}
	// Q3：引数として整数の配列を渡すと、受け取った値を順番にコンソールに出力するメソッドを作成してください
	public static void np (int[] nums) {
		for (int num2:nums) {
			System.out.println(num2);
		}
	}
	// Q4：Q2をオーバーロードして引数を小数2つに変更し、引数同士を和算しコンソールに出力してください。
	public static void squere (double num3, double num4) {
		System.out.println(num3 + num4);
	}
	// Q5：引数に整数を渡すと、1～100までのランダムな数字を引数の回数分格納して
	// 格納した値を順番にコンソールで出力後、格納した値を返すメソッドを作成してください。
	// ※0は出力＆格納しないようにしてください。
	public static int[] randoms(int num5) {
		
		int[] numbers;
		numbers = new int[num5];
		// Random関数を使う
	    Random rand = new Random();
	    
	    for (int i=0; i<num5; i++) {
	    	numbers[i] = rand.nextInt(100)+1;
	    	
	    }
	    return numbers;
	    // System.out.println(Arrays.toString(numbers));
		
	}
	// Q6：引数にQ5で作成したメソッドの返り値を受け取り、受け取った配列の要素の平均値をコンソールに出力するメソッドを作成してください。
	// ※小数点以下も表示されるようにしてください。
	public static double random_s (int num5) {
		int[] randomE = randoms(num5);
		double average = Arrays.stream(randomE).average().getAsDouble();
		return average;
	}
	// Q7：引数にQ6で作成したメソッドの返り値を受け取り、受け取った値が50以上ならばtrueそれ以外はfalseを返しコンソールに出力してください
	public static boolean isHalf (int num6) {
		return random_s(num6) >= 50;
	}
	public static void main(String[] args) {
		
	// 作成したメソッドをここで呼び出してください
		// Q1
		str_Int("JavaSE", 11);
		// Q2
		squere (10);
		// Q3
		int[] nums = {1,3,5};
		np (nums); 
		// Q4
		squere (10.5, 20.3);
		// Q5
		int[] points = randoms(5);
		System.out.println(Arrays.toString(points));
		// Q6
		double random_S = random_s (4);
		System.out.println(random_S);
		// Q7
		boolean i = isHalf(5);
		System.out.println(i);
		
	}
}