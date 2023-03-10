package bai02;

public class Point {
	private int x, y;

	public Point(int x, int y) {
		this.x = x;
		this.y = y;
	}

	public Point() {
		x = 0;
		y = 0;
	}

	public int getX() {
		return x;
	}

	public void setX(int x) {
		this.x = x;
	}

	public int getY() {
		return y;
	}

	public void setY(int y) {
		this.y = y;
	}

	public String negate() {
		return String.format("(%d,%d)",-x,-y);
	}

	public double getDistance() {
		return Math.sqrt(x * x + y * y);
	}

	@Override
	public String toString() {
		return String.format("(%d,%d)", x, y);
	}

}
