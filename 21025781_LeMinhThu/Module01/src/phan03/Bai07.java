package phan03;
/**
 * Tinh tong cac so nguyen to nho hon n
 */

import java.util.Scanner;

public class Bai07 {

	private static boolean flag;
	public static void main(String[] args) {
		System.out.println("Nhap so: ");
		Scanner sc = new Scanner(System.in);
			int n = sc.nextInt();
			KTSNT(n);
			System.out.println("Tong can tim la: " + TinhTong(n));
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
	
	public static int TinhTong(int n)
	{
		int sum = 0;
		if(flag = true) {
			for(int i=0;i<n;i++)
				sum+=i;
		}
		return sum;
	}
	}