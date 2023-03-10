package Tuan5KeThuaChuyenXe;

import java.text.DecimalFormat;

public class ChuyenXe {
// khai báo
	protected String maChuyenXe;
	protected String hoTen;
	protected int soXe;
	protected double doanhThu;
	public String getMaChuyenXe() {
		return maChuyenXe;
	}
	public void setMaChuyenXe(String maChuyenXe) {
		this.maChuyenXe = maChuyenXe;
	}
	public String getHoTen() {
		return hoTen;
	}
	public void setHoTen(String hoTen) {
		this.hoTen = hoTen;
	}
	public int getSoXe() {
		return soXe;
	}
	public void setSoXe(int soXe) {
		this.soXe = soXe;
	}
	public double getDoanhThu() {
		return doanhThu;
	}
	public void setDoanhThu(double doanhThu) {
		this.doanhThu = doanhThu;
	}
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result
				+ ((maChuyenXe == null) ? 0 : maChuyenXe.hashCode());
		return result;
	}
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		ChuyenXe other = (ChuyenXe) obj;
		if (maChuyenXe == null) {
			if (other.maChuyenXe != null)
				return false;
		} else if (!maChuyenXe.equals(other.maChuyenXe))
			return false;
		return true;
	}
	public ChuyenXe(String maChuyenXe, String hoTen, int soXe, double doanhThu) {
		super();
		this.maChuyenXe = maChuyenXe;
		this.hoTen = hoTen;
		this.soXe = soXe;
		this.doanhThu = doanhThu;
	}
	public ChuyenXe() {
		super();
	
	}
@Override
	public String toString() {
		DecimalFormat df = new DecimalFormat("#,##0.00VNĐ");
		String doanhThuString = df.format(doanhThu);
		return("\n Mã chuyến xe: " + getMaChuyenXe() + "\n Họ và tên tài xế: " + getHoTen() + 
				"\n Số xe: " + getSoXe() + "\n Doanh thu: " + doanhThuString);
	}
	
}
