package tuan7PhongHoc;

public class PhongLyThuyet extends PhongHoc {

	private boolean mayChieu;

	public boolean isMayChieu() {
		return mayChieu;
	}

	public void setMayChieu(boolean mayChieu) {
		this.mayChieu = mayChieu;
	}

	public PhongLyThuyet(String maPhong, String dayNha, double dienTich, int soBongDen, boolean mayChieu) {
		super(maPhong, dayNha, dienTich, soBongDen);
		this.mayChieu = mayChieu;
	}

	public PhongLyThuyet() {
		super();
		// TODO Auto-generated constructor stub
	}

	public PhongLyThuyet(String maPhong, String dayNha, double dienTich, int soBongDen) {
		super(maPhong, dayNha, dienTich, soBongDen);
		// TODO Auto-generated constructor stub
	}
	
	@Override
	public String toString() {
		// TODO Auto-generated method stub
		String s = "";
		if(isMayChieu()==true)
			s= "Có";
		else
			s= "Không";
		return super.toString()+String.format("%-15s",s);
	}

	@Override
	boolean datChuan() {
		// TODO Auto-generated method stub
		if(this.mayChieu==true && duSang()==true) 
			return true;
		else
			return false;
	}

}
