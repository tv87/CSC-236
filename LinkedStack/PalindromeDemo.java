// Tej Vyas
// CSC - 236 - 64
// Lab 4C

import javax.swing.*;

public class PalindromeDemo 
{
	public static void main(String[] args)
	{
		LinkedStackDS<Character> palindStack = new LinkedStackDS<Character>();
		
		String inputStr;
		String replaceStr;	
		String reverseStr = "";
		int test;
		
		do
		{
			inputStr = JOptionPane.showInputDialog("Input a String for Palindrome Test");
			
			replaceStr = inputStr.replaceAll("[^a-zA-Z]","");
			
			for(int i = 0; i < replaceStr.length(); i++)
			{
				char c = replaceStr.charAt(i);
				palindStack.push(replaceStr.charAt(i)); 
			}
			while(!palindStack.isEmptyStack())
	        {
				Character reverseC = palindStack.peek();
				reverseStr += reverseC;
				palindStack.pop();
	        }
		if(replaceStr.compareToIgnoreCase(reverseStr) == 0)
			JOptionPane.showMessageDialog(null, "String " + inputStr + " is a palindrome" );
		else
			JOptionPane.showMessageDialog(null, "String " + inputStr + " is not a palindrome" );
		
		test = JOptionPane.showConfirmDialog(null, "Test another palindrome?",
		           "Try another palindrome?", JOptionPane.YES_NO_OPTION);
		if (test == 1)
	        JOptionPane.showMessageDialog(null, "Program Ends.",
	                "Thanks for using this program!", JOptionPane.INFORMATION_MESSAGE);		
		}
		while(test == 0);
		
	}

}

