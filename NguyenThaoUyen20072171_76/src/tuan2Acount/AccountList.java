package tuan2Acount;

public class AccountList {

	private Account ds[];
	 public int soLuongThuc=0; 

	 
	 //khoi tao
	 public AccountList(int soLuong) {
	  ds = new Account[soLuong];
	 }
	 
	 //tang kich thuoc neu mang day
	 public void TangKichThuoc() {
	  Account temp[] = new Account[ds.length *2];
	  for (int i=0; i< ds.length; i++) {
	   temp[i]=ds[i];
	  }
	  ds = temp;
	 }
	 
	 //tim kiem
	 public long timKiem(long accNum) {
	  for (int i=0;i<soLuongThuc;i++) {
	   if(accNum == ds[i].getAccountNumber())
	    return i; 
	  }
	  return -1;
	 }
	 
	 //them
	 public void them(Account acc) throws Exception {
	  if(soLuongThuc == ds.length)
	   TangKichThuoc();
	  
	  if(timKiem(acc.getAccountNumber())==-1) {//khong tim thay
	   ds[soLuongThuc]=acc;
	   soLuongThuc++;
	  }else {
	   throw new Exception("Trung ma!");
	  }
	 }
	 
	 //xoa
	 public void xoa(Account acc) {
	  long vt = timKiem(acc.getAccountNumber());
	  for(int i =(int) vt;i<soLuongThuc-1;i++) {
	   ds[i]=ds[i+1];
	  }
	  soLuongThuc--;
	 }
	 
	 //sua
	 public void sua(Account sua) throws Exception {
	  long vt = timKiem(sua.getAccountNumber());
	  if(vt!=-1) 
	   ds[(int) vt]=sua;
	  else
	   throw new Exception("Khong tim thay obj de sua");
	 }
	 // ham tra ve tong
	 public double getMoney() {
	  double ans = 0;
	  for (int i=0;i<=soLuongThuc;i++) {
	   ans+= ds[i].getBalance();
	  }
	  return ans;
	 }
	 
	 //hoan vi
	 public void swap(Account list[],int i, int j, Account temp) {
	  temp = ds[i];
	  ds[i] = ds[j];
	  ds[j]=temp;
	 }
	 
	 public Account[] getDsAcc(){
	  return ds;
	 }
}
