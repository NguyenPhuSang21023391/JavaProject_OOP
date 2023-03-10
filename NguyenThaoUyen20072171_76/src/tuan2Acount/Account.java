package tuan2Acount;

import java.text.NumberFormat;
import java.util.Locale;

public class Account {
     private long soTK;
     private String tenTK;
     private double moneyTK;
	public long napTien;
     static final double LAISUAT= 0.035;
     static final double PHIRUT= 1000;
	public long getSoTK() {
		return soTK;
	}
	public void setSoTK(long soTK) {
		this.soTK = soTK;
	}
	public String getTenTK() {
		return tenTK;
	}
	public void setTenTK(String tenTK) {
		this.tenTK = tenTK;
	}
	public double getMoneyTK() {
		return moneyTK;
	}
	public void setMoneyTK(double moneyTK) {
		this.moneyTK = moneyTK;
	}
	public Account(long soTK, String tenTK, double moneyTK) {
		super();
		this.soTK = soTK;
		this.tenTK = tenTK;
		this.moneyTK = moneyTK;
	}
	public Account()
	{
		
	}
	public boolean napTien(long tienDuocNap )
	{
		if(tienDuocNap>0)
		{
		
			this.moneyTK+=tienDuocNap;
		    return true;
		}
		
		else
	   return false;
	}
	public boolean rutTien(long tienDuocRut )
	{
		
			if(this.moneyTK- tienDuocRut-PHIRUT>=50000){
			this.moneyTK-=tienDuocRut-PHIRUT;
		return true;
			}
		else
		return false;
	}
	public boolean chuyenTien(Account nhan, long soTienChuyen)
	{
		if(soTienChuyen>0)
	  {		
		if(this.moneyTK-soTienChuyen-50000-1000>0)
		{
			this.rutTien(soTienChuyen);
			nhan.napTien(soTienChuyen);
			return true;
		}
	  }
	
	return false;
	}
	
	void addInterest()
	{
      this.moneyTK+=getMoneyTK()*LAISUAT;
      
	}
	
     @Override
    public String toString() {
    	// TODO Auto-generated method stub
    	 Locale localeVN = new Locale("vi", "VN");
    	 NumberFormat numberFormat = NumberFormat.getCurrencyInstance(localeVN);
		 String str = numberFormat.format(getMoneyTK()); 
		 String strGiaTri=String.format("%15d%-35s%15s" , getSoTK()," "+ getTenTK(), getMoneyTK(),str);
		 return strGiaTri;
		 
    	 
    }
	public long getAccountNumber() {
		// TODO Auto-generated method stub
		return 0;
	}
	public double getBalance() {
		// TODO Auto-generated method stub
		return 0;
	}
}
