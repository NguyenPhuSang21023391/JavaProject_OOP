package bai11;

public class KhachHang 
{
	private String MaKH;
	private String HoTenKH;
	private SoTietKiem[] dsSoTietKiem1;
	private int SoLuongHienCo;
	
	
	public String getMaKH()
	{
		return MaKH;
	}
	public String getHoTenKH() 
	{
		return hoTenKH;
	}
	public SoTietKiem[] getDsSoTietKiem()
	{
		return dsSoTietKiem1;
	}	
	public int getSoLuongHienCo()
	{
		return soLuongHienCo;
	}
	public void setHoTenKH(String hoTenKH)
	{
		if(hoTenKH.trim().equals(""))
			System.out.println("Họ tên không được rỗng");
		else
			this.hoTenKH=hoTenKH;
	}
	private String maKH,hoTenKH;
	private SoTietKiem dsSoTietKiem[]=new SoTietKiem[100];
	private int soLuongHienCo;
	public KhachHang(String maKH,String hoTenKH,int soLuongHienCo)
	{
		setHoTenKH(hoTenKH);
	}
	public String toString()
	{
		return String.format("Khách hàng: %s - %s\n",MaKH,hoTenKH);
	}
}