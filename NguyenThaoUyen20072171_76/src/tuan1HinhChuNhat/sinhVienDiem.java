package tuan1HinhChuNhat;

public class sinhVienDiem {
	
	private int maSinhVien;
	private String hoTen;
	private float lyThuyet, thucHanh;
	public int getMaSinhVien() {
		return maSinhVien;
	}
	public void setMaSinhVien(int maSinhVien) {
		this.maSinhVien = maSinhVien;
	}
	public String getHoTen() {
		return hoTen ;
	}
	public void setHoTen(String hoTen) {
		this.hoTen = hoTen;
	}
	public float getLyThuyet() {
		return lyThuyet;
	}
	public void setLyThuyet(float lyThuyet) {
		this.lyThuyet = lyThuyet;
	}
	public float getThucHanh() {
		return thucHanh;
	}
	public void setThucHanh(float thucHanh) {
		this.thucHanh = thucHanh;
	}
	public sinhVienDiem(int maSinhVien, String hoTen, float lyThuyet, float thucHanh) 
	{
		super();
		this.maSinhVien = maSinhVien;
		this.hoTen = hoTen;
		this.lyThuyet = lyThuyet;
		this.thucHanh = thucHanh;
	}
	public sinhVienDiem() {
		super();
		this.maSinhVien = 0;
		this.hoTen = "";
		this.lyThuyet = 0;
		this.thucHanh = 0;
		
	}
	float diemTrungBinh()
	{
		float dtb= (getLyThuyet()+getThucHanh())/2;
		return dtb;
		
	}
	@Override
	public String toString() {
		String str="";
		str+= String.format("%15d%-35s%15.2f%15.2f%15.2f", getMaSinhVien()," "+ getHoTen(),getLyThuyet(),getThucHanh(), diemTrungBinh());
		// TODO Auto-generated method stub
		return str;
	}
	
}
