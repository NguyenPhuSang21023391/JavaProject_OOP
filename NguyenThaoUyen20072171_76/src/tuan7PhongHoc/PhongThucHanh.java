package tuan7PhongHoc;

public class PhongThucHanh extends PhongHoc {

	private int soMayTinh;

	public int getSoMayTinh() {
		return soMayTinh;
	}

	public void setSoMayTinh(int soMayTinh) {
		this.soMayTinh = soMayTinh;
	}

	public PhongThucHanh() {
		super();
		// TODO Auto-generated constructor stub
	}

	public PhongThucHanh(String maPhong, String dayNha, double dienTich, int soBongDen) {
		super(maPhong, dayNha, dienTich, soBongDen);
		// TODO Auto-generated constructor stub
	}
	
	public PhongThucHanh(String maPhong, String dayNha, double dienTich, int soBongDen, int soMayTinh) {
		super(maPhong, dayNha, dienTich, soBongDen);
		this.soMayTinh = soMayTinh;
	}

	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return super.toString()+String.format("%10d", getSoMayTinh());
	}

	@Override
	boolean datChuan() {
		// TODO Auto-generated method stub
		if((getDienTich()/getSoMayTinh()<=1.5) && duSang()==true)
			return true;
		else
			return false;
	}
}
