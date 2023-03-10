package tuan4;

public class KiemThuHinhTron {

	public static void main(String[] args) {
		nhapCung();
	}
	
	static void nhapCung() {
		ToaDo diem1= new ToaDo("A", 5, 5);
		
		HinhTron ht1= new HinhTron(1.5,diem1);
		System.out.println(ht1);
	
	}

}
