package curriculum_B;

public class Qes_5 {

	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ
		
		/*for文を使用して下記の通りに出力してください																											
		
		※この行は改行しているとする																											
		-------------------課題5-------------------																											
		01 * 01 = 001 || 02 * 01 = 002 || 03 * 01 = 003 || 04 * 01 = 004 || 05 * 01 = 005 || 06 * 01 = 006 || 07 * 01 = 007 || 08 * 01 = 008 || 09 * 01 = 009 || 010 * 01 = 010 || 011 * 01 = 011 || 012 * 01 = 012 || 013 * 01 = 013 || 014 * 01 = 014 || 015 * 01 = 015 || 016 * 01 = 016 || 017 * 01 = 017 || 018 * 01 = 018 || 019 * 01 = 019 || 020 * 01 = 020																											
		01 * 02 = 002 || 02 * 02 = 004 || 03 * 02 = 006 || 04 * 02 = 008 || 05 * 02 = 010 || 06 * 02 = 012 || 07 * 02 = 014 || 08 * 02 = 016 || 09 * 02 = 018 || 010 * 02 = 020 || 011 * 02 = 022 || 012 * 02 = 024 || 013 * 02 = 026 || 014 * 02 = 028 || 015 * 02 = 030 || 016 * 02 = 032 || 017 * 02 = 034 || 018 * 02 = 036 || 019 * 02 = 038 || 020 * 02 = 040																											
		01 * 03 = 003 || 02 * 03 = 006 || 03 * 03 = 009 || 04 * 03 = 012 || 05 * 03 = 015 || 06 * 03 = 018 || 07 * 03 = 021 || 08 * 03 = 024 || 09 * 03 = 027 || 010 * 03 = 030 || 011 * 03 = 033 || 012 * 03 = 036 || 013 * 03 = 039 || 014 * 03 = 042 || 015 * 03 = 045 || 016 * 03 = 048 || 017 * 03 = 051 || 018 * 03 = 054 || 019 * 03 = 057 || 020 * 03 = 060																											
		01 * 04 = 004 || 02 * 04 = 008 || 03 * 04 = 012 || 04 * 04 = 016 || 05 * 04 = 020 || 06 * 04 = 024 || 07 * 04 = 028 || 08 * 04 = 032 || 09 * 04 = 036 || 010 * 04 = 040 || 011 * 04 = 044 || 012 * 04 = 048 || 013 * 04 = 052 || 014 * 04 = 056 || 015 * 04 = 060 || 016 * 04 = 064 || 017 * 04 = 068 || 018 * 04 = 072 || 019 * 04 = 076 || 020 * 04 = 080																											
		01 * 05 = 005 || 02 * 05 = 010 || 03 * 05 = 015 || 04 * 05 = 020 || 05 * 05 = 025 || 06 * 05 = 030 || 07 * 05 = 035 || 08 * 05 = 040 || 09 * 05 = 045 || 010 * 05 = 050 || 011 * 05 = 055 || 012 * 05 = 060 || 013 * 05 = 065 || 014 * 05 = 070 || 015 * 05 = 075 || 016 * 05 = 080 || 017 * 05 = 085 || 018 * 05 = 090 || 019 * 05 = 095 || 020 * 05 = 100																											
		01 * 06 = 006 || 02 * 06 = 012 || 03 * 06 = 018 || 04 * 06 = 024 || 05 * 06 = 030 || 06 * 06 = 036 || 07 * 06 = 042 || 08 * 06 = 048 || 09 * 06 = 054 || 010 * 06 = 060 || 011 * 06 = 066 || 012 * 06 = 072 || 013 * 06 = 078 || 014 * 06 = 084 || 015 * 06 = 090 || 016 * 06 = 096 || 017 * 06 = 102 || 018 * 06 = 108 || 019 * 06 = 114 || 020 * 06 = 120																											
		01 * 07 = 007 || 02 * 07 = 014 || 03 * 07 = 021 || 04 * 07 = 028 || 05 * 07 = 035 || 06 * 07 = 042 || 07 * 07 = 049 || 08 * 07 = 056 || 09 * 07 = 063 || 010 * 07 = 070 || 011 * 07 = 077 || 012 * 07 = 084 || 013 * 07 = 091 || 014 * 07 = 098 || 015 * 07 = 105 || 016 * 07 = 112 || 017 * 07 = 119 || 018 * 07 = 126 || 019 * 07 = 133 || 020 * 07 = 140																											
		01 * 08 = 008 || 02 * 08 = 016 || 03 * 08 = 024 || 04 * 08 = 032 || 05 * 08 = 040 || 06 * 08 = 048 || 07 * 08 = 056 || 08 * 08 = 064 || 09 * 08 = 072 || 010 * 08 = 080 || 011 * 08 = 088 || 012 * 08 = 096 || 013 * 08 = 104 || 014 * 08 = 112 || 015 * 08 = 120 || 016 * 08 = 128 || 017 * 08 = 136 || 018 * 08 = 144 || 019 * 08 = 152 || 020 * 08 = 160																											
		01 * 09 = 009 || 02 * 09 = 018 || 03 * 09 = 027 || 04 * 09 = 036 || 05 * 09 = 045 || 06 * 09 = 054 || 07 * 09 = 063 || 08 * 09 = 072 || 09 * 09 = 081 || 010 * 09 = 090 || 011 * 09 = 099 || 012 * 09 = 108 || 013 * 09 = 117 || 014 * 09 = 126 || 015 * 09 = 135 || 016 * 09 = 144 || 017 * 09 = 153 || 018 * 09 = 162 || 019 * 09 = 171 || 020 * 09 = 180																											
		*/
		
		int[] nums = {1, 2, 3, 4, 5, 6, 7, 8, 9};
		int[] nums1 = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 13, 14, 15, 16, 17, 18, 19, 20};
		
		
		// 掛け算の九九をfor文で作成
		for (int num:nums) {
			for (int num1:nums1) {
				// 最小文字数を２桁に設定、満たない場合は左に0をつける
				// num1の値が10より小さい場合num1を２桁に
				if (num1 <10) {
					System.out.print(String.format("%02d * %02d =%03d", num1, num, num*num1));
				// それ以外の場合num1を３桁に
				} else {
					System.out.print(String.format("%03d * %02d =%03d", num1, num, num*num1));
				}
				// 一番右の||は削除
				if (num1 == 20) {
					continue;
				}
				// 計算式の間に||を入力
				System.out.print(" || ");
			}
			// 改行処理
			System.out.println();
		}

	}

}
