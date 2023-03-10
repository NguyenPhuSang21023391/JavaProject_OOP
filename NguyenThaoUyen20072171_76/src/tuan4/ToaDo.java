package tuan4;

public class ToaDo {
	private String ten;
	private float x,y;
	public String getTen() {
		return ten;
	}
	public void setTen(String ten) {
		this.ten = ten;
	}
	public float getX() {
		return x;
	}
	public void setX(float x) {
		this.x = x;
	}
	public float getY() {
		return y;
	}
	public void setY(float y) {
		this.y = y;
	}
	public ToaDo(String ten, float x, float y) {
		super();
		this.ten = ten;
		this.x = x;
		this.y = y;
	}
	public ToaDo() {
		super();
		
	}
	@Override
	public String toString() {
		String str="";
		str+=String.format("%-25s%10f%10f", getTen(),getX(),getY());
		return str;
	}
	

	
}
