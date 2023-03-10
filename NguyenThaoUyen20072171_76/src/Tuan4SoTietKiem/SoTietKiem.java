package Tuan4SoTietKiem;

import java.time.Instant;
import java.time.LocalDate;
import java.time.Period;
import java.time.ZoneId;
import java.time.ZonedDateTime;
import java.util.Arrays;

public class SoTietKiem {

	private String maSo;
	private LocalDate ngayMoSo;
	private double soTienGoi;
	private int kyHan;
	private float laiSuat;
	public String getMaSo() {
		return maSo;
	}
	public void setMaSo(String maSo) {
		this.maSo = maSo;
	}
	public LocalDate getNgayMoSo() {
		return ngayMoSo;
	}
	public void setNgayMoSo(LocalDate ngayMoSo) {
		this.ngayMoSo = ngayMoSo;
	}
	public double getSoTienGoi() {
		return soTienGoi;
	}
	public void setSoTienGoi(double soTienGoi) {
		this.soTienGoi = soTienGoi;
	}
	public int getKyHan() {
		return kyHan;
	}
	public void setKyHan(int kyHan) {
		this.kyHan = kyHan;
	}
	public float getLaiSuat() {
		return laiSuat;
	}
	public void setLaiSuat(float laiSuat) {
		this.laiSuat = laiSuat;
	}
	public SoTietKiem(String maSo, LocalDate ngayMoSo, double soTienGoi,
			int kyHan, float laiSuat) {
		super();
		this.maSo = maSo;
		this.ngayMoSo = ngayMoSo;
		this.soTienGoi = soTienGoi;
		this.kyHan = kyHan;
		this.laiSuat = laiSuat;
	}
	public SoTietKiem() {
		super();
	}
	public void setNgayMoSo(int year, int month, int day){
		LocalDate date= LocalDate.now();
		this.ngayMoSo = date;
	}
public int soThangGoiThuc(){
	Period age = Period.between(ngayMoSo, LocalDate.now());
	int dt_nam = age.getDays();
	int dt_thang = age.getMonths();
	int soThangGoi = dt_nam*12+dt_thang;
	if(soThangGoi % kyHan == 0)
		return soThangGoi;
	else
		return soThangGoi/kyHan*kyHan;
	
}

public double tinhTienLai(){
	double tienLai = (getSoTienGoi()*getLaiSuat()/12*soThangGoiThuc());
	return tienLai;
}

@Override
public String toString() {
	// TODO Auto-generated method stub
	return "SoTietKiem [maSo=" + maSo +", ngayMoSo=" + ngayMoSo + ", soTienGoi=" + soTienGoi + ", kyHan=" + kyHan 
			+ ",laiSuat=" + laiSuat +", soThangGoiThuc()=" + soThangGoiThuc() + "]";
}
}
