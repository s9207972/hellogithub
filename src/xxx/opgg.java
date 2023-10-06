package xxx;

import java.util.Scanner;

public class opgg {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("阿文，請輸入你不想要的數字(1~9):");
		int ng = sc.nextInt();
		sc.close();
		int sum = 0;
		for (int i = 1; i <= 49; i++) {
			if (i % 10 != ng && i / 10 != ng) {
//        		System.out.println(i);
				sum++;
			}
		}
//        System.out.println(sum);
		int[] x = new int[sum];
		int index = 0;
		for (int i = 1; i <= 49; i++) {
			if (i % 10 != ng && i / 10 != ng) {
				x[index] = i;
				index++;
			}
		}
		 for (int g = 0;g<x.length;g++) {
	            if ((g + 1) % 6 == 0) {
	                System.out.println();
	            }
	            System.out.print(x[g]+" ");
	        }
	}
}
