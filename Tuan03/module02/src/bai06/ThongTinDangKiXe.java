package bai06;

public class ThongTinDangKiXe{

    private String tenChuXe;
    private String loaiXe;
    private int dungTich;
    private float triGia;
    
    
 
    public ThongTinDangKiXe() {
		super();
		// TODO Auto-generated constructor stub
	}



	public ThongTinDangKiXe(String tenChuXe, String loaiXe, int dungTich, float triGia) {
		super();
		this.tenChuXe = tenChuXe;
		this.loaiXe = loaiXe;
		this.dungTich = dungTich;
		this.triGia = triGia;
	}



	public String getTenChuXe() {
		return tenChuXe;
	}



	public void setTenChuXe(String tenChuXe) {
		this.tenChuXe = tenChuXe;
	}



	public String getLoaiXe() {
		return loaiXe;
	}



	public void setLoaiXe(String loaiXe) {
		this.loaiXe = loaiXe;
	}



	public int getDungTich() {
		return dungTich;
	}



	public void setDungTich(int dungTich) {
		this.dungTich = dungTich;
	}



	public float getTriGia() {
		return triGia;
	}



	public void setTriGia(float triGia) {
		this.triGia = triGia;
	}



	public double tinhThue(){
        double thue;
        if(dungTich<100) thue=triGia*0.01;
        else if (dungTich >= 100 && dungTich<=200) thue = triGia * 0.03;
        else thue = triGia * 0.05;
        return thue;
    }
 
  

    @Override
	public String toString() {
    	return "Vehicle [tenChuXe=" + tenChuXe + ", loaiXe=" + loaiXe + ", dungTich=" + dungTich + ", triGia=" + triGia+ "]";
	}



	void inThue(){
        System.out.printf("%-20s %-20s %15d %15.2f %15.2f\n ",tenChuXe,loaiXe,dungTich,triGia,tinhThue());
    }
}