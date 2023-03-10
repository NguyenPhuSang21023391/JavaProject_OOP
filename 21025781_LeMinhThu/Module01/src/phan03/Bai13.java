package phan03;
/**
 * Tong 10 so chan dau tien
 * @author admin
 *
 */
public class Bai13 {

	public static void main(String[] args) {
		int n = 20;
		System.out.println("Tong can tim: ");
			System.out.println("Tong 10 so chan dau tien la: " + TinhTong(n));
	}

	public static int TinhTong(int n) {
		int sum = 0;
		for (int i = 0; i <= n; i++) {
			if (i % 2 == 0) {
				sum += i;
			}
		}
		return sum;
	}
}