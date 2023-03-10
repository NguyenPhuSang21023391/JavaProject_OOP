package tuan3CD;



public class CD implements Comparable<CD>  {

	private int maCD, soBH;
	private String tuaCD; 
	private double giaThanh;
	
	public CD(int maCD, int soBH, String tuaCD, double giaThanh) {
		super();
		this.maCD = maCD;
		this.soBH = soBH;
		this.tuaCD = tuaCD;
		this.giaThanh = giaThanh;
	}
	
	public CD() {
		super();

	}
	
	public int getMaCD() {
		return maCD;
	}
	public void setMaCD(int maCD) {
		if ( maCD>0)
		this.maCD = maCD;
		else{
			this.maCD= 999999;
		}
	}
	public int getSoBH() {
		return soBH;
	}
	public void setSoBH(int soBH) throws Exception {
		if(soBH>0)
		this.soBH = soBH;
		else{
			throw new Exception(" Số bài hát không được <0 ");
		}
			
	}
	public String getTuaCD() {
		return tuaCD;
	}
	public void setTuaCD(String tuaCD) {
		if(!tuaCD.equals(""))
		this.tuaCD = tuaCD;
		else{
			this.tuaCD=" chưa xác định";
		}
	}
	public double getGiaThanh() {
		return giaThanh;
	}
	public void setGiaThanh(double giaThanh) {
		this.giaThanh = giaThanh;
	}

	@Override
	public int compareTo(CD arg0) {
		// TODO Auto-generated method stub
		return 0;
	}
	
	

}

