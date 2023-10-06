package xxx;


import java.util.Random;
import java.util.Scanner;

public class Homework5 {
//	請設計一個方法為starSquare(int width, int height),當使用者鍵盤輸入寬與高時,即會印出對應的*長方形,如
//	圖:
    public void starSquare(int width, int height) {
        for (int i = 0; i < height; i++) {
            for (int j = 0; j < width; j++) {
                System.out.print('*');
            }
            System.out.println();
        }
        System.out.println("=================================================");
    }   
//    請設計一個方法為randAvg(),從10個 0~100(含100)的
//    整數亂數中取平均值並印出這10個亂數與平均值,如圖:
    public void rangAvg() {
    	int []x = new int [10];  		
    	System.out.println("本次亂數結果為:");
    	for(int j = 0;j<10;j++) {   		
        	int i = (int)(Math.random()*101);   		
    	    x[j]=i;
    		System.out.print(i+"   ");    		
    	}
    	int sum = 0;
    	for (int avg = 0;avg<x.length;avg++) {
    		sum+=x[avg];    		  		
    	}
    	System.out.print("\n"+"平均值="+sum/x.length+"\n");
    	System.out.println("=================================================");
    }
//    利用Overloading,設計兩個方法int maxElement(int x[][])與double maxElement(double x[][]),
//    可以找出二維陣列的最大值並回傳,如圖:
    public  int maxElement(int x[][]) {
        int max = 0;
    	for(int i = 0;i<x.length;i++) {
    		for(int j = 0;j<x[i].length;j++) {
    			if(max<=x[i][j]) {
    				max=x[i][j];
    			}
    		}
    	}
    	return max;
    }
    public double maxElement(double x[][]) {
    	double max = 0;
    	for(int i = 0;i<x.length;i++) {
    		for(int j = 0;j<x[i].length;j++) {
    			if(max<=x[i][j]) {
    				max=x[i][j];
    			}
    		}
    	}    	
    	return max;
    }
//	==================================================
//    身為程式設計師的你,收到一個任務,要幫系統的註冊新增驗證碼的功能,請設計一個方法
//    genAuthCode(),當呼叫此方法時,會回傳一個8位數的驗證碼,此驗證碼內容包含了英文大小寫
//    與數字的亂數組合,如圖:
    public String genAuthCode() {
    	String string = "ABCDEFGHIJKLMNOPQRSTUVWXYZabcdefghijklmnopqrstuvwxyz0123456789";    	
    	char []password = string.toCharArray();
    	char [] xx = new char[8];
    	Random random = new Random();
    	for(int i = 0;i<8;i++) {
    		int j = random.nextInt(password.length);
    		xx[i]=password[j];
    	}
    	return new String(xx);
    }
//	==================================================
    public static void main(String[] args) {
        Homework5 hw = new Homework5();
        Scanner sc = new Scanner(System.in);
        System.out.println("請輸入寬度：");
        int width = sc.nextInt();
        System.out.println("請輸入高度：");
        int height = sc.nextInt();
        hw.starSquare(width, height);
        sc.close();                                //第一題
//    	==================================================
    	Homework5 math = new Homework5();
    	math.rangAvg();                            //第二題
//    	==================================================
    	Homework5 max = new Homework5();
    	int x[][]= {{1,6,3},{9,5,2}};
    	double y[][]= {{1.2,3.5,2.2},{7.4,2.1,8.2}};
    	System.out.println("最大值="+max.maxElement(x));
    	System.out.println("最大值="+max.maxElement(y));
    	System.out.println("=================================================");//第三題
//    	==================================================
    	Homework5 xx = new Homework5();
    	System.out.println("本次隨機的驗證碼="+xx.genAuthCode());//第五題
    }
}
