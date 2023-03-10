package bai10;

import java.util.Scanner;

public class Test {
public static SinhVien nhap() {
	Scanner sc1 =new Scanner(System.in);
	System.out.println("Nhập mã số sinh viên :");
	String ma = sc1.next();
	System.out.println("Nhập tên sinh viên : ");
	String ten = sc1.next();
	SinhVien sv4 = new SinhVien(ma, ten);
	return sv4;
}
public static void tieude() {
	System.out.printf("%8s%10s", "MSSV", "TenSV");
	System.out.println();
}
public static void main(String[] args) {
	Scanner sc = new Scanner(System.in);
	System.out.println("Nhập số lượng sinh viên : ");
	int n = sc.nextInt();
	SinhVien[] ds = new SinhVien[n];
	LopHocPhan lop = new LopHocPhan("123456", "LT Hướng đối tượng", "Cô Hà", "Thứ 7, tiết 4-6, phòng A1.1", ds);
	System.out.println("Mã LHP: "+ lop.getMaLHP());
	System.out.println("Tên LHP: "+ lop.getTenLHP());
	System.out.println("GV giảng dạy: "+ lop.getTenGV());
	System.out.println("Thông tin buổi học: "+ lop.getThongTinLH());
	SinhVien sv1 = new SinhVien("123", "Nguyễn Văn A");
	SinhVien sv2 = new SinhVien("241", "Nguyễn Văn B");
	SinhVien sv3 = new SinhVien("213", "Nguyễn Văn C");
	lop.addSV(sv1);
	lop.addSV(sv2);
	lop.addSV(sv3);
	lop.addSV(nhap());
	tieude();
	lop.inSV();
	System.out.println("Số lượng sinh viên : "+ lop.tinhsl());
	System.out.println("Nhap mã sinh viên cần tim : ");
	String a= sc.next();
	lop.timSV(a);
}
}
