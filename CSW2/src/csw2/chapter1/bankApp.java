package csw2.chapter1;
import java.util.Scanner;

class Account{
	String name;
	int accNo;
	double balance;

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
	
}
public class bankApp {

	public static void main(String[] args) {
	
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter Name:");
		String s = sc.next();
		s += sc.nextLine();
		System.out.println("Enter Account No.:");
		int acc = sc.nextInt();
		System.out.println("Enter Balance:");
		double bala = sc.nextDouble();
		
		Account obj = new Account(s, acc, bala);
		
		System.out.println("=======BANK APP=======");
		System.out.println("1. To Deposit Amount");
		System.out.println("2. To Withdraw Amount");
		System.out.println("3. To Display Balance");
		System.out.println("4. To Display Account Details");
		System.out.println("0. To Exit");
		System.out.println("Enter your choice:");
		
		int ch = sc.nextInt();
		while(ch!=0)
		{
			
			switch(ch)
			{
				case 1:
				System.out.println("Enter amount to be deposited:");
				double deposit = sc.nextDouble();
				obj.deposit(deposit);
				break;
				
				case 2:
				System.out.println("Enter amount to Withdraw:");
				double withdraw = sc.nextDouble();
				obj.withdraw(withdraw);
				break;
				
				case 3:
				System.out.println("Balance: "+obj.balance);
				break;
				
				case 4:
				System.out.println("Name: "+obj.name);
				System.out.println("Account No: "+obj.accNo);
				System.out.println("Balance: "+obj.balance);
				break;
				
				default:
				System.out.println("Wrong Entry!");
				break;
			}
			
			System.out.println("=======BANK APP=======");
			System.out.println("1. To Deposit Amount");
			System.out.println("2. To Withdraw Amount");
			System.out.println("3. To Display Balance");
			System.out.println("4. To Display Account Details");
			System.out.println("0. To Exit");
			System.out.println("Enter your choice:");
			ch = sc.nextInt();
		}
		if(ch==0)
			System.out.println("Thank You!");
		
		
	}

}