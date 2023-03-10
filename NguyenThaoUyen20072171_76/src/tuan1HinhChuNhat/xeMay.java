package tuan1HinhChuNhat;

public class xeMay {
     private String tenChuXe;
     private String loaiXe;
     private int dungTich;
     private float triGia;
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
	public xeMay(String tenChuXe, String loaiXe, int dungTich, float triGia) {
		super();
		this.tenChuXe = tenChuXe;
		this.loaiXe = loaiXe;
		this.dungTich = dungTich;
		this.triGia = triGia;
	}
	public xeMay() {
		super();
		// TODO Auto-generated constructor stub
	}
     float tinhThue(){
    	 float thue;
    	 if (getDungTich()<=100){
    		 thue = getTriGia()*1/100;
    	 }
    		 
    	 else if(getDungTich()<=200){
    		 thue = getTriGia()*3/100;	
    	 }
    	 else{
    		 thue = getTriGia()*5/100;
    	 }
    	 return thue;
     }
     @Override
    public String toString() {
    	// TODO Auto-generated method stub
    	 String str="";
    	 str+=String.format("%-40s%-35s%20d%20.2f%20.2f", getTenChuXe(),getLoaiXe(),getDungTich(),getTriGia(),tinhThue());
    	 return str;
    	
    }
}
