package phan03;
/**
 * Tim GTLN & GTNN cua mang
 */
import java.util.Scanner;

public class Bai15 {

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
		System.out.println("GTLN cua mang la: " + GTLN(A, n));
		System.out.println("GTNN cua mang la: " + GTNN(A, n));

	}

	public static int GTLN(int A[], int n) {
		int max = A[0];
		for (int i = 0; i < n; i++) {
			if (A[i] > max)
				max = A[i];
		}
		return max;
	}

	public static int GTNN(int A[], int n) {
		int min = A[0];
		for (int i = 0; i < n; i++) {
			if (A[i] < min)
				min = A[i];
		}
		return min;
	}
}
