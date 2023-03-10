package phan03;
/**
 * Chuong trinh giai phuong trinh bac 1
 */
import java.util.Scanner;

public class Bai04 {

	public static void main(String[] args) {
		try (Scanner nhap = new Scanner(System.in)) {
			System.out.println("nhap a: ");
			int a = nhap.nextInt();
			System.out.println("nhap b: ");
			int b = nhap.nextInt();
			GiaiPtBac1(a,b);
		}
		
	}
	public static void GiaiPtBac1(int a, int b) {
		if(a==0)
		{
			if(b==0)
				System.out.println("Phuong trinh vo so nghiem");
			else
				System.out.println("Phuong trinh vo nghiem");
		}
		else
			System.out.println("Phuong trinh co nghiem x = "+ (-b/a));
	}
	

}
