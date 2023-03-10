package book;



public class Book {
	private String bookName;
	private double price;
	private int quantity;
	private Author[] autauthorsDanhSach= null; //mang author dua vao book c=k cos getter setter, nhap o main

	public String getBookName() {
		return bookName;
	}
	public void setBookName(String bookName) {
		this.bookName = bookName;
	}
	public double getPrice() {
		return price;
	}
	public void setPrice(double price) {
		this.price = price;
	}
	public int getQuantity() {
		return quantity;
	}
	public void setQuantity(int quantity) {
		this.quantity = quantity;
	}

	public Book(String bookName, double price, Author[] autauthorsDanhSach) {
		super();
		this.bookName = bookName;
		this.price = price;
		this.autauthorsDanhSach = autauthorsDanhSach;
	}
	public Book(String bookName, double price, int quantity,
			Author[] autauthorsDanhSach) {
		super();
		this.bookName = bookName;
		this.price = price;
		this.quantity = quantity;
		this.autauthorsDanhSach = autauthorsDanhSach;
	}

	public Author[] getAuthorsDS()
	{
		return this.autauthorsDanhSach;
	}
	public String getDSAuthorNames()
	{
		String tenAuthor="";
		for (Author au : getAuthorsDS()) // khi duyet tat ca cac phan tu tren mang thi dung foreach
		{
			tenAuthor+= au.getFullName() +",";
		}
		return tenAuthor;
	}

	@Override
		public String toString() {
		String str= "";
	//str+= String.format("%-35s%10.2fs%10d%-35s", getBookName(),getPrice(),getQuantity(),getDSAuthorNames());       khong dep, xuat ten tac gia sau
		str+= String.format("%-35s%10.2fs%10d", getBookName(),getPrice(),getQuantity());
		return str;
	}
}
