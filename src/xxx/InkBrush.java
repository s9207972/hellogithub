package xxx;

public class InkBrush extends Pen {
	public InkBrush(String brand, double price) {
		super(brand, price);
	}
	public String write() {
		return "沾墨汁再寫";
	}
	public double getprice() {
		return super.getprice() * 0.9;
	}
}
