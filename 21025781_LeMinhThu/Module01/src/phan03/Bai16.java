package phan03;

import java.util.Scanner;

public class Bai16 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.print("Nhập vào số phần tử cho mảng của chuỗi: ");
		int n = sc.nextInt();
		String stringArr[] = new String[n];
		
		sc.nextLine();
		for(int i = 0; i < stringArr.length; i++) {
			System.out.printf("Nhập vào chuỗi thứ %d: ", i+1);
			stringArr[i] = sc.nextLine();
		}
		
		System.out.print("Nhập vào chuỗi cần xét: ");
		String tempStrinng = sc.nextLine();
		
		boolean flag = false;
		
		for(int i = 0; i < stringArr.length; i++) {
			if(stringArr[i].compareTo(tempStrinng) == 0) {
				flag = true;
			}
		}
		
		if(flag) {
			System.out.println("Chuỗi vừa nhập có trong mảng chuỗi!");
		}else {
			System.out.println("Chuỗi vừa nhập không có trong mảng chuỗi!");
		}
	}

}