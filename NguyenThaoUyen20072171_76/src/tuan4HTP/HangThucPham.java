package tuan4HTP;

import java.sql.Date;
import java.text.NumberFormat;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Locale;

public class HangThucPham {

		private int maHang;
		private String tenHang;
		private double donGia;
		private Date ngaySX;
		private Date ngayHH;
		
		public int getMaHang() {
			return maHang;
		}
		public void setMaHang(int maHang) throws Exception {
				this.maHang = maHang;
			
		}
		public String getTenHang() {
			return tenHang;
		}
		public void setTenHang(String tenHang) throws Exception {
			if(!tenHang.trim().equals(""))
				this.tenHang = tenHang;
			else
				throw new Exception("Lỗi! Mã hàng rỗng !");
		}
		public double getDonGia() {
			return donGia;
		}
		public void setDonGia(double donGia) {
			this.donGia = donGia;
		}

		public  Date getNgaySX() {
			return ngaySX;
		}
		public void setNgaySX(Date ngaySX) {
			this.ngaySX = ngaySX;
		}
		public Date getNgayHH() {
			return ngayHH;
		}
		public void setNgayHH(Date ngayHH) {
			this.ngayHH = ngayHH;
		}
		
		public HangThucPham(int maHang, String tenHang, double donGia, Date string, Date string2) {
			super();
			this.maHang = maHang;
			this.tenHang = tenHang;
			this.donGia = donGia;
			this.ngaySX = string;
			this.ngayHH = string2;
		}
		
		public HangThucPham() {
			super();

		}


		public HangThucPham(int maHang2, String tenHang2, int donGia2,
				String string, String string2) {
			// TODO Auto-generated constructor stub
		}
		//Khá»Ÿi táº¡o phÆ°Æ¡ng thá»©c Ä‘á»ƒ nháº­p nÄƒm thÃ¡ng ngÃ y sáº£n xuáº¥t
	    public void setNSX(int year, int month, int day) {
	        Calendar calendar = Calendar.getInstance();
	        calendar.set(year, month - 1, day);
	        this.ngaySX = (Date) calendar.getTime();
	    }
	 
	    //Khá»Ÿi táº¡o phÆ°Æ¡ng thá»©c Ä‘á»ƒ nháº­p háº¡n sá»­ dá»¥ng
	    public void setHSD(int year, int month, int day) {
	        Calendar calendar = Calendar.getInstance();
	        calendar.set(year, month - 1, day);
	        this.ngayHH = (Date) calendar.getTime();
	    }
		
		public boolean kiemTraNgay(boolean k) throws Exception {
			if(this.getNgaySX().compareTo(getNgayHH())<0) {
				k= false;
			}else {
				throw new Exception("NgÃ y háº¿t háº¡n khÃ´ng Ä‘Æ°á»£c nhá»� hÆ¡n ngÃ y sáº£n xuáº¥t");
			}
			return k;
		}
		
		public boolean kiemTraHSD() throws Exception {
			Date today = new Date(maHang);
			today.getTime();
			if(this.getNgayHH().compareTo(today)<0) {
				throw new Exception("HÃ ng hÃ³a Ä‘Ã£ háº¿t háº¡n");
			}else {
				return false;
			}
		}
		
		
		@Override
		public String toString() {
			// TODO Auto-generated method stub
			Locale localeVN = new Locale("vi", "VN");
			NumberFormat numberFormat = NumberFormat.getCurrencyInstance(localeVN);
			String strGia=numberFormat.format(getDonGia());
			
			SimpleDateFormat sdf= new SimpleDateFormat("dd/MM/yyyy");
			String strSX = sdf.format(getNgaySX());
			String strHH = sdf.format(getNgayHH());
			
			String str="";
			str = String.format("%10d%-35s%15s%20s%20s", getMaHang()," "+getTenHang(),strGia,strSX,strHH);
			return str;
		}
	
}
