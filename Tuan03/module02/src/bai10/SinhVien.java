package bai10;

public class SinhVien {
private String maSV;
private String hoTen;
public SinhVien(String maSV, String hoTen) {
	super();
	this.maSV = maSV;
	this.hoTen = hoTen;
}
public String getMaSV() {
	return maSV;
}
public void setMaSV(String maSV) {
	this.maSV = maSV;
}
public String getHoTen() {
	return hoTen;
}
public void setHoTen(String hoTen) {
	this.hoTen = hoTen;
}
public String toString() {
	String s = "";
	s+=String.format("%-10s|%10s", maSV, hoTen);
	return s;
}
}
