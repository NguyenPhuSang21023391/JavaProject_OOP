package phan03;

import java.util.Scanner;

public class Bai05 {
	/**
	 * Tim USCLN
	 * @param args
	 */

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Nhap so a: ");
		int a = sc.nextInt();
		System.out.println("Nhap so b: ");
		int b = sc.nextInt();
		System.out.println("USCLN cua "+a + " va " + b +" la: " + USCLN(a,b));
	}
	public static int USCLN (int a,int b)
	{
		if(b==0) return a;
		return USCLN(b,a%b);
		
	}
}
