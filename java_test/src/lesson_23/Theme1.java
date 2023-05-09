package lesson_23;

public class Theme1 {
	
/*
 	
 	下記がコンソールに出力されるように作成してください
 	※thisとsetterとgetterとフィールドを使ってください
 	
  	動物名：ライオン
	体長：2.1m
	速度：80km/h
 	
 */
	// 別クラスから参照されないようにprivateで設定
	private String name;
	private double height;
	private int fast;
	
	// コンストラクタを作成
	/*public Theme1(String name, double height, int fast) {
		this.name = name;
		this.height = height;
		this.fast = fast;
	}*/
	// それぞれのセッターを設定
	public void setName(String name) {
		this.name = name;
	}
	public void setHeight(double height) {
		this.height = height;
	}
	public void setFast(int fast) {
		this.fast = fast;
	}
	// それぞれのゲッターを設定。
	public String getName() {
		return this.name;
	}
	public double getHeight() {
		return this.height;
	}
	public int getFast() {
		return this.fast;
	}
	
}
