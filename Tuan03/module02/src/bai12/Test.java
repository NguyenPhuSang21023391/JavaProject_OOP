package bai12;
import java.util.Scanner;
public class Test{
	
		public static void main(String[] args) {
			CDList ListCD = new CDList(2);
			try (Scanner scn = new Scanner(System.in)) {
				int chon = -1;
				try {
					do {
						menu();
						System.out.println("Nhập lựa chọn");
						chon = scn.nextInt();
						System.out.println(" ");
						switch (chon) {
						case 1:
							nhapCung(ListCD);
							break;
						case 2:
							CD cdn = nhapMem(ListCD);
							if (cdn != null)
								ListCD.them(cdn);
							else {
								System.out.println("Thêm khoog thành công");
							}
							break;
						case 3:
							xoa(ListCD);
							break;
						case 4:
							CD cdDeSua = Sua(ListCD);
							if (cdDeSua != null)
								ListCD.sua(cdDeSua);
							break;
						case 5:
							timKiem(ListCD);
							break;
						case 6:
								System.out.println(String.format("%20s |%20s |%20s |%20s |", "Mã CD", "Tựa CD", "Số Bài Hát","Giá thành"));
							xuat(ListCD);
							break;
						case 7:
							ListCD.sortTheoGiaThanh();
							System.out.println("Sắp xếp thành công");
							break;
						case 8:
							ListCD.sortTheoTuaCD();
							System.out.println("Sắp xếp thành công");
							break;
						case 9:
							System.out.println("Tong gia thanh la: " + ListCD.getMoney());
							break;
						case 10:
							xuatDSTheoDonGiaCanTim(ListCD);
							break;
						default:
							System.out.println("DONE");
						}
					}while (chon < 11);
				}catch (ArithmeticException e1) {
					System.out.println("Khong duoc chia cho khong" + e1.getMessage());
				}catch (ArrayIndexOutOfBoundsException e2) {
					System.out.println("Loi mang" + e2.getMessage());
				}catch (Exception e) {
					System.out.println("Loi khong xac dinh" + e.getMessage());
				}
			}
		}	
		static void menu() {
			System.out.println("\t**************************************************");
			System.out.println("\t**          Chuong trinh quan li CD             **");
			System.out.println("\t* 1. Nhập cứng                                 *");
			System.out.println("\t* 2. Thêm                                        *");
			System.out.println("\t* 3. Xóa                                         *");
			System.out.println("\t* 4. Sửa                                         *");
			System.out.println("\t* 5. Tim kiem                                    *");
			System.out.println("\t* 6. Xuất                                        *");
			System.out.println("\t* 7. Sắp xếp tăng theo giá thành             *");
			System.out.println("\t* 8. Sắn xếp tăng theo tựa CD                *");
			System.out.println("\t* 9. Xuat tong gia thanh                         *");
			System.out.println("\t* 10. Xuat theo don gia can tim                  *");
			System.out.println("\t* 11. Thoat                                      *");
			System.out.println("\t**************************************************");
		}
		static void menuSua() {
			System.out.println("\t**************************************************");
			System.out.println("\t**         Moi nhap thong tin                  **");
			System.out.println("\t* 1. Số bài hát                                  *");
			System.out.println("\t* 2. Tựa bài hát                                 *");
			System.out.println("\t* 3. Dơn giá                                     *");
			System.out.println("\t* 4. Về menu chính                               *");
			System.out.println("\t**************************************************");
		}
		static void nhapCung(CDList ds) throws Exception {
			CD cd = new CD(1, 3, "Hiphop never die", 10000d);
			ds.them(cd);
			cd = new CD(2, 8, "Black Pink", 5000);
			ds.them(cd);
			cd = new CD(3, 12, "Album Mono", 7000);
			ds.them(cd);
		}
		static CD nhapMem(CDList ds) throws Exception {
			Scanner input = new Scanner(System.in);
			CD cd = new CD();
			int maCD;
			System.out.println("\nNhap ma CD: ");
			maCD = input.nextInt();
			if(ds.timKiem(maCD) == -1) {
				cd.setMaCD(maCD);
				System.out.println("\nNhập số bài hát: ");
				cd.setSoBH(input.nextInt());
				System.out.println("\nNhập tựa đề: ");
				input.nextLine();
				cd.setTuaCD(input.nextLine());
				System.out.println("\nNhập thành: ");
				cd.setGiaThanh(input.nextDouble());
				System.err.println("Thêm Thành công");
			}
			else {
				System.out.println("Them không thành công, mã CD trung. ");
				return null;
			}
			return cd;
		}
		static void xoa(CDList ds) {
			Scanner input = new Scanner(System.in);
			int maCD;
			System.out.println("\nNhap ma CD: ");
			maCD = input.nextInt();
			int vt = ds.timKiem(maCD);
			if(vt==-1) {
				System.out.println("\nMa CD khong ton tai");
			} else {
				String acp;
				System.out.println("\nBan co chac muon xoa CD nay khoi danh sach? [y/n]");
				acp = new Scanner(System.in).nextLine();
				if(acp.equals("y")) {
					ds.xoa(ds.getDsAC()[vt]);
					System.out.println("Xoa thanh cong");
				}else {
					System.out.println("Xoa khong thanh cong! Ve menu chinh");
				}
			}
		}
		static CD Sua(CDList ds) throws Exception {
			Scanner input = new Scanner(System.in);
			int maCD, chon = -1, vt;
			String tuaBH;
			System.out.println("\nNhập mã CD cần sửa: ");
			maCD = input.nextInt();
			vt = ds.timKiem(maCD);
			CD cdSua = ds.getDsAC()[vt];
			if(vt == -1) {
				System.out.println("\nMã CD không tồn tại");
			}else {
				System.out.println("Thông tin về CD của bạn:");
				do {
					menuSua();
					System.out.println("\nNhap lua chon: ");
					chon = input.nextInt();
					switch(chon) {
					case 1:
						System.out.println("\nNhap so bai hat: ");
						cdSua.setSoBH(input.nextInt());
						break;
					case 2:
						System.out.println("\nNhap tua de: ");
						tuaBH = input.nextLine();
						break;
					case 3:
						System.out.println("\nNhap gia thanh: ");
						cdSua.setGiaThanh(input.nextDouble());
						break;
					default:
						ds.sua(cdSua);
						System.out.println("Da sua thanh cong! Tro ve menu chinh");
					}
				}while(chon<4);
			}
			return cdSua;
		}
		static void timKiem(CDList ds) {
			Scanner input = new Scanner(System.in);
			int maCD;
			System.out.println("\nNhap ma CD: ");
			maCD = input.nextInt();
			if(ds.timKiem(maCD)==-1) {
				System.out.println("\nMa Cd khong ton tai");
			} else {
				System.out.println("Cd cua ban nam o vi tri " + ds.timKiem(maCD));
			}
		}
		static void xuat(CDList ds) {
			for(int i = 0; i<ds.soLuongHT; i++) {
				System.out.println(ds.getDsAC()[i]);
			}
		}
		static void xuatDSTheoDonGiaCanTim(CDList ds) {
			System.out.println("Nhập số tiền bạn muốn mua CD: ");
			double soTien = new Scanner(System.in).nextInt();
			CD temp[] = ds.getDSBeHonN(soTien);
			if(ds.soLuongHTofDG != 0) {
				for(int i = 0; i<ds.soLuongHTofDG; i++) {
					System.out.println(temp[i]);
				}
			} else
				System.out.println("Không có CD nào thỏa mãn yêu cầu");
		}
		
	}


