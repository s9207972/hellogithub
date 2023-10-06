package xxx;

public class homework {
	public static void main(String[] args){
		//1.請設計一隻Java程式,計算12,6這兩個數值的和與積
		int i, c;
		i=12;
		c=6;
		System.out.println(i + c);
		System.out.println(i * c);
		
		//2.請設計一隻Java程式,計算200顆蛋共是幾打幾顆? (一打為12顆)
		int eggs=200;
		int egg=12;
		
		System.out.println((eggs/egg)+"打"+(eggs%egg)+"顆");
		
		//3.請由程式算出256559秒為多少天、多少小時、多少分與多少秒
		int day, hour, min, sec;
		int totalSec=256559;
		day = totalSec/(60*60*24);
		int last = totalSec%(60*60*24);
		//剩餘秒數 last
		hour = last/(60*60);
		last %=(60*60);
		min = last/60;
		sec = last%60;
		
		System.out.println(day+"天"+hour+"小時"+min+"分"+sec+"秒");
		
		//4.請定義一個常數為3.1415(圓周率),並計算半徑為5的圓面積與圓周長
		final double PI = 3.1415;
		int circle = 5;
		double qq = PI*circle*circle;
		double ww = PI*circle*2;
		System.out.printf("圓面積 = %.4f\n",qq);
		System.out.printf("圓周長 = %.4f\n",ww);
		
		//5.某人在銀行存入150萬,銀行利率為2%,如果每年利息都繼續存入銀行,請用程式計算10年後,本
		//金加利息共有多少錢 (用複利計算,公式請自行google)
		int money = 1500000;
		double lc = 0.02;
		int years = 10;
		double rich = money * Math.pow(1 + lc, years);
		System.out.println(rich+"元");
		
//		6.請寫一隻程式,利用System.out.println()印出以下三個運算式結果:
//			5 + 5
//			5 + ‘5’
//			5 + “5”
//			並請用註解各別說明答案的產生原因
		System.out.println(5+5);
//		預設的INT互相相加
		System.out.println(5+'5');
//		char5會先經過Unicode編碼,轉換成十六進位,在根據十進位換算得到值53,再與5相加得值58
		System.out.println(5 + "5");
//		括號裡面其中一個運算元為字串就會使+號變串接功能
	}
}
