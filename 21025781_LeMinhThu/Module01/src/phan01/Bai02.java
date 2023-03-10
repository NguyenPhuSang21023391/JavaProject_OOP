package phan01;
/**
 * Viet chuong trinh nhap ten va xuat ra man hinh hello+ten
 */
import java.util.Scanner;

public class Bai02 {

	public static void main(String[] args) {
		System.out.println("Moi ban nhap ten: ");
		Scanner nhap = new Scanner(System.in);
		String a = nhap.nextLine();
		System.out.println("Hello " + a);
	}

}
