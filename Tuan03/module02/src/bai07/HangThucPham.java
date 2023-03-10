package bai07;

import java.time.LocalDate;

public class HangThucPham {
	/**
	 * @return the maHang
	 */
	public String getMaHang() {
		return maHang;
	}

	/**
	 * @param maHang the maHang to set
	 */
	public void setMaHang(String maHang) {
		this.maHang = maHang;
	}

	/**
	 * @return the tenHang
	 */
	public String getTenHang() {
		return tenHang;
	}

	/**
	 * @param tenHang the tenHang to set
	 */
	public void setTenHang(String tenHang) {
		this.tenHang = tenHang;
	}

	/**
	 * @return the donGia
	 */
	public float getDonGia() {
		return donGia;
	}

	/**
	 * @param donGia the donGia to set
	 */
	public void setDonGia(float donGia) {
		this.donGia = donGia;
	}

	/**
	 * @return the daysx
	 */
	public int getDaysx() {
		return daysx;
	}

	/**
	 * @param daysx the daysx to set
	 */
	public void setDaysx(int daysx) {
		this.daysx = daysx;
	}

	/**
	 * @return the monthsx
	 */
	public int getMonthsx() {
		return monthsx;
	}

	/**
	 * @param monthsx the monthsx to set
	 */
	public void setMonthsx(int monthsx) {
		this.monthsx = monthsx;
	}

	/**
	 * @return the yearsx
	 */
	public int getYearsx() {
		return yearsx;
	}

	/**
	 * @param yearsx the yearsx to set
	 */
	public void setYearsx(int yearsx) {
		this.yearsx = yearsx;
	}

	/**
	 * @return the dayhh
	 */
	public int getDayhh() {
		return dayhh;
	}

	/**
	 * @param dayhh the dayhh to set
	 */
	public void setDayhh(int dayhh) {
		this.dayhh = dayhh;
	}

	/**
	 * @return the monthhh
	 */
	public int getMonthhh() {
		return monthhh;
	}

	/**
	 * @param monthhh the monthhh to set
	 */
	public void setMonthhh(int monthhh) {
		this.monthhh = monthhh;
	}

	/**
	 * @return the yearhh
	 */
	public int getYearhh() {
		return yearhh;
	}

	/**
	 * @param yearhh the yearhh to set
	 */
	public void setYearhh(int yearhh) {
		this.yearhh = yearhh;
	}

	private String maHang;
	private String tenHang;
	private float donGia;
	private int daysx, monthsx, yearsx;
	private int dayhh, monthhh, yearhh;

	public HangThucPham() {
		maHang = "000";
		tenHang = "xxx";
		donGia = 0;
		daysx = 1;
		monthsx = 1;
		yearsx = 1000;
		dayhh = 1;
		monthhh = 1;
		yearhh = 1000;
	}

	public HangThucPham(String maHang, String tenHang, float donGia, int daysx, int monthsx, int yearsx, int dayhh,
			int monthhh, int yearhh) {
		LocalDate ngaySanXuat = LocalDate.of(yearsx, monthsx, daysx);
		LocalDate ngayHetHan = LocalDate.of(yearhh, monthhh, dayhh);
		if (maHang == " " || tenHang == " " || donGia <= 0 || monthsx < 1 || monthsx > 12 || monthhh < 1
				|| monthhh > 12) {
			if (ngaySanXuat.isBefore(LocalDate.of(1000, 1, 1)) || ngayHetHan.isBefore(ngaySanXuat)) {
				maHang = "000";
				tenHang = "xxx";
				donGia = 0;
				daysx = 1;
				monthsx = 1;
				yearsx = 1000;
				dayhh = 1;
				monthhh = 1;
				yearhh = 1000;
			}
		} else {
			this.maHang = maHang;
			this.tenHang = tenHang;
			this.donGia = donGia;
			this.daysx = daysx;
			this.monthsx = monthsx;
			this.yearsx = yearsx;
			this.dayhh = dayhh;
			this.monthhh = monthhh;
			this.yearhh = yearhh;
		}
	}

	public void ghiChu() {
		LocalDate ngayHetHan = LocalDate.of(yearhh, monthhh, dayhh);
		if (ngayHetHan.isBefore(LocalDate.now())) {
			System.out.printf("   Hàng hết hạn\n");
		} else {
			System.out.printf("\n");
		}
	}
	
	public String toString() {
		return String.format("%-10s %-10s %-8f %d/%d/%d        %d/%d/%d  ", maHang, tenHang, donGia, daysx, monthsx,
				yearsx, dayhh, monthhh, yearhh);
	}
}