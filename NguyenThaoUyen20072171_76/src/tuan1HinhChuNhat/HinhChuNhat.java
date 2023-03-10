package tuan1HinhChuNhat;

public class HinhChuNhat 
{
	private int chieuDai, chieuRong;

	public int getChieuDai() {
		return chieuDai;
	}

	public void setChieuDai(int chieuDai) {
		this.chieuDai = chieuDai;
	}

	public int getChieuRong() {
		return chieuRong;
	}

	public void setChieuRong(int chieuRong) {
		this.chieuRong = chieuRong;
	}

	public HinhChuNhat(int chieuDai, int chieuRong) {
		super();
		this.chieuDai = chieuDai;
		this.chieuRong = chieuRong;
	}

	public HinhChuNhat() {
		super();
		// TODO Auto-generated constructor stub
	}
	
public int chuVi() 
{
		int dai, cv=0;
		dai=getChieuDai();
		
		cv=(dai+getChieuRong())*2;
		return cv;
}
public long dienTich()
{
	long dt;
	dt= getChieuDai()*getChieuRong();
	return dt;
}
@Override
public String toString() {
	//TODO Auto- generated method stub
	String str= "Hinh cn chieu dai"+ getChieuDai();
	str+="\n Hinh cn chieu rong"+ this.getChieuRong();
	str+="\n Co chu vi:" + chuVi();
	return str+="\n Co dien tich:" + dienTich();
}

	 
  
	
}
