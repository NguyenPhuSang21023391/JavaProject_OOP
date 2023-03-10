package Tuan5KeThuaChuyenXe;

public class NgoaiThanh extends ChuyenXe 
{
	private String noiDen;
	private int soNgayDiDuoc;
	public String getNoiDen() 
	{
		return noiDen;
	}
	public void setNoiDen(String noiDen) 
	{
		this.noiDen = noiDen;
	}
	public int getSoNgayDiDuoc() 
	{
		return soNgayDiDuoc;
	}
	public void setSoNgayDiDuoc(int soNgayDiDuoc) 
	{
		this.soNgayDiDuoc = soNgayDiDuoc;
	}
	public NgoaiThanh(String maChuyenXe, String hoTen, int soXe,
			double doanhThu, String noiDen, int soNgayDiDuoc) 
	{
		super(maChuyenXe, hoTen, soXe, doanhThu);
		this.noiDen = noiDen;
		this.soNgayDiDuoc = soNgayDiDuoc;
	}
	public NgoaiThanh() 
	{
		super();
		
	}
	
	@Override
	public String toString() 
	{
		
		return super.toString() + "\n Nơi đến: " + getNoiDen() + "\n Ngày đi được: " + getSoNgayDiDuoc();
	}

}
