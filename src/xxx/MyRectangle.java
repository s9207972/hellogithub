package xxx;

public class MyRectangle {
	public double width;
	public double depth;

	public MyRectangle() {

	}

	public void setWidth(double width) {
		this.width = width;
	}

	public void setDepth(double depth) {
		this.depth = depth;
	}

	public MyRectangle(double width, double depth) {
		this.width = width;
		this.depth = depth;
	}

	public void getrea() {
		System.out.println("width=" + width);
		System.out.println("depth=" + depth);
		System.out.println("面積=" + width * depth);
	}
}
