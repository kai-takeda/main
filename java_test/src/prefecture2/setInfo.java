package prefecture2;

public class setInfo {
	private int ind;
	private String prefecture;
	private String city;
	private double size;
	
	// setterの設定
	public void setInd(int ind) {
		this.ind = ind;
	}
	public void setPrefecture(String prefecture) {
		this.prefecture = prefecture;
	}
	public void setCity(String city) {
		this.city = city;
	}
	public void setSize(double size) {
		this.size = size;
	}
	
    // getterの設定
	public int getInd() {
		return this.ind;
	}
	public String getPrefecture() {
		return this.prefecture;
	}
	public String getCity() {
		return this.city;
	}
	public double getSize() {
		return this.size;
	}
}

