// Tej Vyas
// CSC 236

import java.util.*;
import java.util.Date;

public class Account
{
	private int id=0;
	private double balance=0.0;
	private double annualInterestRate = 0.0;
	private java.util.Date dateCreated;
	
	public Account()
	{
		dateCreated = new java.util.Date();
	}
	
	public Account(int id, double bal)
	{
		this();
		this.id = id;
		this.balance = bal;		
	}
	public int getId()
	{
		return this.id;
	}
	public double getBalance()
	{
		return this.balance;
	}
	public double getAnnualInterestRate()
	{
		return this.annualInterestRate;
	}
	public void setId(int id)
	{
		this.id = id;
	}
	public void setBalance(double bal)
	{
		this.balance = bal;
	}
	public void setAnnualInterestRate(double rate)
	{
		this.annualInterestRate = rate;
	}	
	public String getDateCreated()
	{
		return this.dateCreated.toString();
	}
	public double getMonthlyInterest()
	{
		return (annualInterestRate / 12);
	}
	public void withdraw(double amount)
	{
		this.balance = balance - amount;
	}
	public void deposit(double amount)
	{
		this.balance = balance + amount;
	}
}
