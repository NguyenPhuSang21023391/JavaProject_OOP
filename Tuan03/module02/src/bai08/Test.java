package bai08;

public class Test {

	public static void main(String[] args) 
	{
		Account acc1= new Account("Ted Murphy", 72354, 100000);
		Account acc2=new Account("Jane Smith", 69713, 40000);
		Account acc3=new Account("Edward Demsey", 93757, 700000);
		acc1.deposit(250000);
		acc2.deposit(500000);
		acc2.withdraw(430000, 2000);
		acc3.addInterest();
		System.out.println(Account.layTieuDe());
		System.out.println(acc1);
		System.out.println(acc2);
		System.out.println(acc3);
		acc1.transfer(acc2,100000);
		System.out.println(Account.layTieuDe());
		System.out.println(acc1);
		System.out.println(acc2);
		System.out.println(acc3);
		
	}

}