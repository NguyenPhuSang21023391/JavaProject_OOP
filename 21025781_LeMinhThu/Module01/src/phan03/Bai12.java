package phan03;
/**
 * Viet chuong trinh in ra nhung so le tu 1 den 99
 * @author admin
 *
 */

public class Bai12 {

	public static void main(String[] args) {
		int n = 99;
		InLe(n);
	}
	
	public static void InLe(int n) {
		for(int i=0;i<n;i++) {
			if(i%2==1) {
				System.out.println(i);
			}
		}
	}
}
