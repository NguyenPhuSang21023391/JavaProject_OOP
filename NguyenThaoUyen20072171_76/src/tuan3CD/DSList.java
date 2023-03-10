package tuan3CD;


public class DSList {
	private CD ds[];
	public int soLuongHT=0;
	public int soLuongHTofDG=0;

	// khởi tạo mảng

	public DSList(int soluong){
		ds = new CD[soluong];
	}

	// tăng kích thước mảng

	public void tangKichThuoc(){
		CD temp[] = new CD[ds.length *2];
		for(int i=0; i < ds.length; i++){
			temp[i] = ds[i];
		}
		ds = temp;
	}

	// thêm 1 tài khoản

	public void them(CD cd) throws Exception{
		if(soLuongHT== ds.length)
			tangKichThuoc();

		if (timKiem(cd.getMaCD()) == -1){
			ds[soLuongHT] = cd;
			soLuongHT++;
		}
		else
		{
			throw new Exception("Trùng mã");
		}
	}
	public int timKiem(int maCD){
		for(int i = 0; i < soLuongHT; i++){
			if(maCD == ds[i].getMaCD())
				return i;
		}
		return -1;
	}

	// hàm xóa

	public void xoa(CD acc){
		int vt = timKiem(acc.getMaCD());
		for (int i = vt; i < soLuongHT -1; i++){
			ds[i] = ds[i + 1];
		}
		soLuongHT--;

	}

	// hàm sắp xếp

	public void sua(CD sua) throws Exception{
		int vt = timKiem(sua.getMaCD());
		ds[vt] = sua;
		if(vt !=-1){
			ds[vt] = sua;
		}
		else{
			throw new Exception("Không tìm thấy obj để sửa");
		}

	}

	// hàm trả về tổng giá thành

	public void sortTheoGiaThanh(){
		CD temp = null;
		for(int i= 0; i < soLuongHT - 1; i++){
			for( int j = i+ 1; j < soLuongHT; j++)
				if(ds[i].getGiaThanh()> ds[j].getGiaThanh()){
					swap(ds, i, j, temp);
				}
		}
	}

	// hàm sắp xếp theo tựa CD
	
	private void swap(CD[] ds2, int i, int j, CD temp) {
		// TODO Auto-generated method stub
		
	}

	public void sortTheoTuaCD(){
		CD temp = null;
		for(int i= 0; i < soLuongHT - 1; i++){
			for( int j = i+ 1; j < soLuongHT; j++){
				if(ds[i].getTuaCD().compareTo(ds[j].getTuaCD()) > 0){
					swap(ds, i, j, temp);
				}
			}
		}
	}

	// hàm trả về danh sách

	public CD[] getDsAC(){
		return ds;
	}

	public String getMoney() {
		// TODO Auto-generated method stub
		return null;
	}

	public CD[] getDSBeHonN(double soTien) {
		// TODO Auto-generated method stub
		return null;
	}

	

	
	}

