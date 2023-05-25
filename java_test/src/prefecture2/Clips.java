package prefecture2;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;
import java.util.TreeMap;

public class Clips {
	public void g() {
		// インスタンス化する
		getInfo gI = new getInfo();
		getNum n = new getNum();
		getOrder gO = new getOrder(); 
		// マップクラスを使用
		Map<Integer, String> map1 = new TreeMap<>();
		map1 = gI.getInfos();
		int[] nums = n.numb();
		String orders = gO.t();
		 // 2.Map.Entryのリストを作成する
        List<Entry<Integer, String>> list_entries = new ArrayList<Entry<Integer, String>>(map1.entrySet());
        // entryを用いてキーと値を取り出せるようにする
		for (Map.Entry<Integer, String> entry : map1.entrySet()) {
			// 昇順の処理
			if (orders.equals("昇順")) {
				// ソートする
				Arrays.sort(nums);
				for (int w = 0; w < nums.length; w++) {
					// キーと入力した値の比較
					if(entry.getKey() == nums[w]) {
						String[] obj = entry.getValue().split(",");
						// 表示する
						System.out.println("都道府県：" + obj[0]);
						System.out.println("県庁所在地：" + obj[1]);
						System.out.println("面積" + obj[2] + "km2");
						System.out.println("");
					}
				}
			// 降順の処理
			} else if(orders.equals("降順")) {
				Arrays.sort(nums);
				for (int f = 0, l = nums.length - 1; f < l; f++, l--){
				  int temp = nums[f];
				  nums[f]  = nums[l];
				  nums[l] = temp;
				}
				// 降順にするための処理
				Collections.sort(list_entries, new Comparator<Entry<Integer, String>>() {
		            //compareを使用して値を比較する
		            public int compare(Entry<Integer, String> obj1, Entry<Integer, String> obj2)
		            {
		                //降順
		                return obj2.getKey().compareTo(obj1.getKey());
		            }
		        });
				// 降順で値を表示する処理
				for(Entry<Integer, String> entrys : list_entries) {
					for (int e = 0; e < nums.length; e++) {
						if(entrys.getKey() == nums[e]) {
							String[] obj = entrys.getValue().split(",");
							// 表示する
							System.out.println("都道府県：" + obj[0]);
							System.out.println("県庁所在地：" + obj[1]);
							System.out.println("面積" + obj[2] + "km2");
							System.out.println("");
						}
					}
		        }
			} 
		}
	}
}
