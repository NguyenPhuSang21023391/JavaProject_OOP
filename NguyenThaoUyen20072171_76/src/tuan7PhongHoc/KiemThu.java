
package tuan7PhongHoc;

import java.text.DecimalFormat;
import java.util.Scanner;

import PhongHoc1.DanhSachPhongHoc;
import PhongHoc1.PhongHoc;
import PhongHoc1.PhongLyThuyet;
import PhongHoc1.PhongThiNghiem;
import PhongHoc1.PhongThucHanh;


public class KiemThu {
	
	static DanhSachPhongHoc ds = new DanhSachPhongHoc();
	static PhongHoc phong;


	public static void main(String[] args) {
		System.out.println(" ");
		int chon = -1;
		do{
			menu();
			System.out.println("\n Nhập lựa chọn: ");
			chon = new Scanner(System.in).nextInt();
			switch (chon) {
			case 1:
				nhapCung();
				break;
			case 2:
				themMem();
				break;
			case 3:
				suaPhong();
				break;
			case 4:
				xoa();
				break;
			case 5:
				tieuDe();
				xuat();
				break;
			case 6: 
				sortTheoDienTich();
				break;
			case 7:
				sortTheoDayNha();
				break;
			case 8:
				sortTheoSoBongDen();
				break;
			case 9: 
				xuatDSPhongDatChuan();
				break;
			case 10:
				xuatDSPhongMayTinh60May();
				break;
			case 11:
				System.out.println("Tổng số phòng là: " +ds.getTongSoPhongHoc());
				break;
			
			}
		}while(chon < 13);
	}

	static void nhapCung(){
		PhongHoc p1 = new PhongLyThuyet("11.05", "X", 130, 13, true);
		PhongHoc p2 = new PhongLyThuyet("12.05", "X", 120, 9, false);
		PhongHoc p3 = new PhongThucHanh("1.06", "B", 120, 10, 60);
		PhongHoc p4 = new PhongThucHanh("B1.05", "B", 100, 10, 60);
		PhongHoc p5 = new PhongThiNghiem("10.02", "T", 150, 15, "Sinh", 50, true);
		PhongHoc p6 = new PhongThiNghiem("10.05", "T", 120, 10, "Hóa", 40, false);

		ds.them(p1);
		ds.them(p2);
		ds.them(p3);
		ds.them(p4);
		ds.them(p5);
		ds.them(p6);

	}

	static void xuatPhongDatChuan(){
		for(PhongHoc p : ds.getDSPhongDatChuan()){
			System.out.println(p);
		}
	}

	static void tieuDe(){
		String s = " ";
		s+= String.format("%-10s|%-10s|%-15s|%-10s|%-10s", " Mã phòng ", " Dãy nhà ", " Diện tích ",
				" Số bóng đèn ", " Đạt chuẩn ");
		System.out.println(s);
	}

	static void tieuDePhongLT(){
		String s = " ";
		s+= String.format("%-10s|%-10s|%-15s|%-10s|%-10s|%-10s", " Mã phòng ", " Dãy nhà ",
				" Diện tích ", "Số bóng đèn ", "Đạt chuẩn ", "Máy chiếu ");
		System.out.println(s);
	}

	static void tieuDePhongTH(){
		String s = " ";
		s+= String.format("%-10s|%-10s|%-15s|%-10s|%-10s|%-10s", " Mã phòng ", " Dãy nhà ", 
				" Diện tích ", " Số bóng đèn ", " Đạt chuẩn ", " Số máy tính");
		System.out.println(s);
	}

	static void tieuDePhongTN(){
		String s = " ";
		s+= String.format("%-10s|%-10s|%-15s|%-10s|%-10s|%-10s|%-10s|%-10s", " Mã phòng ", " Dãy nhà ", 
				" Diện tích ", " Số bóng đèn ", " Đạt chuẩn ", " Chuyên ngành ", " Sức chứa ", " Bồn rửa ");
		System.out.println(s);
	}

