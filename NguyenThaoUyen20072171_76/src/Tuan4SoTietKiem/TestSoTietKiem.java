package Tuan4SoTietKiem;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

public class TestSoTietKiem {

	public static void main(String[] args) {
		DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd/MM/yyyy");
		KhachHang kh = new KhachHang("KH01", "Nguyen Thi B", 10);
		SoTietKiem stk1 = new SoTietKiem("110",LocalDate.parse("18/09/2021", formatter), 20000000.0, 3, 0.005f);
		kh.themSoTietKiem(stk1);
		System.out.println(kh);
	}

}
