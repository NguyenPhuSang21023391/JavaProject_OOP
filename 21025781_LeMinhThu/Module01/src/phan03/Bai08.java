package phan03;

import java.util.Scanner;

/**
 * Viet chuong trinh in ra so lan ki tu 'a' xuat hien trong chuoi
 * 
 * @author
 *
 */
public class Bai08 {

	public static void main(String[] args) {
		System.out.println("Nhap chuoi: ");
		Scanner nhap = new Scanner(System.in);
		String str = nhap.nextLine();
		System.out.println("Chuỗi là: " + str);
		DemKyTu(str);
	}

	public static void DemKyTu(String str) {
		int dem = 0;
		for (int i = 0; i < str.length(); i++) {
			if (str.charAt(i) == 'a') {
				dem++;
			}
		}
		System.out.printf("Chuoi \"%s\" có %d ky tu 'a'.", str, dem);
	}
}
