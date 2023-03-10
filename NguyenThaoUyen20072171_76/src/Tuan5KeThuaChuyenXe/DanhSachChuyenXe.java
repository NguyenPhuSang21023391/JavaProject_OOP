package Tuan5KeThuaChuyenXe;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.Comparator;

public class DanhSachChuyenXe 
{
	ArrayList<ChuyenXe> DS;
	public DanhSachChuyenXe(){
		DS = new ArrayList<ChuyenXe>();
	}
	public void them(ChuyenXe xe) throws Exception
	{
		if(DS.contains(xe)== false)
			DS.add(xe);
		else
		{
			throw new Exception(" Mã chuyến xe đã trùng");
		}
	}
	public int timKiemViTri (String maCX)
	{
		ChuyenXe findxe = timKiem(maCX);
		if( findxe != null)
			return DS.indexOf(timKiem(maCX));
		return -1;
	}
	public ChuyenXe timKiem( String maCX)
	{
		for(ChuyenXe xe : DS)
		{
			if(xe.getMaChuyenXe().equalsIgnoreCase(maCX))
				return xe;
		}
		return null;
	}
	public void xoa(ChuyenXe xe)
	{
		DS.remove(xe);
	}
	public void sua(ChuyenXe xe)
	{
	int vt = timKiemViTri(xe.getMaChuyenXe());
	DS.set(vt,xe);
	}
	public double tinhDoanhThu()
	{
		double s = 0;
		for( ChuyenXe xe : DS)
			s += xe.getDoanhThu();
		return s;
	}
	
// sắp xếp theo tên tài xế
	
	public void sortTheoTenTaiXe()
	{
		Collections.sort(DS, new Comparator<ChuyenXe>() 
		{
			
			@Override
			public int compare(ChuyenXe x1, ChuyenXe x2) 
			{
				return x1.getHoTen().compareToIgnoreCase(x2.getHoTen());
			}
		});
	}
	
// sắp xếp theo doanh thu
	
	public void sortTheoDoanhThu()
	{
		Collections.sort(DS, new Comparator<ChuyenXe>()
				{

					@Override
					public int compare(ChuyenXe x1, ChuyenXe x2) 
					{
						Double doanhThuXe1 = (Double) x1.getDoanhThu();
						Double doanhThuXe2 = (Double) x2.getDoanhThu();
						return doanhThuXe1.compareTo(doanhThuXe2);
					}
				});	
	}
	
	public void sortTheo2Fied()
	{
		Collections.sort(DS, new Comparator<ChuyenXe>() 
		{
			@Override
			public int compare(ChuyenXe x1, ChuyenXe x2) 
			{
				String xe1 = x1.getHoTen();
				String xe2 = x1.getHoTen();
				int Comp = xe1.compareTo(xe2);
				if (Comp != 0)
				return Comp;
				else
				{
				Double dt1 = x1.getDoanhThu();
				Double dt2 = x2.getDoanhThu();
				return dt1.compareTo(dt2);
				}
			}
		});
	}
	
// trả về danh sách chuyến xe nội thành
	
		public ArrayList<ChuyenXe> getDSXeNoiThanh()
		{
			ArrayList<ChuyenXe> DSXeNoiThanh = new ArrayList<ChuyenXe>();
					for (ChuyenXe xe : DS) 
						if( xe instanceof NoiThanh)
							DSXeNoiThanh.add(xe);
			return DSXeNoiThanh;
		}
			
// trả về danh sách chuyến xe ngoại thành
	
	public ArrayList<ChuyenXe> getDSXeNgoaiThanh()
	{
		ArrayList<ChuyenXe> DSXeNgoaiThanh = new ArrayList<ChuyenXe>();
				for (ChuyenXe xe : DS) 
					if( xe instanceof NgoaiThanh)
						DSXeNgoaiThanh.add(xe);
		return DSXeNgoaiThanh;
	}
	
// trả về danh sách chuyến xe
	
	public ArrayList<ChuyenXe> getDS()
	{
		return DS;
	}
}
