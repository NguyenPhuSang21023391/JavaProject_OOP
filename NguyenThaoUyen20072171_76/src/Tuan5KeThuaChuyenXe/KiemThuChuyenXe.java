package Tuan5KeThuaChuyenXe;

import java.util.Scanner;

import tuan4HTP.HTPList;
import tuan4HTP.HangThucPham;

public class KiemThuChuyenXe {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		DanhSachChuyenXe list = new DanhSachChuyenXe();
		Scanner scn = new Scanner(System.in);
		int chon=-1;
		try {
			do {
				Menu();
				System.out.println("\n Nhap vao lua chon cua ban: "); 
				chon = new Scanner(System.in).nextInt();
				System.out.println("");
				switch(chon) {
				case 1:
					nhapCung(list);
					break;
				case 2:
					ThemMotXe();
					break;
				case 3:
					xoa(list);
					break;
				case 4:
					sua(list);
					break;
				case 5:
					System.out.println("Tong doanh thu la : "+ list.tinhDoanhThu());
					break;
				case 6:
					xuat(list);
					break;
				case 7:
					//System.out.println(list.sortTheoDoanhThu());
					break;
				case 8:
					break;
				case 9:
					xuatDSXeNgoaiThanh(list);
					break;
				case 10:
					xuatDSXeNoiThanh(list);
					break;
				case 11:
					break;
				}
			}while(chon!=12);
		}catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}

	private static void xuatDSXeNgoaiThanh(DanhSachChuyenXe list) {
		System.out.println("Danh sách xe ngoại thành: ");

		for(ChuyenXe xeNgoai : list.getDSXeNgoaiThanh())
			System.out.println(xeNgoai);
		
	}
	private static void xuatDSXeNoiThanh(DanhSachChuyenXe list) {
		System.out.println("Danh sách xe nội thành: ");
		for(ChuyenXe xeNoi : list.getDSXeNoiThanh())
			System.out.println(xeNoi);
		
	}
	static void Menu()     {
		System.out.println("\t*****************************************");
		System.out.println("\t       Chương trình quản lý chuyến xe   **");
		System.out.println("\t* 1. Nhập cứng                          *");
		System.out.println("\t* 2. Thêm 1 chuyến xe                   *");
		System.out.println("\t* 3. Xóa                                *");
		System.out.println("\t* 4. Sửa                                *");
		System.out.println("\t* 5. Xuất doanh thu                     *");
		System.out.println("\t* 6. Xuất                               *");
		System.out.println("\t* 7. Sắp xếp theo doanh thu             *");
		System.out.println("\t* 8. Sắp xếp theo tên tài xế            *");
		System.out.println("\t* 9. Xuất danh sách xe ngoại thành      *");
		System.out.println("\t* 10.Xuất danh sách xe nội thành        *");
		System.out.println("\t* 11.Sắp xếp theo 2 thuộc tính          *");
		System.out.println("\t* 12. Thoát                             *");
		System.out.println("\t*****************************************");

	}
	

	static void menuSuaNT() {
		System.out.println("\t***************************************");
		System.out.println("\t**    Mời nhập thông tin cần sửa	   **");
		System.out.println("\t* 1.Họ và tên tài xế					*");
		System.out.println("\t* 2.Số xe  							*");
		System.out.println("\t* 3.Số tuyến							*");
		System.out.println("\t* 4.Số km đi được						*");
		System.out.println("\t* 5.Doanh thu							*");
		System.out.println("\t* 6.Về menu chính                 	*");
		System.out.println("\t***************************************");

	}

	static void menuSuaNgT() {
		System.out.println("\t***************************************");
		System.out.println("\t**    Mời nhập thông tin cần sửa	   **");
		System.out.println("\t* 1.Họ và tên tài xế					*");
		System.out.println("\t* 2.Số xe  							*");
		System.out.println("\t* 3.Nơi đến							*");
		System.out.println("\t* 4.Số ngày đi được					*");
		System.out.println("\t* 5.Doanh thu							*");
		System.out.println("\t* 6.Về menu chính                 	*");
		System.out.println("\t***************************************");

	}

	static void nhapCung(DanhSachChuyenXe list) throws Exception{
      try{
    	  ChuyenXe nt = new NoiThanh("DT001", "Nguyễn Hoài An", 1, 450000, 3, 200);
    	  ChuyenXe ngt = new NgoaiThanh("DT002", "Võ Tấn Đạt", 2, 1500000, "Vũng Tàu", 1);
    	  ChuyenXe nt1 = new NoiThanh("DT003", "Trần Văn Tiến", 1, 230000, 2, 158);
    	  ChuyenXe ngt1 = new NgoaiThanh("DT004", "Nguyễn Văn Bảo", 2, 18000000, "Phú Quốc", 2);
    	  list.them(nt);
    	  list.them(ngt);
    	  list.them(nt1);
    	  list.them(ngt1);
      }catch (Exception e){
			System.out.println(e.getMessage());
      }
	}

	private void them(ChuyenXe nt) {
		// TODO Auto-generated method stub
		
	}

	static ChuyenXe cXe;
	private static KiemThuChuyenXe DS1;
	private static DanhSachChuyenXe DS;
	private static DanhSachChuyenXe dS2;
	static ChuyenXe ThemMotXe(){
		try{
			String maChuyenXe, hoTen;
			int soXe;
			double doanhThu;

			System.out.println("Nhập mã chuyến xe: ");
			maChuyenXe = new Scanner(System.in).nextLine();
			int vt = DS1.timKiemViTri(maChuyenXe);
			if(vt == -1){
				System.out.println("Nhập tên tài xế: ");
				hoTen = new Scanner(System.in).nextLine();
				System.out.println("Nhập doanh thu: ");
				doanhThu = new Scanner(System.in).nextDouble();
				System.out.println("Nhập số xe: ");
				soXe = new Scanner(System.in).nextInt();

				System.out.println(" Nhập xe nội thành [1] hoặc khác để nhập xe ngoại thành: ");
				int chon = new Scanner(System.in).nextInt();
				if(chon != 1){
					String noiDen;
					int soNgayDiDuoc;
					System.out.println(" Nhập nơi đến: ");
					noiDen = new Scanner(System.in).nextLine();
					System.out.println(" Nhập số ngày đi được: ");
					soNgayDiDuoc = new Scanner(System.in).nextInt();
					cXe = new NgoaiThanh(maChuyenXe, hoTen, soXe, doanhThu, noiDen, soNgayDiDuoc);

				}else{
					int soTuyen;
					double soKm;
					System.out.println(" Nhập số tuyến: ");
					soTuyen = new Scanner(System.in).nextInt();
					System.out.println(" Nhập số km đi được: ");
					soKm = new Scanner(System.in).nextDouble();
					cXe = new NoiThanh(maChuyenXe, hoTen, soXe, doanhThu, soTuyen, soKm);

				}
			}else{
				System.out.println("Mã chuyến xe đã trùng");
				return null;
			}
		}catch (Exception e){
			System.out.println(e.getMessage());
		}
		return cXe;
	}
	private int timKiemViTri(String maChuyenXe) {
		// TODO Auto-generated method stub
		return 0;
	}


	static void xuat(DanhSachChuyenXe DS){
		for(ChuyenXe xe : DS.getDS()){
			System.out.println(xe);
		}
	}

	static void xoa(DanhSachChuyenXe DS){
		try{
			System.out.println("Nhập mã chuyến xe cần xóa: ");
			String MaChuyenXe = new Scanner(System.in).nextLine();
			ChuyenXe xex = DS.timKiem(MaChuyenXe);
			if(xex !=null){
				System.out.println(" Bạn có xác nhận xóa xe này không [y/n]?");
				String acp = new Scanner(System.in).nextLine();
				if(acp.equalsIgnoreCase("y")){
					DS.xoa(xex);
					throw new Exception("Đã xóa thành công");
				}
				else{
					throw new Exception("Bạn đã giữ lại chuyến xe này");
				}
			} else
				throw new Exception("Không tồn tại xe này");
		} catch (Exception e){
			System.out.println(e.getMessage());
		}

	}

	static void sua(DanhSachChuyenXe DS) throws Exception{
		try{
			int chon = -1; int count = 0;
			System.out.println("Nhập mã chuyến xe cần sửa: ");
			String MaChuyenXe = new Scanner(System.in).nextLine();
			ChuyenXe xe = DS.timKiem(MaChuyenXe);

			if(xe == null)
				throw new Exception("Mã chuyến xe này không tồn tại");
			else{
				if(xe instanceof NoiThanh){
					NoiThanh xes = (NoiThanh) xe;
					System.out.println(" Thông tin xe trước khi sửa: \n" + xes);
					do{
						menuSuaNT();
						System.out.println(" Nhập lựa chọn: ");
						chon = new Scanner(System.in).nextInt();
						count++;
						switch (chon) {
						case 1:
							System.out.println(" Nhập tên tài xế: ");
							xes.setHoTen(new Scanner(System.in).nextLine());
							break;
						case 2:
							System.out.println(" Nhập số xe: ");
							xes.setSoXe(new Scanner(System.in).nextInt());
							break;
						case 3:
							System.out.println(" Nhập số tuyến: ");
							xes.setSoTuyen(new Scanner(System.in).nextInt());
							break;
						case 4:
							System.out.println(" Nhập số km đi được: ");
							xes.setSoKm(new Scanner(System.in).nextDouble());
							break;
						case 5:
							System.out.println(" Nhập doanh thu: ");
							xes.setDoanhThu(new Scanner(System.in).nextDouble());
							break;

						default:
							if(count > 1)
								System.out.println(" Về menu chính");
							break;
						}
					}while ( chon < 6);
					DS.sua(xes);
				}else {
					NgoaiThanh xes = (NgoaiThanh) xe;
					System.out.println(" Thông tin xe trước khi sửa: \n" + xes);
					do{
						menuSuaNgT();
						System.out.println(" Nhập lựa chọn: ");
						chon = new Scanner(System.in).nextInt();
						count++;
						switch (chon) {
						case 1:
							System.out.println(" Nhập tên tài xế: ");
							xes.setHoTen(new Scanner(System.in).nextLine());
							break;
						case 2:
							System.out.println(" Nhập số xe: ");
							xes.setSoXe(new Scanner(System.in).nextInt());
							break;
						case 3:
							System.out.println(" Nhập nơi đến: ");
							xes.setNoiDen(new Scanner(System.in).nextLine());
							break;
						case 4:
							System.out.println(" Nhập số ngày đi được: ");
							xes.setSoNgayDiDuoc(new Scanner(System.in).nextInt());
							break;
						case 5:
							System.out.println(" Nhập doanh thu: ");
							xes.setDoanhThu(new Scanner(System.in).nextDouble());
							break;

						default:
							if(count > 1)
								System.out.println(" Về menu chính");
							break;
						}
					}while ( chon < 6);
					DS.sua(xes);
				}
			}
		} catch (Exception e){
			System.out.println(e.getMessage());
		}
	}
	static void xuatSXTaiXe(DanhSachChuyenXe DS) {}
	static void getDSXeNgoaiThanh(){
		System.out.println("Danh sách xe ngoại thành: ");

		for(ChuyenXe xeNgoai : DS.getDSXeNgoaiThanh())
			System.out.println(xeNgoai);
	}
	static void getDSXeNoiThanh(){
		System.out.println("Danh sách xe nội thành: ");
		for(ChuyenXe xeNoi : DS.getDSXeNoiThanh())
			System.out.println(xeNoi);
	}

}
