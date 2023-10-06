package xxx;

public class BMIpratic {
	public static void main(String[] args) {
		int kg = 90;
		double high = 1.75;
		double bmi = kg / (high * high);

		if (bmi < 18.5) {
			System.out.printf("BMI = %.3f 彥廷有點瘦", bmi);
		} else if (18.5 <= bmi && bmi < 24) {
			System.out.printf("BMI = %.3f 彥廷很正常", bmi);
		} else {
			System.out.printf("BMI = %.3f 鈺漳好胖", bmi);
		}

	}
}