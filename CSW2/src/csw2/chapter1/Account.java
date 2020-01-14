package csw2.chapter1;

public class Account{
	
	private String name;
	private int accNo;
	private double balance;

	public Account(String name, int accNo, double balance){
		this.name = name;
		this.accNo = accNo;
		this.balance = balance;
	}
	
	public void deposit(double amount){
		
		balance += amount;
	}
	
	public void withdraw(double amount){
		balance -= amount;
	}
	
	public void display(){
		System.out.println("Balance: "+balance);
	}
	
	public void display_details(){
		System.out.println("Name: "+name);
		System.out.println("Account No: "+accNo);
		System.out.println("Balance: "+balance);
	}
	
}