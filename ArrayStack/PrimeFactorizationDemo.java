// Tej Vyas
// CSC - 236 - 64
// Lab 4A

public class PrimeFactorizationDemo 
{
	public static void main(String [] args)
	{
		ArrayStackDataStrucClass<Integer> factorStack = new ArrayStackDataStrucClass<Integer>();
		
		try
		{
			factorStack.push(3960);
			factorStack.push(1234);
			factorStack.push(222222);
			factorStack.push(13780);
		}
		catch (StackOverflowException sofe)
		{
			System.out.println(sofe.toString());
			System.exit(0);
		}
		System.out.println("factorStack elements:");
		int temp;
		
		while(!factorStack.isEmptyStack())
		{
			int i = 2;
			
			System.out.println("Factor of: " + factorStack.peek() + " are");
			while(i < factorStack.peek())
			{
				temp = factorStack.peek();
				
				if(temp % i == 0)
				{
					System.out.print(i + " ");
					temp = factorStack.peek() / i;
				}
				i++;
			}
			factorStack.pop();
			System.out.println();
		}		
	}
}