	static void menu(){
		System.out.println("\t***************************************");
		System.out.println("\t** Chương trình quản lý phòng học    **");
		System.out.println("\t* 1. Nhập cứng                         *");
		System.out.println("\t* 2. Thêm phòng                        *");
		System.out.println("\t* 3. Sửa phòng                         *");
		System.out.println("\t* 4. Xóa phòng                         *");
		System.out.println("\t* 5. Xuất                              *");
		System.out.println("\t* 6. Sắp xếp theo diện tích            *");
		System.out.println("\t* 7. Sắp xếp theo dãy nhà              *");
		System.out.println("\t* 8. Sắp xếp theo số bóng đèn          *");
		System.out.println("\t* 9. Xuất DS phòng đạt chuẩn           *");
		System.out.println("\t* 10. Xuất DS phòng máy tính có 60 máy *");
		System.out.println("\t* 11. Xuất tổng số phòng học           *");
		System.out.println("\t* 12. Thoát                            *");
		System.out.println("\t***************************************");
	}

	static void menuSuaPhongLT(){
		System.out.println("\t***************************************");
		System.out.println("\t** Mời nhập thông tin cần sửa        **");
		System.out.println("\t* 1. Mã phòng                         *");
		System.out.println("\t* 2. Dãy nhà                          *");
		System.out.println("\t* 3. Diện tích                        *");
		System.out.println("\t* 4. Số bóng đèn                      *");
		System.out.println("\t* 5. Máy chiếu                        *");
		System.out.println("\t* 6. Về menu chính                    *");
		System.out.println("\t***************************************");
	}

	static void menuSuaPhongTH(){
		System.out.println("\t***************************************");
		System.out.println("\t** Mời nhập thông tin cần sửa        **");
		System.out.println("\t* 1. Mã phòng                         *");
		System.out.println("\t* 2. Dãy nhà                          *");
		System.out.println("\t* 3. Diện tích                        *");
		System.out.println("\t* 4. Số bóng đèn                      *");
		System.out.println("\t* 5. Số máy tính                      *");
		System.out.println("\t* 6. Về menu chính                    *");
		System.out.println("\t***************************************");
	}

	static void menuSuaPhongTN(){
		System.out.println("\t***************************************");
		System.out.println("\t** Mời nhập thông tin cần sửa        **");
		System.out.println("\t* 1. Mã phòng                         *");
		System.out.println("\t* 2. Dãy nhà                          *");
		System.out.println("\t* 3. Diện tích                        *");
		System.out.println("\t* 4. Số bóng đèn                      *");
		System.out.println("\t* 5. Chuyên ngành                     *");
		System.out.println("\t* 6. Sức chứa                         *");
		System.out.println("\t* 7. Bồn rửa                     *");
		System.out.println("\t* 8. Về menu chính                    *");
		System.out.println("\t***************************************");
	}

	static void xuat(){
		for(PhongHoc p : ds.getDSPhong()){
			System.out.println(p);
		}
	}

