class Bank{ 
	
	void totalMoneyInBank()
	{
		System.out.println("The total money in bank is : ");
	}
}

class SavingsAccount extends Bank{
	public static final double CashCredit = 0;
	double FixedDeposits = 18000;
	void totalMoneyInBank()
	{
		System.out.println("Total money in savings account is : " +(FixedDeposits));
	}
}

class CurrentAccount extends SavingsAccount{
	double CashCredit = 76000;
	void totalMoneyInBank()
	{
		System.out.println("The total money in current account is : " +(CashCredit));
	}
}

public class totalmoneyinbank {

	public static void main(String[] args) {
		
		CurrentAccount c = new CurrentAccount();
		SavingsAccount s = new SavingsAccount();
		
		c.totalMoneyInBank();
		s.totalMoneyInBank();
		
		System.out.println("Total money in the bank is : " + (c.FixedDeposits + c.CashCredit));
	}

}
