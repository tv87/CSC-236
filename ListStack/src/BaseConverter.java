// Tej Vyas
// CSC - 236 - 64
// Lab 4B

import java.util.Scanner;

public class BaseConverter 
{
	public class BaseNumber
	{
		private long number;
		private long base;
		
		public BaseNumber()
		{
			number = 10;
			base = 0;
		}
		public BaseNumber(long num, long base)
		{
			this.number = num;
			this.base = base;
		}
		public long getNumber()
		{
			return number;
		}
		public long getBase()
		{
			return base;
		}
		public void setNumber(long num)
		{
			this.number = num;
		}
		public void setBase(long base)
		{
			this.base = base;
		}
	}
	private static final int MINIMUM_BASE = 2;
	private static final int MAXIMUM_BASE = 9;
	private static final int SIZE = 3;
	
	private BaseNumber[] baseNumber;
	public BaseConverter()
	{
		baseNumber = new BaseNumber[SIZE];
		
		inputPrompt();
	}
	public void inputPrompt()
	{
		Scanner userInput = new Scanner(System.in);
		
		System.out.println("Enter a positive base 10 long integer and base number"
				+ " between range " + MINIMUM_BASE + " and " + MAXIMUM_BASE + ":");
		
		for(int i = 0; i < SIZE; i++)
		{
			long number = -1;
			while(number < 0)
			{
				System.out.println("Number: ");
				number = userInput.nextLong();
			}
			long base = -1;
			while((base < MINIMUM_BASE) || base > MAXIMUM_BASE)
			{
				System.out.println("Base: ");
				base = userInput.nextLong();
			}
			System.out.println();
			baseNumber[i] = new BaseNumber(number, base);
		}
	}
	public String convert(BaseNumber baseNumber)
	{
		ListStackDataStrucClass<Long> stack = new ListStackDataStrucClass<Long>();
		
		long number = baseNumber.getNumber();
		long base = baseNumber.getBase();
		String s = "";
		while(number != 0)
		{
			stack.push(number % base);
			s= s + (number % base)+ " ";
			number = number / base;
		
		}
	return s;
	}
	public String convertAll()
	{
		String str = "";
		
		for(int i = 0; i < SIZE; i++)
		{
			str = str + (baseNumber[i].getNumber()) + "(Base 10) = " +
					convert(baseNumber[i]) + " (Base " + baseNumber[i].getBase()
					+ ")\n";
		}
		return str;
	}
	public String toString()
	{
		return convertAll();
	}
	public void processAndPrint()
	{
		System.out.println(this);
	}
}
