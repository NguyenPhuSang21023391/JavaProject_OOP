package tuan4;

public class HinhTron {

	private double banKinh;
	private ToaDo tam;
	final double PI=3.14;
	
	public double getBanKinh() {
		return banKinh;
	}
	public void setBanKinh(double banKinh) {
		this.banKinh = banKinh;
	}
	public ToaDo getTam() {
		return tam;
	}
	public void setTam(ToaDo tam) {
		this.tam = tam;
	}
	public HinhTron(double banKinh, ToaDo tam) {
		super();
		this.banKinh = banKinh;
		this.tam = tam;
	}
	public HinhTron() {
		super();
	}

	public double chuVi() {
		double cv=0;
		cv=2*getBanKinh()*PI;
		return cv;
	}
	
	public double dienTich() {
		double dt=0;
		dt=PI*getBanKinh()*getBanKinh();
		return dt;
	}
	@Override
	public String toString() {
		String str="";
		str+= String.format("Diện tích và chu vi hình tròn tâm %s(%.0f,%.0f) có bán kính %.1f là  %.2f và  %.2f", tam.getTen(),tam.getX(),tam.getY(),getBanKinh(),chuVi(),dienTich());
		return str;
		
	}

}
