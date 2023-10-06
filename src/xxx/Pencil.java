package xxx;

public class Pencil extends Pen {
	public Pencil(String brand, double price) {
		super(brand, price);
	}

	public String write() {
		return "削鉛筆再寫";
	}

	public double getprice() {
		return super.getprice() * 0.8;
	}
}
