// Tej Vyas
// CSC - 236
// Lab 1A

import java.util.Scanner;

public class TestDemo 
{
	public static void main(String[] args)
	{
		Account account = new Account(1122, 20000);
		account.setAnnualInterestRate(4.5);
		account.withdraw(2500);
		account.deposit(3000);
		
		 System.out.println("Balance: $" + account.getBalance());
	     System.out.println("Monthly Interest: $" + account.getMonthlyInterest());
	     System.out.println("Date Created: " + account.getDateCreated());

	}
}

