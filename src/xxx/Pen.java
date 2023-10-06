package xxx;

abstract class Pen {
	private String brand;
	private double price;

	public Pen() {

	}

	public void setbrand(String brand) {
		this.brand = brand;
	}

	public String getbrand() {
		return brand;
	}

	public void setprice(double price) {
		this.price = price;
	}

	public double getprice() {
		return price;
	}

	public Pen(String brand, double price) {
		this.brand = brand;
		this.price = price;
	}

	public abstract String write();
}
