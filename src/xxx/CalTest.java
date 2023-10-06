package xxx;

import java.util.InputMismatchException;
import java.util.Scanner;

public class CalTest {
	public static void main(String[] args) {
		Scanner ez = new Scanner(System.in);
		while (true) {
			try {
				Calculator calculator = new Calculator();
				System.out.println("請輸入x的值");
				int x = ez.nextInt();
				System.out.println("請輸入y的值");
				int y = ez.nextInt();
				int result = calculator.powerXY(x, y);
				System.out.println(x + "的" + y + "次方=" + result);
				ez.close();
				break;
			} catch (CalException e) {
				System.out.println(e.getMessage());
				e.printStackTrace();
			} catch (InputMismatchException e) {
				System.out.println("輸入格式不正確");
			}
		}
	}
}
