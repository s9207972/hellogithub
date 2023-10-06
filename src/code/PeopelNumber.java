package code;

import java.util.Scanner;

public class PeopelNumber {
	public static void main(String[] args) {
		String regex = "^[A-Z][12]\\d{8}$";
		Scanner sc = new Scanner(System.in);
		String number = sc.next();
		if (number.matches(regex)) {
			System.out.println("你比鈺漳聰明");			
		} else {
			System.out.println("你是鈺漳那87嗎");
		}
	}
}
