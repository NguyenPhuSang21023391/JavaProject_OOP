package bai09;

public class Test {
	public static void main(String[] args) {
		ToaDo td1 = new ToaDo("P", 5, 5);
		HinhTron ht1 = new HinhTron(td1, (float) 10.5);

		System.out.println(ht1.toString());
	}
}
