package xxx;

//import java.util.Scanner;

public class HOMEWORK4 {
	public static void main(String[] args) {
//		有個一維陣列如下:
//		{29, 100, 39, 41, 50, 8, 66, 77, 95, 15}
//		請寫出一隻程式能輸出此陣列所有元素的平均值與大於平均值的元素
//		(提示:陣列,length屬性)
//		int x[] = { 29, 100, 39, 41, 50, 8, 66, 77, 95, 15 };
//		int sum = 0;
//		for (int i = 0; i < x.length; i++) {
//			sum += x[i];
//			if (x[i] > 52) {
//				System.out.println(x[i]);
//			}
//		}
//		System.out.println("平均值=" + (sum / x.length));
//		請建立一個字串,經過程式執行後,輸入結果是反過來的
//		例如String s = “Hello World”,執行結果即為dlroW olleH
//		(提示:String方法,陣列)
//		String a = "Hello World";
//		char[] xx = a.toCharArray();
//		for (int i = xx.length - 1; i >= 0; i--) {
//			System.out.println(xx[i]);
//		}
//		有個字串陣列如下 (八大行星):
//		{“mercury”, “venus”, “earth”, “mars”, “jupiter”, “saturn”, “uranus”, “neptune”}
//		請用程式計算出這陣列裡面共有多少個母音(a, e, i, o, u)
//		(提示:字元比對,String方法)
//		int sum = 0;
//
//		String[] planet = {"mercury", "venus", "earth", "mars", "jupiter", "saturn", "uranus", "neptune"};
//		for(int i =0;i <=planet.length-1;i++) {
//			char[] x = planet[i].toCharArray();
//			for(int j = 0;j<=x.length-1;j++) {
//				System.out.print(x[j]);
//				if(x[j]=='a'||x[j]=='e'||x[j]=='i'||x[j]=='o'||x[j]=='u') {
//					sum++;
//				}
//			}
//		}
//		System.out.println("共有"+sum+"個");
//		阿文上班時忘了帶錢包,想要向同事借錢,和他交情比較好的同事共有 5 個,其員工編號與身上現金列
//		表如下:
//
//		請設計一個程式,可以讓小華輸入欲借的金額後,便會顯示哪些員工編號的同事
//		有錢可借他;並且統計有錢可借的總人數:例如輸入 1000 就顯示「有錢可借的
//		員工編號: 25 19 27 共 3 人!」
//
//		(提示:Scanner,二維陣列)
//		Scanner gg = new Scanner(System.in);
//		System.out.println("請輸入金額:");
//		int num = gg.nextInt();
//		int sum = 0;
//		int[][] cash = { { 25, 2500 }, { 32, 800 }, { 8, 500 }, { 19, 1000 }, { 27, 1200 } };
//		System.out.println("可以借我錢的人有");
//		for (int i = 0; i < cash.length; i++) {
//			if (cash[i][1] > num) {
//				sum++;
//				System.out.println(cash[i][0]);
//			}
//		}
//		System.out.println("共" + sum + "個");
//		gg.close();
//		請設計由鍵盤輸入三個整數,分別代表西元yyyy年,mm月,dd日,執行後會顯示是該年的第幾天
//
//		例:輸入 1984 9 8 三個號碼後,程式會顯示「輸入的日期為該年第252天」
//
//		(提示1:Scanner,陣列)
//		(提示2:需將閏年條件加入)
//		(提示3:擋下錯誤輸入:例如月份輸入為2,則日期不該超過29)
//		while (true) {
//			int sum = 0;
//			Scanner ez = new Scanner(System.in);
//			System.out.println("請輸入年份");
//			int num1 = ez.nextInt();
//			System.out.println("請輸入月份");
//			int num2 = ez.nextInt();
//			System.out.println("請輸入日期");
//			int num3 = ez.nextInt();
//			int[] a = { 31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31 };
//			if ((num1 % 4 == 0 && num1 % 100 != 0) || num1 % 400 == 0) {
//				a[1] = 29;
//			}
//			if (num1 > 0 && 0 < num2 && num2 < 13 && 0 < num3 && num3 <= a[num2 - 1]) {
//
//				for (int i = 1; i < num2; i++) {
//
//					sum += a[i - 1];
//				}
//				sum += num3;
//				System.out.println("總共有" + sum);
//				break;
//			} else {
//				System.out.println("輸入錯誤日期");
//			}
//		}
//		班上有8位同學,他們進行了6次考試結果如下:
//
//			請算出每位同學考最高分的次數
		//
//		int score[][] = {{10,37},{35,75},{40,77},{100,89},{90,64},{85,75},{75,70},{70,95}};
//		
//		
//		
//		for(int i = 1 ; i <= 2 ; i++) {
//			int topPeople = 0 ;
//			int topScore = 0 ;
//			for(int j = 1 ; j <= 8 ; j++) {
//				if(score[j-1][i-1] > topScore) {
//					topScore = score[j-1][i-1] ;
//					topPeople = j  ; 
//				}
//			}
//			System.out.println("第"+i+"次考試，最高分的是第"+topPeople+"位同學");
//		}
		///////////////////////////////
		int a[][] = { {10, 35, 40, 100, 90, 85, 75, 70 }, {37, 75, 77, 89, 64, 75, 70, 95 },
				{100, 70, 79, 90, 75, 70, 79, 90 }, {77, 95, 70, 89, 60, 75, 85, 89 },
				{98, 70, 89, 90, 75, 90, 89, 90 }, {90, 80, 100, 75, 50, 20, 99, 75 } };
		//
		int frequency[] = new int[a[0].length];
		for (int i = 0; i < a.length; i++) {
			int max = a[i][0];
			for (int j = 1; j < a[i].length; j++) {
				if (a[i][j] > max) {
					max = a[i][j];
				}
			}
			for (int j = 0; j < a[i].length; j++) {
				if (a[i][j] == max) {
					frequency[j]++;
//					System.out.println("第" + (i + 1) + "次最高分的同學號碼" + (j + 1));
				}
			}
		}

		for (int index = 0; index < frequency.length; index++) {
			System.out.println("第" + (index + 1) + "位同學最高分" + frequency[index] + "次");
		}
	}
}
