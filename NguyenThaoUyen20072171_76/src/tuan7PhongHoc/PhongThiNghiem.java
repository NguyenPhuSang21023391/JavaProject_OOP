package tuan7PhongHoc;

public class PhongThiNghiem extends PhongHoc {
	private String chuyenNganh;
	private int sucChua;
	private boolean bonRua;
	public String getChuyenNganh() {
		return chuyenNganh;
	}
	public void setChuyenNganh(String chuyenNganh) {
		this.chuyenNganh = chuyenNganh;
	}
	public int getSucChua() {
		return sucChua;
	}
	public void setSucChua(int sucChua) {
		this.sucChua = sucChua;
	}
	public boolean isBonRua() {
		return bonRua;
	}
	public void setBonRua(boolean bonRua) {
		this.bonRua = bonRua;
	}
	
	
	public PhongThiNghiem(String maPhong, String dayNha, double dienTich, int soBongDen, String chuyenNganh,
			int sucChua, boolean bonRua) {
		super(maPhong, dayNha, dienTich, soBongDen);
		this.chuyenNganh = chuyenNganh;
		this.sucChua = sucChua;
		this.bonRua = bonRua;
	}
	public PhongThiNghiem() {
		super();
		// TODO Auto-generated constructor stub
	}
	public PhongThiNghiem(String maPhong, String dayNha, double dienTich, int soBongDen) {
		super(maPhong, dayNha, dienTich, soBongDen);
		// TODO Auto-generated constructor stub
	}
	
	@Override
	public String toString() {
		// TODO Auto-generated method stub
		String sBonRua = (isBonRua()==true) ? "Có" : "Không";
		return super.toString()+String.format("%-10s%10d%10s", "\t"+getChuyenNganh(),getSucChua(),sBonRua);
	}
	@Override
	boolean datChuan() {
		// TODO Auto-generated method stub
		if((this.bonRua==true) && duSang()==true)
			return true;
		else
			return false;
	}
}