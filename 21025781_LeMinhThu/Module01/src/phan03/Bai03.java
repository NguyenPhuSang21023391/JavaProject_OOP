package phan03;
/**
 * 
 */
import java.util.Scanner;
/**
 * Viet chuong trinh i ra tong 1+3+5+..+n neu n le, 2+4+6+...+n neu n chan
 * @author admin
 *
 */
public class Bai03 {

	public static void main(String[] args) {
		System.out.println("Moi nhap n: ");
		Scanner nhap = new Scanner(System.in);
			int n = nhap.nextInt();
			TinhTong(n);
		}

	public static int TinhTong(int n) {
		int sum = 0;
		if (n % 2 != 0) {
			for (int i = 0; i <= n; i++) {
				if (i % 2 == 1) {
					sum += i;
				}
			}
			System.out.println("Tong can tim: " + sum);
		} else {
			for (int i = 0; i <= n; i += 2)
				sum += i;
			System.out.println("Tong cam tim: " + sum);
		}
		return sum;
	}
}