	static PhongHoc themMotPhong(){
		try{
			String dayNha, maP;
			double dt;
			int soDen;

			System.out.println("\n Nhập mã phòng: ");
			maP = new Scanner(System.in).nextLine();
			int vt = ds.timKiemViTri(maP);
			if( vt != -1){
				System.out.println(" Trùng mã phòng ");
				return null;
			}else{
				System.out.println("\n Nhập dãy nhà: ");
				dayNha = new Scanner(System.in).nextLine();
				System.out.println("\n Nhập diện tích: ");
				dt = new Scanner(System.in).nextDouble();
				System.out.println("\n Nhập số bóng đèn: ");
				soDen = new Scanner(System.in).nextInt();

				System.out.println("\n Nhập phòng lý thuyết (1), phòng máy tính (2) hoặc khác là phòng thí nghiệm: ");
				int chon = new Scanner(System.in).nextInt();
				if(chon == 1){
					String mayChieu;
					System.out.println(" Nhập [Y] nếu có máy chiếu hoặc [N] nếu không có ");
					mayChieu = new Scanner(System.in).next();
					while( !mayChieu.equalsIgnoreCase("Y || y") && !mayChieu.equalsIgnoreCase("N || n") ){
						System.out.println("\n Vui lòng nhập theo yêu cầu!");
						mayChieu = new Scanner(System.in).nextLine();
					}
					boolean mayChieuBool;
					if(mayChieu != "Y"){
						mayChieuBool = true;
					}else{
						mayChieuBool = false;
					}
					phong = new PhongLyThuyet(maP, dayNha, dt, soDen, mayChieuBool);
				} else if( chon == 2){
					int phongMT;
					System.out.println("\n Nhập số lượng máy tính: ");
					phongMT = new Scanner(System.in).nextInt();
					phong = new PhongThucHanh(maP, dayNha, dt, soDen, phongMT);
				} else{
					String chuyenNganh, bonRua;
					int sucChua;
					System.out.println("\n Nhập chuyên ngành: ");
					chuyenNganh = new Scanner(System.in).nextLine();
					System.out.println("\n Nhập sức chứa: ");
					sucChua = new Scanner(System.in).nextInt();
					System.out.println("\n Nhập [Y] nếu có bồn rửa [N] là không có: ");
					bonRua = new Scanner(System.in).next();
					while( !bonRua.equalsIgnoreCase("Y||y")&& !bonRua.equalsIgnoreCase("N||n")){
						System.out.println("\n Vui lòng nhập theo yêu cầu!");
						bonRua = new Scanner(System.in).nextLine();
					}
					boolean bonRuaBool;
					if( bonRua != "Y"){
						bonRuaBool = true;
					}else{
						bonRuaBool = false;
					}
					phong = new PhongThiNghiem(maP, dayNha, dt, soDen, chuyenNganh, sucChua, bonRuaBool);
				}
			}
		}catch(Exception e){
			System.out.println(e.getMessage());
		}
		return phong;
	}

	static void themMem(){
		PhongHoc p = themMotPhong();
		if(p != null){
			ds.them(p);
			System.out.println("\n Thêm thành công");
		}else{
			System.out.println("\n Thêm không thành công");	
		}	
	}

	static void xoa(){
		System.out.println("\n Nhập mã phòng cần xóa: ");
		String maP = new Scanner(System.in).nextLine();
		PhongHoc phongXoa = ds.timKiem(maP);
		if( phongXoa != null){
			System.out.println(" Bạn có chắc chắn muốn xóa không? [y/n]");
			String acp = new Scanner(System.in).nextLine();
			if(acp.equalsIgnoreCase("Y")){
				ds.xoa(phongXoa);
				System.out.println("\n Xóa thành công");
			}else{
				System.out.println("\n Xóa không thành công");
			}

		}else{
			System.out.println("\n Trùng mã");
		}
	}

