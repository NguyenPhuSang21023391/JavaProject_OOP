package bai03;

import java.text.DecimalFormat;

public class Test {

	public static void main(String[] args) {
		Cylinder c = new Cylinder(4, 8);
		DecimalFormat d = new DecimalFormat("0.##");
		System.out.println("Dien tich xung quanh la: " + d.format(c.tinhDienTichXungQuanh()));
		System.out.println("Dien tich toan phan la: " + d.format(c.tinhDienTichToanPhan()));
		System.out.println("The tich la: " + d.format(c.tinhTheTich()));
	}

}
