package bai12;

public class CDList {
	private CD ds[];
	public int soLuongHT = 0;
	public int soLuongHTofDG = 0;
	
	public CDList(int soLuong) {
		ds = new CD[soLuong];
	}
	
	public void TangKichTHuoc() {
		CD temp[] = new CD[ds.length * 2];
		for (int i = 0; i < ds.length; i++) {
			temp[i] = ds[i]
	;		}
		ds = temp;
	}
	public void them(CD cd) throws Exception {
		if(soLuongHT == ds.length)
			TangKichTHuoc();
		if(timKiem(cd.getMaCD())== -1) {
			ds[soLuongHT] = cd;
			soLuongHT++;
		}
		else {
			throw new Exception("Trung Ma");
		}
	}
	public int timKiem(int maCD) {
		for(int i = 0; i < soLuongHT; i++) {
			if(maCD == ds[i].getMaCD())
				return i+1;
		}
		return -1;
	}
	public void xoa(CD acc) {
		int vt = timKiem(acc.getMaCD());
		for(int i = vt; i < soLuongHT -1 ; i++) {
			ds[i] = ds[i+1];
		}
		soLuongHT--;
	}
	public void sua(CD sua) throws Exception {
		int vt = timKiem(sua.getMaCD());
		if(vt!=1)
			ds[vt] = sua;
		else
			throw new Exception("Khong tim thay obj de sua");
	}
	public double getMoney() {
		double ans = 0;
		for(int i = 0; i < soLuongHT; i++) {
			ans += ds[i].getGiaThanh();
		}
		return ans;
	}
	public void swap(CD list[], int i, int j, CD temp) {
		temp = ds[i];
		ds[i] = ds[j];
		ds[j] = temp;
	}
	public void sortTheoGiaThanh() {
		CD temp = null;
		for(int i = 0; i < soLuongHT - 1; i++) {
			for(int j = i+1; j<soLuongHT; j++)
				if(ds[i].getGiaThanh()>ds[j].getGiaThanh()) {
					swap(ds, i, j, temp);
				}
		}
	}
	public void sortTheoTuaCD() {
		CD temp = null;
		for(int i =0; i<soLuongHT-1; i++) {
			for(int j = i+1; j<soLuongHT; j++) {
				if(ds[i].getTuaCD().compareTo(ds[j].getTuaCD()) < 0) {
					swap(ds, i, j, temp);
				}
			}
		}
	}
	public CD [] getDSBeHonN(double soTien) {
		soLuongHTofDG = 0;
		CD temp[] = new CD[soLuongHT];
		for(int i = 0; i<soLuongHT; i++) {
			if(ds[i].getGiaThanh()<=soTien) {
				temp[soLuongHTofDG] = ds[i];
				soLuongHTofDG++;
			}
		}
		return temp;
	}
	public CD[] getDsAC() {
		return ds;
	}
}