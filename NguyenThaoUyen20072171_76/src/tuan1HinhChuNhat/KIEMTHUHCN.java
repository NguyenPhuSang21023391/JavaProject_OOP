package tuan1HinhChuNhat;

import java.util.Scanner;


public class KIEMTHUHCN {
	private static Scanner scn;
	public static void main(String[] args)
	{
		int rong;
		System.out.println("Day la chuong trinh tinh chu vi, dien tich hcn");
		HinhChuNhat cn1= new HinhChuNhat(10,5);
		System.out.println("chu vi hcn x la: "+ cn1.chuVi());
		System.out.println("dien tich hcn x la: "+ cn1.dienTich());
		HinhChuNhat cn2= new HinhChuNhat();
		cn2.setChieuDai(10);
		rong=nhapSoNguyen();
		cn2.setChieuRong(rong);
		System.out.println("chu vi hcn x la: "+ cn2.chuVi());
		System.out.println("dien tich hcn x la: "+ cn2.dienTich());
	}
	static int nhapSoNguyen()
	{
		int rong=0;
		System.out.println("Nhap vao chieu rong");
		scn = new Scanner(System.in);
		rong= scn.nextInt();
		return rong;
	}
}

