package phan03;
/**
 * Viết chương trình nhập vào M và N, xuất ra các hình sau (dùng cấu trúc lặp)
 */
import java.util.Scanner;

public class Bai17 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int m,n;
		/**
		 * Phai nhap so nguyen duong n>0
		 */
		System.out.println("Nhap M:");
		m = sc.nextInt();
		System.out.println("Nhap N:");
		n = sc.nextInt();
		Hinh1(n);
		System.out.println("---------------");
		Hinh2(n);
		System.out.println("---------------");
		Hinh3(n);
		System.out.println("---------------");
		Hinh4(n);
	}

	public static void Hinh1(int m) {
		for (int i = 1; i <= m; i++) {
			for (int j = 1; j <= i; j++) {
				System.out.print("* ");
			}
			System.out.println();
		}
	}

	public static void Hinh2(int m) {
		for (int i = m; i >= 1; --i) {
			for (int j = 1; j <= i; j++) {
				System.out.print("* ");
			}
			System.out.println();
		}
	}

	public static void Hinh3(int n) {
		for (int i = 1; i <= n; i++) {
			for (int j = 1; j <= n - i; j++) {
				System.out.print("  ");
			}
			for (int k = 1; k <= 2 * i - 1; k++) {
				System.out.print("* ");
			}
			System.out.println("");
		}
	}

	public static void Hinh4(int n) {
		for (int i = 1; i <= n; i++) {
			for (int j = 1; j <= n - i; j++) {
				System.out.print("  ");
			}
			for (int k = 1; k <= 2 * i - 1; k++) {
				if (k == 1 || k == 2 * i - 1 || i == n) {
					System.out.print("* ");
				} else {
					System.out.print("  ");
				}
			}
			System.out.println("");
		}

	}
}