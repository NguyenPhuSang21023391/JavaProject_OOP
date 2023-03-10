package tuan4HTP;

import java.util.Arrays;
import java.util.Scanner;

public class KiemThuHangThucPham {

	

		public static void main(String[] args) {
			HTPList htpList = new HTPList(10);
			Scanner scn = new Scanner(System.in);
			int chon=-1;
			try {
				do {
					menu();
					System.out.println("Nhập lựa chọn của bạn: ");
					chon = new Scanner(System.in).nextInt();
					System.out.println("");
					switch(chon) {
						case 1:
							nhapCung(htpList);
							break;
						case 2:
							xoa(htpList);
							break;
						case 3:
							HangThucPham maSua=sua(htpList);
							if(maSua!=null)//co sua
								htpList.sua(maSua);
							sua(htpList);
							break;
						case 5:
							inTieuDeCot();
							xuat(htpList);
							break;
						case 4:
							HangThucPham cdn=nhapMem(htpList);
							if(cdn!=null)
								htpList.them(cdn);
							else {
								System.out.println("Them khong thanh cong");
							}
							break;
						case 6:
							int sptThuc = htpList.soLuongThuc;
							HangThucPham[] toanMang;
							toanMang = htpList.getDsHtp();
							HangThucPham[] mangCoChuaCacPTThat;
							mangCoChuaCacPTThat = new HangThucPham[sptThuc];
							for (int i=0;i<sptThuc;i++) 
								mangCoChuaCacPTThat[i]=toanMang[i];
							Arrays.sort(mangCoChuaCacPTThat);
							System.out.println("\n Mảng sau khi đã sắp xếp");
							inTieuDeCot();
							xuatMangDaSapXep(mangCoChuaCacPTThat,sptThuc);
							break;
						case 7:
							//xuatDSTheoNgaySapHetHan(htpList);
							//xuatDSSapHetHan(htpList);
							break;
					}
				}while(chon!=8);
			}catch (Exception e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
		
		static void xuatMangDaSapXep(HangThucPham[] ds,int sptThuc) {
			for (int i=0;i<sptThuc;i++) {
				System.out.println(ds[i]);
			}
		}
		

		
		static void nhapCung(HTPList ds) throws Exception {
			HangThucPham htp = new HangThucPham(111,"abc", 150000, "20/12/2021", "20/12/2022");
			ds.them(htp);
			htp = new HangThucPham(112,"Mì gói", 3000, "15/9/2022", "15/12/2022");
			ds.them(htp);
			htp = new HangThucPham(113,"Sữa chua", 40000, "15/9/2022", "30/9/2022");
			ds.them(htp);
			htp = new HangThucPham(114,"Bánh mì tươi", 40000, "17/9/2022", "26/9/2022");
			ds.them(htp);
			htp = new HangThucPham(115,"Cá viên", 30000, "1/8/2022", "25/11/2022");
			ds.them(htp);
			htp = new HangThucPham(116,"7UP", 1500000, "14/9/2022", "24/9/2023");
			ds.them(htp);
			htp = new HangThucPham(117," Cá viên", 50000, "13/8/2022", "22/10/2022");
			ds.them(htp);
		}
		
		static HangThucPham nhapMem(HTPList ds) throws Exception {
			Scanner scn= new Scanner(System.in);
			HangThucPham htp = new HangThucPham();
			int maHang;
			String tenHang;
			double donGia;
			boolean ngay=true;
			System.out.println("\nNhập mã hàng: ");
			maHang=scn.nextInt();
			if(ds.timKiem(maHang)==-1) {
				htp.setMaHang(maHang);
				System.out.println("\nNhập tên hàng: ");
				tenHang = new Scanner(System.in).nextLine();
				htp.setTenHang(tenHang);
				System.out.println("\nNhập đơn giá: ");
				donGia = scn.nextDouble();
				htp.setDonGia(donGia);
				do {
					System.out.println("Nhập năm,tháng,ngày sản xuất: ");
					htp.setNSX(scn.nextInt(), scn.nextInt(), scn.nextInt());;
					System.out.println("Nhập năm,tháng,ngày hết hạn: ");
					htp.setHSD(scn.nextInt(), scn.nextInt(), scn.nextInt());;
				}while(htp.kiemTraNgay(ngay));
				htp.kiemTraHSD();
				System.out.println("\nThêm thành công");
			}else {
				System.out.println("Thêm không thành công! Trùng mã hàng!");
				return null;
			}
			return htp;
		}
		
		static void xoa(HTPList ds) {
			HangThucPham maXoa=null;
			Scanner scn = new Scanner(System.in);
			int vt=-1,ma;
			System.out.println("\nNhập mã hàng cần xóa: ");
			ma= scn.nextInt();
			vt=ds.timKiem(ma);
			
			if(vt!=-1) {
				String acp;
				System.out.println("\nBan co chac chan muon xoa tai khoan nay? [y/n]: ");
				acp = new Scanner(System.in).nextLine();
				if(acp.equals("y")) {
					ds.xoa(ds.getDsHtp()[vt]);
					System.out.println("Xoa thanh cong");
				}else {
					System.out.println("Xoa khong thanh cong!");
				}
			}
		}
		
		static HangThucPham sua(HTPList ds) throws Exception {
			HangThucPham maSua=null;
			Scanner scn = new Scanner(System.in);
			int ma,vt=-1;
			double tienSua=0;
			System.out.println("\nNhập mã hàng cần sửa: ");
			ma= scn.nextInt();
			vt=ds.timKiem(ma);
			int chon=-1;
			String name;
			if(vt !=-1) {
				maSua =ds.getDsHtp()[vt];
				inTieuDeCot();
				System.out.println("\nThông tin về hàng chưa sửa: " + maSua);
				do {
					menuSua();
					System.out.println("\nNhập lựa chọn: ");
					chon= scn.nextInt();
					switch(chon) {
					case 1:
						System.out.println("\nNhập mã hàng:");
						maSua.setMaHang(scn.nextInt());
						break;
					case 2:
						System.out.println("\nNhập tên mã hàng: ");
	name = new Scanner(System.in).nextLine();
						maSua.setMaHang(ma);
						break;
					case 3:
						System.out.println("\nNhập đơn giá: ");
						maSua.setDonGia(scn.nextDouble());
						break;
					case 4:
						System.out.println("\nNhập ngày sản xuất: ");
						maSua.setNSX(scn.nextInt(), scn.nextInt(), scn.nextInt());
						break;
					case 5:
						System.out.println("\nNhập ngày sản xuất: ");
						maSua.setHSD(scn.nextInt(),scn.nextInt(), scn.nextInt());
						break;
					default:
						ds.sua(maSua);
						System.out.println("\nĐã sửa thành công trở về menu chính");
					}
				}while(chon<6);
			}else {
				System.out.println("\nKhông tìm thấy mã hàng!");
			}
			return maSua;
		}
		
		static void xuat(HTPList ds) {
			for (int i=0;i<ds.soLuongThuc;i++) {
				System.out.println(ds.getDsHtp()[i]);
			}
		}
		
		static void inTieuDeCot() {
			String str="";
			str += String.format("%10s%-35s%15s%20s%20s", "Mã hàng"," "+"Tên hàng","Đơn giá","Ngày sản xuất","Ngày hết hạn");
			System.out.println(str);
		}
		
		static void menu() {
			System.out.println("\t********************************");
			System.out.println("\t**  Chương trình kiểm tra hàng thực phẩm	**");
			System.out.println("\t* 1.Nhập cứng hàng					*");
			System.out.println("\t* 2.Xóa hàng							*");
			System.out.println("\t* 3.Sửa hàng							*");
			System.out.println("\t* 4.Thêm hàng							*");
			System.out.println("\t* 5.Xuất								*");
			System.out.println("\t* 6.Xuất theo tên hàng và giá thành	*");
			System.out.println("\t********************************");
		}
		
		static void menuSua() {
			System.out.println("\n");
			System.out.println("\t********************************");
			System.out.println("\t* 	Mời nhập thông tin cần sửa		*");
			System.out.println("\t* 1.Mã hàng							*");
			System.out.println("\t* 2.Tên thực phẩm						*");
			System.out.println("\t* 3.Đơn giá							*");
			System.out.println("\t* 4.Ngày sản xuất						*");
			System.out.println("\t* 5.Ngày hết hạn						*");
			System.out.println("\t* 6.Về menu chính						*");
			System.out.println("\t********************************");
		}
	

}
