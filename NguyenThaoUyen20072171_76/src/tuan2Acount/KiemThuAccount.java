package tuan2Acount;

import java.util.Scanner;

public class KiemThuAccount 
{
	static Account acc1;
	static Account acc2;
	static Account acc3;

	 public static void main(String[] args)


	{
		int chon=0;
		System.out.println("Chương trình quản lý tài khoản ");
		do {
			menu();
			System.out.println("Nhập lựa chọn: ");
			chon = new Scanner(System.in).nextInt(); 
			switch (chon) 
			{
			case 1:
				inTieuDeCot();
				taoCungTaiKhoan();
				break;
			case 7:
				napTienVaoTaiKhoan();
				break;
			}
		}while(chon!=9);

	}
	static void napTienVaoTaiKhoan()
	{
		Account accNap;
		int chon;
		long tienNap=0;
		System.out.println("Nhập tài khoản muốn nạp, 1, 2, 3 ");
		chon=new Scanner(System.in).nextInt();
		if(chon ==1)
			accNap=acc1;
		else if(chon ==2)
			accNap=acc2;
		else
			accNap=acc3;
		System.out.println("Bạn nhập bao nhiêu:");
		tienNap =new Scanner(System.in).nextLong();
		if(tienNap>0){
		  if(accNap.napTien(tienNap)!=false);
		   {
			System.out.println("Nạp thành công");
		   }
		}
		   else
			   System.out.println("Nạp không thành công");
	}

	static void menu(){
		System.out.println("\t************************************");
		System.out.println("\t** Chương trình quản Acc **");
		System.out.println("\t* 1. Nhập cứng                    **");
		System.out.println("\t* 2. Thêm mềm (nhập tay)          **");
		System.out.println("\t* 3. Xóa                          **");
		System.out.println("\t* 4. Sửa                          **");
		System.out.println("\t* 5.Chuyển tiền                   **");
		System.out.println("\t* 6. Xuất                         **");
		System.out.println("\t* 7. Nạp Tiền                     **");
		System.out.println("\t* 8. Đáo Hạn                      **");
		System.out.println("\t* 9. Thoát                        **");



	}



static void taoCungTaiKhoan()
{
	acc1= new Account(1234, "Nguyễn Văn A", 1000000);
	acc2= new Account(1235, "Trần Thị C", 6000000);
	acc3= new Account(1236, "Huỳnh Hoàng B", 3000000);
	System.out.println(acc1);
	System.out.println(acc2);
	System.out.println(acc3);
}
static	void inTieuDeCot()
{
	String strGiaTri=String.format("%15s%-35s%15s" ,"Số tài khoản: ",  "Tên chủ Acc: ", "Tiền của Acc: ");
	System.out.println(strGiaTri);
}
}

