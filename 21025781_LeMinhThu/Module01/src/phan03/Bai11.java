package phan03;

import java.util.Scanner;

/**
 * Viet chuong trinh nhap vao n so nguyen va thuc hien xuat
 *  ra man hinh n so dau tien cua chuoi fibonaci
 * @author admin
 *
 */
public class Bai11 {

	public static void main(String[] args) {
		System.out.println("Nhap n: ");
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		System.out.println("Day fibonaci can tim: ");
		for(int i = 0;i<n;i++) {
			System.out.println(Fibonaci(i)+" ");
		}
	}
	public static int Fibonaci(int n) {
		if(n<0) {
			return -1;
		}else if(n==0 || n==1) {
			return n;
		}else {
			return Fibonaci(n-1) + Fibonaci(n-2);
		}
	}
}
