package phan03;

import java.util.Scanner;

/**
 * Viết chương trình để đếm số lượng ký tự là số có trong chuỗi s. Chuỗi s được nhập từ bàn phím.
 * 
 */
public class Bai10 {
	
	public static void main(String[] args) {

		Scanner Sc = new Scanner(System.in);
		System.out.println("Nhap 1 chuoi: ");
		String S = (String) Sc.nextLine();
		int dem = demKyTuSo(S);
		System.out.println("So ky tu so xuat hien trong chuoi: " + dem);
	}
	public static int demKyTuSo(String s) {
		int kq = 0;

		for (int i = 0; i < s.length(); i++)
			if (s.charAt(i) >= '1' && s.charAt(i) <= '9')
				kq++;
		return kq;
	}
}
