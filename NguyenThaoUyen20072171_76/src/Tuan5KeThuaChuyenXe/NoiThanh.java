package Tuan5KeThuaChuyenXe;

import java.text.DecimalFormat;

public class NoiThanh extends ChuyenXe 
{
	private int soTuyen;
	private double soKm;
	public NoiThanh(String maChuyenXe, String hoTen, int soXe, double doanhThu,
			int soTuyen, double soKm) 
	{
		super(maChuyenXe, hoTen, soXe, doanhThu);
		this.soTuyen = soTuyen;
		this.soKm = soKm;
	}
	public NoiThanh() 
	{
		super();

	}
	public NoiThanh(String maChuyenXe, String hoTen, int soXe, double doanhThu) 
	{
		super(maChuyenXe, hoTen, soXe, doanhThu);
	}
	public int getSoTuyen() 
	{
		return soTuyen;
	}
	public void setSoTuyen(int soTuyen) 
	{
		this.soTuyen = soTuyen;
	}
	public double getSoKm() 
	{
		return soKm;
	}
	public void setSoKm(double soKm) 
	{
		this.soKm = soKm;
	}
	@Override
	public String toString() 
	{
		DecimalFormat kmfoFormat = new DecimalFormat("#,##0.00km");
		String kmkstrString = kmfoFormat.format(soKm);
		return super.toString() + "\n Số tuyến: " + getSoTuyen() + "\n Số km đi được: " + kmkstrString;
	}

}
