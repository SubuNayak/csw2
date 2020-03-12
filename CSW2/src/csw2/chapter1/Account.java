package csw2.chapter1;

public class Account {

	private String name;
	private int accNo;
	private double balance;

	public Account(String name, int accNo, double balance) {
		this.name = name;
		this.accNo = accNo;
		this.balance = balance;
	}

	public void deposit(double amount) {

		balance += amount;
	}

	public void withdraw(double amount) {
		if (amount <= balance)
			balance -= amount;
		else
			System.out.println("Insufficient Balance");
	}

	public void display() {
		System.out.println("Balance: " + balance);
	}

	public void display_details() {
		System.out.println("Account Details");
		System.out.println("---------------");
		System.out.println("Name: " + name);
		System.out.println("Account No: " + accNo);
		System.out.println("Balance: " + balance);
		System.out.println();
	}

}