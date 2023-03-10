package phan03;
/**
 * Viết chương trình cho nhập vào 1 mảng 
 * và kiểm tra xem có giá trị k nào đó hay không
 */
import java.util.Scanner;
public class Bai14 {
	public static int kiemTra(int A[], int n, int k) {
		for (int i = 0; i < n; i++)
			if (A[i] == k)
				return A[i];
		return -1;
	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Nhap so phan tu cua mang: ");
		int n = sc.nextInt();
		int A[] = new int[n];
		System.out.println("Nhap phan tu cua mang: ");
		for (int i = 0; i < n; i++) {
			System.out.printf("A[%d] = ", i);
			A[i] = sc.nextInt();
		}
		System.out.println("Nhap k: ");
		int k = sc.nextInt();
		int kt = kiemTra(A, n, k);
		if (kt == -1)
			System.out.println("Khong xuat hien k trong mang");
		else
			System.out.printf("%d xuat hien trong mang", k);
		
	}
}
