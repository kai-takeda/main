package animals;


/*

	コンソールに下記が入力されたときにコンソール出力結果がコンソールに表示されるように作ってください
	ライオン:2.1:80,ゾウ:3.2:40,パンダ:1.9:30,チンパンジー:0.94:25,シマウマ:2.4:65,インコ:0.1:50
	
	コンソール出力結果
	
	コンソールに文字を入力してください
	動物名：ライオン
	体長：2.1m
	速度：80km/h
	学名：パンテラ レオ

	動物名：ゾウ
	体長：3.2m
	速度：40km/h
	学名：ロキソドンタ・サイクロティス

	動物名：パンダ
	体長：1.9m
	速度：30km/h
	学名：アイルロポダ・メラノレウカ

	動物名：チンパンジー
	体長：0.94m
	速度：25km/h
	学名：パン・トゥログロディテス

	動物名：シマウマ
	体長：2.4m
	速度：65km/h
	学名：チャップマンシマウマ

	動物名：インコ
	体長：0.1m
	速度：50km/h
	学名：不明


*/


public class animals_kind {
	// 別クラスから使用されないようprivateで設定
	private String name;
	private double height;
	private int speed;
	private String sName;
	// setterを作成
	public void setName(String name) {
		this.name = name;
	}
	public void setHeight(double height) {
		this.height = height;
	}
	public void setSpeed(int speed) {
		this.speed = speed;
	}
	public void setSname(String sName) {
		this.sName = sName;
	}
	// getterを作成
	public String getName() {
		return this.name;
	}
	public double getHeight() {
		return this.height;
	}
	public int getSpeed() {
		return this.speed;
	}
	public String getSname() {
		return this.sName;
	}
	
	// 情報を表示するshowメソッドを作成
	public void show() {
		System.out.println("動物名：" + this.getName());
		System.out.println("体長：" + this.getHeight() + "m");
		System.out.println("速度：" + this.getSpeed() + "km/h");
		System.out.println("学名：" + this.getSname());
		System.out.println("");
	}
	

}

