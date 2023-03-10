package bai09;

public class HinhTron {
	private ToaDo tam;
	private double banKinh;

	public HinhTron() {

	}

	public HinhTron(ToaDo tam, double banKinh) {
		super();
		this.tam = tam;
		this.banKinh = banKinh;
	}

	public ToaDo getTam() {
		return tam;
	}

	public void setTam(ToaDo tam) {
		this.tam = tam;
	}

	public double getBanKinh() {
		return banKinh;
	}

	public void setBanKinh(double banKinh) {
		this.banKinh = banKinh;
	}

	public double tinhChuVi() {
		return Math.PI * 2 * this.banKinh;
	}

	public double tinhDienTich() {
		double x = 2.0;
		return Math.PI * Math.pow(banKinh, x);
	}

	public String toString() {
		return String.format("%s %s %s %.2f %s %.2f %s %.2f", "Dien tich va chu vi hinh tron tam : ",
				this.tam.toString(), " co ban kinh ", this.banKinh, " la ", this.tinhDienTich(), " va ",
				this.tinhChuVi());
	}

}
