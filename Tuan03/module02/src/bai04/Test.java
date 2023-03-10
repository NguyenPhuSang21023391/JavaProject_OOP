package bai04;

import java.util.Scanner;

/**
 * Kiểm thử cho lớp DiemSinhVien
 *
 */
public class Test {
	public static void main(String[] args) {
//Tạo đối tượng sv1 bằng constructor đầy đủ tham số:
		DiemSinhVien sv1 = new DiemSinhVien(11111, "Nguyễn Thanh An", 6.5f, 8.5f);
//Tạo đối tượng sv2 bằng default constructor:
		DiemSinhVien sv2 = new DiemSinhVien();
		sv2.setMaSV(22222);
		sv2.setHoTen("Lê Thị Bông");
		sv2.setDiemLT(7.5f);
		sv2.setDiemTH(8.0f);
//Tạo đối tượng sv3:
		DiemSinhVien sv3 = new DiemSinhVien();
//Nhập dữ liệu của sinh viên sv từ bàn phím
		Scanner sc = new Scanner(System.in);
		System.out.println("Nhập mã số của sinh viên sv3: ");
		int masv = sc.nextInt();
		System.out.println("Nhập họ và tên của sinh viên sv3: ");
		sc = new Scanner(System.in);
		String hoten = sc.nextLine();
		System.out.println("Nhập điểm lý thuyết của sinh viên sv3: ");
		sc = new Scanner(System.in);
		float diemlt = sc.nextFloat();
		System.out.println("Nhập điểm thực hành của sinh viên sv3: ");
		sc = new Scanner(System.in);
		float diemth = sc.nextFloat();
//Gán giá trị cho sv3:
		sv3 = new DiemSinhVien(masv, hoten, diemlt, diemth);
//HOẶC Gọi các phương thức để gán giá trị cho sv3:
//sv3.setMaSV(masv);
//sv3.setHoTen(hoten);
//sv3.setDiemLT(diemlt);
//sv3.setDiemTH(diemth);
//In thông tin của 3 đối tượng sv1, sv2, sv3 ra cửa sổ console
		System.out.println(sv1);
		System.out.println(sv2);
		System.out.println(sv3);
		sc.close();
	}
}
