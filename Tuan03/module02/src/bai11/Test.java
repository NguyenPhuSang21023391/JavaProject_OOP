package bai11;

import java.time.LocalDate;

public class Test {

	public static void main(String[] args) 
	{
		SoTietKiem dsSoTietKiem[]=new SoTietKiem[100];
		dsSoTietKiem[0]= new SoTietKiem("111",LocalDate.of(2020,5,1),1000000,3,(float) 0.005);
		dsSoTietKiem[1]= new SoTietKiem("112",LocalDate.of(2019,12,10),1000000,6,(float) 0.006);
		KhachHang kh=new KhachHang("KH001", "Nguyen Van An",0);
		System.out.print(kh.toString());
		for(int i=0;i<dsSoTietKiem.length;i++)
		{
			System.out.print(dsSoTietKiem[i].toString());
		}
	}

}