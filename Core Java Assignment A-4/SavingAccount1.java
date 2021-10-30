import java.util.Scanner;

public class SavingAccount1 {
	
	static void fun() throws IllegalAccessException
	{
		double balance = 0,
		depositAmount,
		withdrawAmount;
		
		Scanner dep = new Scanner(System.in);
		System.out.println("Enter amount to deposit");
		depositAmount = dep.nextInt();
		balance+=depositAmount;
		
		Scanner wd = new Scanner(System.in);
		System.out.println("Enter amount to withdraw");
		withdrawAmount = wd.nextInt();
		balance-=withdrawAmount;
		
		if(balance<0 && withdrawAmount>balance)
		{
			throw new IllegalAccessException();
		}
		
		else
			System.out.println("Successfully withdrawn " +withdrawAmount);
		    System.out.println("Account balance after the transaction " +balance);
	}
	public static void main(String[] args) {
		
		try {
			fun();
		}
		catch(IllegalAccessException e) {
			System.out.println(" INSUFFICIENT BALANCE ");
		}
	}

}
