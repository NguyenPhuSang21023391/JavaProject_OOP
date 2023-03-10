package book;




public class KiemThuBook {

	public static void main(String[] args) {
		nhapCung();
	}
	static void nhapCung()
	{
		Author [] dsAuthor1 = new Author[2];
		Author [] dsAuthor2 = new Author[3];
		dsAuthor1[0] = new Author("ten" , "mail", 'f');
		dsAuthor1[1] = new Author("ten" , "mail", 'm');
		//-------------------------------------------
		dsAuthor2[0] = new Author("ten" , "mail", 'f');
		dsAuthor2[1] = new Author("ten" , "mail", 'm');
		dsAuthor2[2] = new Author("ten" , "mail", 'm');
		Book b1= new Book(" Lap trinh OOP1", 100, 20, dsAuthor1);
		Book b2= new Book(" Lap trinh OOP2", 200, 50, dsAuthor2);
		
		System.out.println(b1);
		System.out.println(" danh sach author");
		
		for (Author au : b1.getAuthorsDS()) 
		{
			System.out.println(au);
		}
		
	System.out.println(b2);
	System.out.println(" danh sach author");
		
		for (Author au : b2.getAuthorsDS()) 
		{
			System.out.println(au);
		}
		

	}

}
