package bai10;

public class LopHocPhan {
private String maLHP;
private String tenLHP;
private String tenGV;
private String thongTinLH;
SinhVien[] dsSV;
int count=0;
public LopHocPhan(String maLHP, String tenLHP, String tenGV, String thongTinLH, SinhVien[] dsSV) {
	super();
	this.maLHP = maLHP;
	this.tenLHP = tenLHP;
	this.tenGV = tenGV;
	this.thongTinLH = thongTinLH;
	this.dsSV = dsSV;
}
public String getMaLHP() {
	return maLHP;
}
public void setMaLHP(String maLHP) {
	this.maLHP = maLHP;
}
public String getTenLHP() {
	return tenLHP;
}
public void setTenLHP(String tenLHP) {
	this.tenLHP = tenLHP;
}
public String getTenGV() {
	return tenGV;
}
public void setTenGV(String tenGV) {
	this.tenGV = tenGV;
}
public String getThongTinLH() {
	return thongTinLH;
}
public void setThongTinLH(String thongTinLH) {
	this.thongTinLH = thongTinLH;
}
public SinhVien[] getDsSV() {
	return dsSV;
}
public void setDsSV(SinhVien[] dsSV) {
	this.dsSV = dsSV;
}
public void tangKT() {
	if(dsSV.length==count) {
		SinhVien[] tam = new SinhVien[dsSV.length*2];
		System.arraycopy(dsSV, 0, tam, 0, count);
		dsSV = tam;
	}
}
public void addSV(SinhVien sv) {
	tangKT();
	dsSV[count] = sv;
	count++;
}
public void inSV() {
	for (SinhVien sinhVien : dsSV) {
		if(sinhVien != null)
		System.out.println(sinhVien);
	}
}
public int tinhsl() {
	int k=0;
	for(int i=0;i<dsSV.length;i++) {
		if(dsSV[i] != null)
		k++;
	}
	return k;
}
public void timSV(String a) {
	for (SinhVien sinhVien : dsSV) {
		if(sinhVien.getMaSV().equalsIgnoreCase(a)) {
			System.out.println(sinhVien);
		}
	}
}

}

