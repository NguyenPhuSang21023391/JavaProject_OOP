package bai02;

public class Test {

	public static void main(String[] args) {
		Point P = new Point(10, 20);
		System.out.println("Toa do: " + P);
		System.out.printf("Khoang cach tu Point den truc toa do la: %.2f ", P.getDistance());
		String kq = P.negate();
		System.out.println();
		System.out.println("Diem doi xung qua goc toa do la: " + kq);
	}

}
