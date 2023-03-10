package phan03;
/**
 * Kiem tra so nguyen to
 * 
 */
import java.util.Scanner;

public class Bai06 {

	public static void main(String[] args) {
		System.out.println("Nhap so: ");
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		KTSNT(n);

	}
	public static void KTSNT(int n) 
	{
		boolean flag = false;
		for(int i =2; i<=n/2;++i) {
			if(n%i==0) {
				flag = true;
				break;
			}
		}
		if(!flag)
			System.out.println(n+ " la so nguyen to");
		else 
			System.out .println(n + " khong phai la so nguyen to");
	}
}
