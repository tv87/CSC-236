// Tej Vyas
// CSC 236
// Lab 1B

import java.util.Scanner;

public class Lab1B 
{
		public static void main(String[] args) 
		{
			Scanner sc = new Scanner(System.in);
			
			System.out.print("Enter a hex string: ");
			String hexString = sc.next();

			System.out.println("The decimal equivalent of "
						+ hexString + " is " + hex2Dec(hexString));
		}
		public static int hex2Dec(String hexString)
		{
			int i = 0;
			int result = 0;
			int size = hexString.length() - 1;
			return hex2Dec(hexString, result, size, result);
		}
		public static int hex2Dec(String hexString, int i, int n, int result)
		{
			int dec = 0;
			if (hexString.charAt(i) >= 'A' &&  hexString.charAt(i) <= 'F')
			{
				dec = (hexString.charAt(i) - 'A') + 10;
			}
			else
			{
				dec = Integer.parseInt(String.valueOf(hexString.charAt(i)));
			}
			dec = dec * (int)Math.pow(16, n);
			if (n == 0)
				return result + dec;
			else 	
				return hex2Dec(hexString, i + 1, n - 1, dec + result);
		}
}
