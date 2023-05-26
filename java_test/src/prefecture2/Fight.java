package prefecture2;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;

public class Fight {
	public void g() {
		// インスタンス化する
		getInfo gI = new getInfo();
		getNum n = new getNum();
		getOrder gO = new getOrder(); 

		// マップクラスを使用
		Map<Integer, String> map1 = new HashMap<>();
		// 別クラスをインスタンス化して使用できるように
		map1 = gI.getInfos();
		int[] nums = n.numb();
		String orders = gO.t();

		// 2.Map.Entryのリストを作成する
		List<Entry<Integer, String>> list_entries = new ArrayList<Entry<Integer, String>>(map1.entrySet());
		
		// 入力された値が昇順の場合
		if (orders.equals("昇順")) {
			// ソートする
			Arrays.sort(nums);
			// Collectionsを使用する
			Collections.sort(list_entries, new Comparator<Entry<Integer, String>>() {
				public int compare(Entry<Integer, String> obj1, Entry<Integer, String> obj2) {
					// 昇順の処理
					return obj1.getKey().compareTo(obj2.getKey());
				}
			});
			
			// リストをfor文で取り出し比較する
			for(Entry<Integer, String> entry : list_entries) {
				for (int w = 0; w < nums.length; w++) {
					// キーと入力した値の比較
					if(entry.getKey() == nums[w]) {
						String[] obj = entry.getValue().split(",");
						// 都道府県、県庁所在地、面積に分けて表示、最後に改行
						System.out.println("都道府県：" + obj[0]);
						System.out.println("県庁所在地：" + obj[1]);
						System.out.println("面積" + obj[2] + "km2");
						System.out.println("");
					}
				}
			}	
			
		// 入力された値が降順の場合
		} else if(orders.equals("降順")) {
			// 入力された値をソートする
			Arrays.sort(nums);
			// 入力された数字を降順に並び替える
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
					//降順の処理
					return obj2.getKey().compareTo(obj1.getKey());
				}
			});

			// 降順で値を表示する処理
			for(Entry<Integer, String> entrys : list_entries) {
				// 入力された数字の個数繰り返し
				for (int e = 0; e < nums.length; e++) {
					// キーと入力された値が一致する場合
					if(entrys.getKey() == nums[e]) {
						// 値を,で分割する
						String[] obj = entrys.getValue().split(",");
						// // 都道府県、県庁所在地、面積に分けて表示、最後に改行
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