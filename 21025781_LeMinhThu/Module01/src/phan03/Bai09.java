package phan03;

/**
 * Viết hàm tách chuỗi gốc thành chuỗi con. 
 */
import java.util.Scanner;

public class Bai09 {

	public static void main(String[] args) {
		String s;
		Scanner sc = new Scanner(System.in);
		System.out.println("Nhập vào chuỗi bất kỳ: ");
		s = sc.nextLine();
		String words[]=tachChuoi(s);
		for(String word : words) {
			System.out.println(word);
		}
	}

	public static String[] tachChuoi(String n) {
		String[] kq;
		n=n.trim();
		while(n.contains("  ")) {
			n=n.replace("  "," ");
		}
		kq=n.split(" ");
		return kq;
}
}
