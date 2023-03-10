package tuan1HinhChuNhat;

import java.util.Scanner;

public class kiemThuSVDiem {

	private static Scanner scn;
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
        sinhVienDiem sv= taoMemDoiTuongSV();
        inTieuDeCot();
		taoCung();
        System.out.println(sv);
	}
	static sinhVienDiem   taoMemDoiTuongSV()
	{
		sinhVienDiem   
		sv;
		Scanner scn= new Scanner(System.in);
		int ma;
		String HT="";
		float LT, TH;
		String s= "Nhập vào mã SV: ";
		System.out.println(s);
		ma= scn.nextInt();
		s= "Nhập vào họ tên SV: ";
		System.out.println(s);
		scn.nextLine();
		HT= scn.nextLine();   
		s= "Nhập điểm lý thuyết: ";
		LT= nhapSoThuc(s);
		s= "Nhập điểm thực hành: ";
		TH= nhapSoThuc(s);
		sv= new sinhVienDiem(ma, HT, LT, TH);
		return sv;
	}
	static float nhapSoThuc(String s )
	{
		float n;
		scn = new Scanner(System.in);
		System.out.println(s);
		n= scn.nextFloat();
		return n;

	}
	static void taoCung()
	{
		sinhVienDiem sv1 = new sinhVienDiem(20072171, " Nguyễn Thảo Uyên", 8, 7);
		sinhVienDiem sv2 = new sinhVienDiem(20073191, " Phạm Bình Phương Duy", 9, 7);
		System.out.println(sv1);
		System.out.println(sv2);
	}
	static	void inTieuDeCot()
	{
		String str="";
		str+= String.format("%15s%-35s%15s%15s%15s", "Mã Sinh Viên"," "+ "  Họ và Tên", "Điểm LT", "Điểm TH", "Điểm TB");
		System.out.println(str);
	}

}