	static void suaPhong(){
		int chon = 0, cnt = 0;
		boolean check = false;
		System.out.println("\n Nhập mã phòng cần sửa: ");
		String maP = new Scanner(System.in).nextLine();
		PhongHoc phongP = ds.timKiem(maP);
		if(phongP != null){
			System.out.println("\n Thông tin phòng trước khi sửa: " +phongP);
			if( phongP instanceof PhongLyThuyet){
				PhongLyThuyet phongSua = (PhongLyThuyet) phongP;
				do{
					menuSuaPhongLT();
					System.out.println("\n Nhập lựa chọn: ");
					chon = new Scanner(System.in).nextInt();
					cnt++;
					thucHienMenuSua(chon, phongSua);
					if( chon == 5){
						System.out.println(" Nhập [Y] nếu có máy chiếu hoặc [N] nếu không có ");
						String mayChieu = new Scanner(System.in).next();
						while( !mayChieu.equalsIgnoreCase("Y || y") && !mayChieu.equalsIgnoreCase("N || n") ){
							System.out.println("\n Vui lòng nhập theo yêu cầu!");
							mayChieu = new Scanner(System.in).nextLine();
						}
						boolean mayChieuBool = (mayChieu != "Y") ? true : false;
						phongSua.setMayChieu(mayChieuBool);
					}
					if( chon == 6){
						if(cnt > 1)
							ds.sua(phongSua);
						System.out.println("\n Trở về menu chính! ");
					}

				}while(chon < 6);

			}else if(phongP instanceof PhongThucHanh){
				PhongThucHanh phongSua = (PhongThucHanh) phongP;
				do{
					menuSuaPhongTH();
					System.out.println("\n Nhập lựa chọn: ");
					chon = new Scanner(System.in).nextInt();
					cnt++;
					thucHienMenuSua(chon, phongSua);
					if( chon == 5){
						System.out.println("\n Nhập số lượng máy tính: ");
						phongSua.setSoMayTinh(new Scanner(System.in).nextInt());
					}
					if ( chon == 6){
						if(cnt > 1)
							ds.sua(phongSua);
						System.out.println("\n Trở về menu chính! ");
					}
				}while(chon < 6);

			}else if(phongP instanceof PhongThiNghiem){
				PhongThiNghiem phongSua = (PhongThiNghiem) phongP;
				do{
					menuSuaPhongTN();
					System.out.println("\n Nhập lựa chọn: ");
					chon = new Scanner(System.in).nextInt();
					cnt++;
					thucHienMenuSua(chon, phongSua);
					if( chon == 5){
						System.out.println("\n Nhập chuyên ngành: ");
						phongSua.setChuyenNganh(new Scanner(System.in).nextLine());
					}
					if( chon == 6){
						System.out.println("\n Nhập sức chứa: ");
						phongSua.setSucChua(new Scanner(System.in).nextInt());
					}
					if( chon == 7){
						System.out.println(" Nhập [Y] nếu có bồn rửa hoặc [N] nếu không có ");
						String bonRua = new Scanner(System.in).next();
						while( !bonRua.equalsIgnoreCase("Y || y") && !bonRua.equalsIgnoreCase("N || n") ){
							System.out.println("\n Vui lòng nhập theo yêu cầu!");
							bonRua = new Scanner(System.in).nextLine();
						}
						boolean bonRuaBool = (bonRua != "Y") ? true : false;
						phongSua.setBonRua(bonRuaBool);;
					}
					if ( chon == 8){
						if(cnt > 1)
							ds.sua(phongSua);
						System.out.println("\n Trở về menu chính! ");
					}

				}while(chon < 9);
			}else{
				System.out.println("\n Không tồn tại mã phòng này! ");
			}
		}
	}
	
	static void thucHienMenuSua(int chon, PhongHoc phongSua){
		switch (chon) {
		case 1:
			System.out.println("\n Nhập mã phòng: ");
			phongSua.setMaPhong(new Scanner(System.in).nextLine());
			break;
		case 2:
			System.out.println("\n Nhập dãy nhà: ");
			phongSua.setDayNha(new Scanner(System.in).nextLine());
			break;
		case 3:
			System.out.println("\n Nhập diện tích: ");
			phongSua.setDienTich(new Scanner(System.in).nextDouble());
			break;
		case 4:
			System.out.println("\n Nhập số bóng đèn: ");
			phongSua.setSoBongDen(new Scanner(System.in).nextInt());
			break;
		}

	}
	
	static void sortTheoDayNha(){
		ds.sortTheoDayNha();
		System.out.println(" Đã sắp xếp thành công ");
	}
	
	static void sortTheoDienTich(){
		ds.sortTheoDienTich();
		System.out.println(" Đã sắp xếp thành công ");
	}
	
	static void sortTheoSoBongDen(){
		ds.sortTheoSoBongDen();
		System.out.println(" Đã sắp xếp thành công ");
	}
	
	static void xuatDSPhongDatChuan(){
		System.out.println(" Danh sách phòng đạt chuẩn: ");
		tieuDe();
		for(PhongHoc p : ds.getDSPhongDatChuan())
			System.out.println("\t" +p);
	}
	
	static void xuatDSPhongMayTinh60May(){
		System.out.println(" Danh sách phòng máy tính có 60 máy: ");
		tieuDePhongTH();
		for(PhongHoc p : ds.getDSPhongMayCo60May())
			System.out.println("\t" +p);
	}

	
}
