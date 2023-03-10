package bai12;

import java.text.NumberFormat;

public class CD {
	private int maCD, soBH;
	private String tuaCD;
	private double giaThanh;
	public int getMaCD() {
		return maCD;
	}
	public void setMaCD(int maCD) {
		if (maCD > 0)
			this.maCD = maCD;
		else 
			this.maCD = 999999;
	}
	public int getSoBH() {
		return soBH;
	}
	public void setSoBH(int soBH) throws Exception {
		if (soBH > 0)
			this.soBH = soBH;
		else 
			throw new Exception("Số bài hát không được bé hơn 0");
			}
	public String getTuaCD() {
		return tuaCD;
	}
	public void setTuaCD(String tuaCD) {
		if (!tuaCD.equals(""))
			this.tuaCD = tuaCD;
		else 
			this.tuaCD = "Chưa xác định";
	}
	public double getGiaThanh() {
		return giaThanh;
	}
	public void setGiaThanh(double giaThanh) {
		this.giaThanh = giaThanh;
	}
	public CD(int maCD, int soBH, String tuaCD, double giaThanh) {
		super();
		this.maCD = maCD;
		this.soBH = soBH;
		this.tuaCD = tuaCD;
		this.giaThanh = giaThanh;
	}
	public CD() {
		super();
		// TODO Auto-generated constructor stub
	}
	@Override
	public String toString() {
		String s = "";
		s += String.format("%20d |%20s |%20d |%20.2f |", getMaCD(), getTuaCD(), getSoBH(),getGiaThanh());
		return s;
	}
	

}
