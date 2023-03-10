package tuan7PhongHoc;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

public class DanhSachPhongHoc {
	private ArrayList<PhongHoc> DsPhong;
	
	public DanhSachPhongHoc() {
		// TODO Auto-generated constructor stub
		DsPhong = new ArrayList<PhongHoc>();
	}
	
	public PhongHoc timKiem(String maP) {
		for (PhongHoc p : DsPhong)
			if(p.getMaPhong().equalsIgnoreCase(maP))
				return p;
		return null;
	}
	
	public int timKiemViTri(String maP) {
		PhongHoc timPhong = timKiem(maP);
		if(timPhong!=null) {
			return DsPhong.indexOf(timPhong);
		}
		return -1;
	}
	
	public boolean them(PhongHoc p) {
		if(DsPhong.contains(p))
			return false;
		else {
			DsPhong.add(p);
			return true;
		}
	}
	
	public void xoa(PhongHoc p) {
		DsPhong.remove(p);
	}
	
	public void sua(PhongHoc p) {
		int vt = timKiemViTri(p.getMaPhong());
		if(vt!=-1)
			DsPhong.set(vt, p);
	}
	
	
	
	public void sortTheoDayNha() {//tang dan`	
		Collections.sort(DsPhong, new Comparator<PhongHoc>() {

			@Override
			public int compare(PhongHoc o1, PhongHoc o2) {
				// TODO Auto-generated method stub
				String p1 = o1.getDayNha();
				String p2 = o2.getDayNha();
				return p1.compareTo(p2);
			}
		});
	}
	
	public void sortTheoDienTich() {//giam dan`
		Collections.sort(DsPhong, new Comparator<PhongHoc>() {

			@Override
			public int compare(PhongHoc o1, PhongHoc o2) {
				// TODO Auto-generated method stub
				Double p1 = o1.getDienTich();
				Double p2 = o2.getDienTich();
				return p2.compareTo(p1);
			}
		});
	}
	
	public void sortTheoSoBongDen() {//tang dan`
		Collections.sort(DsPhong,new Comparator<PhongHoc>() {

			@Override
			public int compare(PhongHoc o1, PhongHoc o2) {
				// TODO Auto-generated method stub
				Integer p1 = o1.getSoBongDen();
				Integer p2 = o2.getSoBongDen();
				return p1.compareTo(p2);
			}
		});
	}
	
	public ArrayList<PhongHoc> getDsPhongDatChuan(){
		ArrayList<PhongHoc> DsPhongDatChuan = new ArrayList<PhongHoc>();
		for (PhongHoc p : DsPhong) {
			if (p.datChuan()==true) {
				DsPhongDatChuan.add(p);
			}
		}
		return DsPhongDatChuan;
	}
	
	public int getTongSoPhongHoc() {
		int tongPhong = 0;
		for(PhongHoc p : DsPhong) {
			tongPhong++;
		}
		return tongPhong;
	}
	
	public ArrayList<PhongHoc> getDsPhongMayCo60May(){
		ArrayList<PhongHoc> DsPhongCo60May = new ArrayList<PhongHoc>();
		for(PhongHoc p: DsPhong) {
			if(p instanceof PhongThucHanh) {
				if(p.soBongDen <= 60) {
					DsPhongCo60May.add(p);
				}
			}
		}
		return DsPhongCo60May;
	}
	
	public ArrayList<PhongHoc> getDsPhong(){
		return DsPhong;
	}
	
}
