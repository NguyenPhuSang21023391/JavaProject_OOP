package Tuan4SoTietKiem;

import java.lang.reflect.Array;
import java.util.Arrays;

public class KhachHang {
private String maKH;
private String tenKH;
private SoTietKiem[] dsSoTietKiem;
private int soLuongSoHienCo;
public String getMaKH() {
	return maKH;
}
public void setMaKH(String maKH) {
	this.maKH = maKH;
}
public String getTenKH() {
	return tenKH;
}
public void setTenKH(String tenKH) {
	this.tenKH = tenKH;
}
public SoTietKiem[] getDsSoTietKiem() {
	return dsSoTietKiem;
}
public void setDsSoTietKiem(SoTietKiem[] dsSoTietKiem) {
	this.dsSoTietKiem = dsSoTietKiem;
}
public int getSoLuongSoHienCo() {
	return soLuongSoHienCo;
}
public void setSoLuongSoHienCo(int soLuongSoHienCo) {
	this.soLuongSoHienCo = soLuongSoHienCo;
}
public KhachHang(String maKH, String tenKH, int maxSoSo) {
	super();
	this.maKH = maKH;
	this.tenKH = tenKH;
	this.dsSoTietKiem = new SoTietKiem[maxSoSo];
	this.soLuongSoHienCo = 0;
}
public KhachHang() {
	super();

}

public boolean themSoTietKiem(SoTietKiem stk){
	dsSoTietKiem[soLuongSoHienCo] = stk;
	soLuongSoHienCo++;
	return true;
}

@Override
	public String toString() {
		return "KhachHang [maKH=" + maKH +", tenKH=" + tenKH + ", dsSoTietKiem=" + Arrays.toString(dsSoTietKiem)
				+ ", soLuongSoHienCo=" + soLuongSoHienCo + "]";
	}
	
	
}
