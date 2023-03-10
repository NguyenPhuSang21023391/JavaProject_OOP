package bai04;
/**
* 
* Biểu diễn điểm cho 1 sinh viên trong trường. Với các thuộc tính gồm mã số sinh viên,
* họ và tên của sinh viên, điểm thi phần lý thuyết và điểm thi thực hành
* 
*/
public class DiemSinhVien {
/**
* Mã số của sinh viên
*/
private int maSV;
/**
* Họ và tên của sinh viên
*/
private String hoTen;
/**
* Điểm lý thuyết
*/
private float diemLT;
/**
* Điểm thực hành
*/
private float diemTH;
/**
* Default constructor của lớp DiemSinhVien
*/
public DiemSinhVien() {
this(0, "", 0.0f, 0.0f);
}
/** 
* Constructor đầy đủ của lớp DiemSinhVien. 
* Dùng để tạo mới một sinh viên khi biết mã số sinh viên, họ và tên, điểm
* lý thuyết, điểm thực hành
* @param masv là mã số sinh viên
* @param hoten là họ và tên của sinh viên
* @param diemlt là điểm lý thuyết của sinh viên
* @param diemth là điểm thực hành của sinh viên
*/
public DiemSinhVien(int maSV, String hoTen, float diemLT, float diemTH) {
setMaSV(maSV);
setHoTen(hoTen);
setDiemLT(diemLT);
setDiemLT(diemTH);
}
/**
* Lấy mã số sinh viên
* @return the masv
*/
public int getMaSV() {
return maSV;
}
/**Thiết lập mã số sinh viên
* @param masv the masv to set
*/
public void setMaSV(int maSV) {
if (maSV < 0)
this.maSV = 0;
else
this.maSV = maSV;
}
/**
* Lấy thông tin họ và tên của sinh viên
* @return the hoten
*/
public String getHoTen() {
return hoTen;
}
/**
* Thiết lập họ và tên sinh viên
* @param hoten the hoten to set
*/
public void setHoTen(String hoTen) {
this.hoTen = hoTen;
}
/**
* Lấy điểm lý thuyết của sinh viên
* @return the diemlt
*/
public float getDiemLT() {
return diemLT;
}
/**
* Thay đổi điểm lý thuyết cho sinh viên
* @param diemlt the diemlt to set
*/
public void setDiemLT(float diemLT) {
if (diemLT >= 0 && diemLT <= 10)
this.diemLT = diemLT;
else
this.diemLT = 0;
}
/**
* Lấy điểm thực hành của sinh viên
* @return the diemth
*/
public float getDiemTH() {
return diemTH;
}
/**
* Thay đổi điểm thực hành cho sinh viên
* @param diemth the diemth to set
*/
public void setDiemTH(float diemTH) {
if (diemTH >= 0 && diemTH <= 10)
this.diemTH = diemTH;
else
this.diemTH = 0;
}
/**
* Lấy điểm trung bình của sinh viên
* @return the diemtb điểm trung bình
*/
public float getDiemTB() {
return (diemLT + diemTH)/2;
}
/**
* Biểu diễn đối tượng sinh viên ở dạng chuỗi
* @return String 
*/
@Override
public String toString() {
return String.format("%-5s %-30s %10.2f %10.2f %10.2f", maSV, hoTen, 
diemLT, diemTH, getDiemTB());
}
}