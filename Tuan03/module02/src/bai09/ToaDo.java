package bai09;

public class ToaDo {
	private String ten;
	private int x;
	private int y;

	public ToaDo(String ten, int x, int y) {
		super();
		this.ten = ten;
		this.x = x;
		this.y = y;
	}

	public String getTen() {
		return ten;
	}

	public void setTen(String ten) {
		this.ten = ten;
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

	public String toString() {
		return String.format("%s(%d,%2d)", this.ten, this.x, this.y);
	}
}
