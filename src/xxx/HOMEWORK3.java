package xxx;

import java.util.Scanner;

public class HOMEWORK3 {
//請設計一隻程式,使用者輸入三個數字後,輸出結果會為正三角形、等腰
//	三角形、其它三角形或不是三角形,如圖示結果:
	@SuppressWarnings("resource")
	public static void main(String[] args) {
//		Scanner gg = new Scanner(System.in);
//		System.out.println("請輸入三個整數");
//		int data1 = gg.nextInt();
//		int data2 = gg.nextInt();
//		int data3 = gg.nextInt();
//
//		if (data1 > 0 && data2 > 0 && data3 > 0 && data1 + data2 > data3 && data1 + data3 > data2
//				&& data2 + data3 > data1) {
//			if (data1 == data2 && data2 == data3) {
//				System.out.println("正三角形");
//			} else if (data1 == data2 || data2 == data3 || data1 == data3) {
//				System.out.println("等腰三角形");
//			} else {
//				if ((data1 * data1) + (data2 * data2) == (data3 * data3)
//						|| (data3 * data3) + (data1 * data1) == (data2 * data2)
//						|| (data3 * data3) + (data2 * data2) == (data1 * data1)) {
//					System.out.println("直角三角形");
//				} else {
//					System.out.println("其他三角形");
//				}
//			}
//		} else {
//			System.out.println("不是三角形");
//		}
//		請設計一隻程式,會亂數產生一個0~9的數字,然後可以玩猜數字遊戲,猜錯會顯示錯誤訊息,猜
//		對則顯示正確訊息,如圖示結果:
//		Scanner ff = new Scanner(System.in);
//		System.out.println("開始猜數字吧");
//
//		int j = (int) (Math.random() * 101);
//		while (true) {
//			int data9 = ff.nextInt();
//			if (data9 == j) {
//				System.out.println("終於答對了");
//				break;
//			} else if (data9 < j) {
//				System.out.println("答錯囉,答案還要在大點");
//			} else {
//
//				System.out.println("答錯囉,答案還要在小點");
//			}
//		}
//		阿文很喜歡簽大樂透(1~49),但他是個善變的人,上次討厭數字是4,但這次他想要依心情決定討
//		厭哪個數字,請您設計一隻程式,讓阿文可以輸入他不想要的數字(1~9),畫面會顯示他可以選擇
//		的號碼與總數,如圖:
//				
		Scanner sc = new Scanner(System.in);
        System.out.print("阿文，請輸入你不想要的數字(1~49):");
        int ng = sc.nextInt();       
        int[] numbers = new int[49];

        for(int i =1 ; i<=49 ; i++) {
        	numbers[i-1] = i;
        }
               
        int count = 0;
        for (int number : numbers) {
            if (number / 10 != ng  && number % 10 !=ng) {
            	count ++ ;
            }
        }
    	int[] otherNumbers = new int[count];
    	
    	int count1 = 0 ;
        for (int number : numbers) {
            if (number / 10 != ng  && number % 10 !=ng) {
            	otherNumbers[count1] = number;
            	count1++;
            }
        }	        	                	        	
	        System.out.println("阿文可以選擇的號碼為:");
        displayNumbersInRows(otherNumbers);
        System.out.println("幫您選擇六個號碼為:");
        
        for(int i = 1 ; i <= 6 ; i++) {
        	int ii = (int) (Math.random()*count) + 1;
        	System.out.print(otherNumbers[ii]+ " ");
        }
        

    }

    public static void displayNumbersInRows(int[] numbers) {
        for (int i = 0; i < numbers.length; i++) {
            System.out.print(numbers[i] + " ");
            if ((i + 1) % 6 == 0) {
                System.out.println();
            }
        }
        System.out.println();
	}
}
