package prefecture2;

import java.util.HashMap;
import java.util.Map;

public class getInfo {
	
	public Map<Integer, String> getInfos() {
		// mapクラスを用いて情報を格納する
		Map<Integer, String> map = new HashMap<>();
		// インスタンス化
		setInfo info1 = new setInfo();
		setInfo info2 = new setInfo();
		setInfo info3 = new setInfo();
		setInfo info4 = new setInfo();
		setInfo info5 = new setInfo();
		setInfo info6 = new setInfo();
		setInfo info7 = new setInfo();
		setInfo info8 = new setInfo();
		setInfo info9 = new setInfo();
		setInfo info10 = new setInfo();
		setInfo info11= new setInfo();
		// 情報をsetterでセットする
		info1.setInd(0);
		info1.setPrefecture("北海道");
		info1.setCity("札幌市");
		info1.setSize(83424);
		info2.setInd(1);
		info2.setPrefecture("青森県");
		info2.setCity("青森市");
		info2.setSize(9646);
		info3.setInd(2);
		info3.setPrefecture("岩手県");
		info3.setCity("盛岡市");
		info3.setSize(15275);
		info4.setInd(3);
		info4.setPrefecture("宮城県");
		info4.setCity("仙台市");
		info4.setSize(7282);
		info5.setInd(4);
		info5.setPrefecture("秋田県");
		info5.setCity("秋田市");
		info5.setSize(11638);
		info6.setInd(5);
		info6.setPrefecture("山形県");
		info6.setCity("山形市");
		info6.setSize(9323);
		info7.setInd(6);
		info7.setPrefecture("福島県");
		info7.setCity("福島市");
		info7.setSize(13784);
		info8.setInd(7);
		info8.setPrefecture("茨城県");
		info8.setCity("水戸市");
		info8.setSize(6097);
		info9.setInd(8);
		info9.setPrefecture("栃木県");
		info9.setCity("宇都宮市");
		info9.setSize(6408);
		info10.setInd(9);
		info10.setPrefecture("群馬県");
		info10.setCity("前橋市");
		info10.setSize(6362);
		info11.setInd(10);
		info11.setPrefecture("埼玉県");
		info11.setCity("さいたま市");
		info11.setSize(3798);
		// getterを用いて値を取得しmapに格納
		map.put(info1.getInd(), info1.getPrefecture() + "," + info1.getCity() + "," + info1.getSize());
		map.put(info2.getInd(), info2.getPrefecture() + "," + info2.getCity() + "," + info2.getSize());
		map.put(info3.getInd(), info3.getPrefecture() + "," + info3.getCity() + "," + info3.getSize());
		map.put(info4.getInd(), info4.getPrefecture() + "," + info4.getCity() + "," + info4.getSize());
		map.put(info5.getInd(), info5.getPrefecture() + "," + info5.getCity() + "," + info5.getSize());
		map.put(info6.getInd(), info6.getPrefecture() + "," + info6.getCity() + "," + info6.getSize());
		map.put(info7.getInd(), info7.getPrefecture() + "," + info7.getCity() + "," + info7.getSize());
		map.put(info8.getInd(), info8.getPrefecture() + "," + info8.getCity() + "," + info8.getSize());
		map.put(info9.getInd(), info9.getPrefecture() + "," + info9.getCity() + "," + info9.getSize());
		map.put(info10.getInd(), info10.getPrefecture() + "," + info10.getCity() + "," + info10.getSize());
		map.put(info11.getInd(), info11.getPrefecture() + "," + info11.getCity() + "," + info11.getSize());
		Map<Integer, String> maps = new HashMap<>();
		// コピーする
		maps = map;
		return maps;
	}
	
	
	
	

}
