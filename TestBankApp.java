package Day8;
class SavingAccounts
{
	double balance;
	double interest;
	public SavingAccounts(double balance, double interest)
	{
		super();
		this.balance=balance;
		this.interest=interest;
	}
	void withdraw(int amount) {
		balance=balance-amount;
	}
	void deposit(int amount) {
		balance=balance+amount;
	}
	public int getBalance() {
		double intr=balance*(interest/100);
		balance+=intr;
		
		return (int) balance;
	}
	
	
}

public class TestBankApp {

	public static void main(String[] args) {
		SavingAccounts s1=new SavingAccounts(2000,2);
		s1.deposit(500);
		System.out.println(s1.getBalance());
		s1.withdraw(200);
		System.out.println(s1.getBalance());

	}

}
