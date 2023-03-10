package bai08;

import java.text.NumberFormat;
import java.util.Locale;


public class Account {
	private String name;
	private long accountNumber;
	private double balance;
	private final double RATE = 0.035;
	
	public Account(String name,long accountNumber,  double balance) {
		setAccountNumber(accountNumber);
		setName(name);
		setBalance(balance);
	}

	public Account() {
		this.accountNumber=999999;
		this.name="Chua xac dinh";
		this.balance=50000;
	}

	
	public Account(String name,long accountNumber ) {
		setAccountNumber(accountNumber);
		setName(name);
	}

	public long getAccountNumber() {
		return accountNumber;
	}

	public void setAccountNumber(long accountNumber) {
		if(accountNumber>0)
			this.accountNumber = accountNumber;
		else
			this.accountNumber=999999;
		
	}
	public void setName(String name) {
		if(!name.trim().equals(""))
			this.name = name;
		else
			this.name="Chua xac dinh";
	}
	public String getName() {
		return name;
	}

	public void balance(String name) {
		this.name = name;
	}

	public double getBalance() {
		return balance;
	}

	public void setBalance(double balance) {
		if(balance>=50000)
			this.balance = balance;
		else
			this.balance = 50000;
	}
	
	public boolean deposit(double amount) {
		if (amount>0) {
			balance+=amount;
			return true;
		} else {
			return false;
		}
	}
	
	public boolean withdraw(double amount,double fee) {
		if (amount>0 && amount+fee<=balance) {
			balance-=amount+fee;
			return true;
		} else {
			return false;
		}
		
	}
	
	public void addInterest() {
		balance = balance + balance * RATE;
	}
	
	public boolean transfer(Account acc2,double amount) {
		if (amount>0 && amount<=acc2.getBalance()) {
			acc2.setBalance(acc2.getBalance()+ amount);
			this.balance=this.balance-amount;
			return true;
		} else {
			return false;
		}
	}
	
	public static String layTieuDe() {
		return String.format("%-30s %-20s %-20s","Name" , "AccountNumber", "Balance"); 
	}
	@Override
	public String toString() {
		Locale localVN = new Locale("vi", "vn"); 
		NumberFormat tienTeVietNam = NumberFormat.getCurrencyInstance(localVN); 
		String tienTe = tienTeVietNam.format(balance);
		return String.format("%-30s %-20d %-20s",name , accountNumber, tienTe); 
	}	
}