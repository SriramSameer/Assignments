import java.util.Scanner;

public class SavingAccount2 {
	
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
		System.out.println("Enter amount to withdarw");
		withdrawAmount = wd.nextInt();
		balance-=withdrawAmount;
		
		if(depositAmount<0 || withdrawAmount<-1)
		{
			throw new IllegalAccessException();
		}
		else
			System.out.println("Successfully withdrawn : " +withdrawAmount);
		    System.out.println("Account balance after the transaction : "+balance);
	}
	
	public static void main(String args[])
	{
		try {
			fun();
		}
		catch(IllegalAccessException e) {
			System.out.println("Warning :Illegal bank transaction exception");
		}
	}
}
