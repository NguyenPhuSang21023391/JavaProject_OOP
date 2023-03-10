package tuan4HTP;

import java.util.Date;



public class HTPList {

	private HangThucPham ds[];
	public int soLuongThuc=0;
	public int soLuongThucDS;
	
	public HTPList(int soLuong) {
		ds=new HangThucPham[soLuong];
	}
	
	public void TangKichThuoc() {
		HangThucPham temp[] = new HangThucPham[ds.length*2];
		for (int i =0;i<ds.length;i++) {
			temp[i]=ds[i];
		}
		ds=temp;
	}
	
	public int timKiem(int ma) {
		for(int i =0;i<soLuongThuc;i++) {
			if(ma==ds[i].getMaHang()) {
				return i;
			}
		}
		return -1;
	}
	
	public void them(HangThucPham htp) throws Exception {
		if(soLuongThuc == ds.length)
			TangKichThuoc();
		
		if(timKiem(htp.getMaHang())==-1) {
			ds[soLuongThuc]=htp;
			soLuongThuc++;
		}else {
			throw new Exception("Trung ma!");
		}
	}
	
	public void xoa(HangThucPham xoa) {
		int vt = timKiem(xoa.getMaHang());
		for (int i = vt;i<soLuongThuc-1;i++) {
			ds[i]=ds[i+1];
		}
		soLuongThuc--;
	}
	
	public void sua(HangThucPham sua) throws Exception {
		int vt = timKiem(sua.getMaHang());
		if(vt!=-1) 
			ds[vt]=sua;
		else
			throw new Exception("Khong tim thay obj de sua");
	}
	
	public HangThucPham [] getDSBeHonN(Date today) {
		soLuongThucDS=0;
		HangThucPham temp[] = new HangThucPham[soLuongThuc];
		for(int i=0;i<soLuongThuc;i++) {
			if(ds[i].getNgayHH().compareTo(today)<6) {
				temp[soLuongThucDS]=ds[i];
				soLuongThucDS++;
			}
		}
		return temp;
	}
	
	public HangThucPham[] getDsHtp(){
		return ds;
	}
	

}
