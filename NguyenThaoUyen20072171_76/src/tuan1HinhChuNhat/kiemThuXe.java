package tuan1HinhChuNhat;

import java.util.Scanner;

public class kiemThuXe {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		xeMay xe1= taoMemDoiTuong();
		xeMay xe2= taoMemDoiTuong();
		xeMay xe3= taoMemDoiTuong();
		inTieuDeCot();
		System.out.println(xe1);
		System.out.println(xe2);
		System.out.println(xe3);
	}
	static void inTieuDeCot(){
		   String str="";
		   str+=String.format("%-40s%-35s%20s%20s%20s","Tên chủ xe","Loại xe","Dung tích","Trị giá","Thuế phải nộp");
		   System.out.println(str);
	}
    static xeMay taoMemDoiTuong(){
    	xeMay xe;
    	Scanner scn= new Scanner(System.in);
    	String ten="";
    	String loaiXe="";
    	int cc=0;
    	float gia= 0;
    	String s=" Nhập họ tên chủ xe: ";
    	System.out.println(s);
    	ten= scn.nextLine();
    	s= "Nhập loại xe: ";
    	System.out.println(s);
    	loaiXe= scn.nextLine();
    	s= "Nhập dung tích xe: ";
    	System.out.println(s);
    	cc= scn.nextInt();
    	s= "Nhập trị giá xe: ";
    	gia=nhapSo(s);
    	xe = new xeMay(ten,loaiXe,cc,gia);
    	return xe;
     }
    static float nhapSo(String s){
    	float n;
    	Scanner scn = new Scanner(System.in);
    	System.out.println(s);
    	n=scn.nextFloat();
    	return n;
    }
}
