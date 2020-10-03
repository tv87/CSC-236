import java.util.*;
import java.math.*;

public class LockDemo {

	public static void main(String [] args)
	{
		
		lockMenu();
	}
	
	public static void lockMenu()
	{
		int x;
		int y;
		int z;		
		
		Scanner kb = new Scanner(System.in);
		
		LockDataStructures n = new LockDataStructures();
		
		 System.out.println("\nSelect an option for the lock.\n");
		 System.out.println("a : Set new lock combination. ");
		 System.out.println("b : Close the lock.");
		 System.out.println("c : Attempt to open the lock.");
		 System.out.println("d : Check lock status.");
		 System.out.println("e : Check current top number.");
		 
		 char menuOption = kb.next().charAt(0);
		 switch(menuOption)
		{
		 case 'a':
		 {
			 System.out.println("Set a new combination for the lock.\n");

		      System.out.println("Enter the first number of the combination.");
		      x = kb.nextInt();
		      System.out.println("Enter the second number of the combination.");
		      y = kb.nextInt();
		      System.out.println("Enter the third number of the combination.");
		      z = kb.nextInt();
		 
		      n.alter(x,y,z);
		  }
		 case 'b':
		 {
		     System.out.println("CLICK!");
		     n.close();
		     n.inquire();
		 }
		 case 'c':
		 {
		      System.out.println(" ATTEMPT ");
		      System.out.println("Enter the first number of the combination.");
		      x = kb.nextInt();
		      System.out.println("Enter the second number of the combination.");
		      y = kb.nextInt();
		      System.out.println("Enter the third number of the combination.");
		      z = kb.nextInt();
		      n.attempt(x,y,z);
		  }
		 case 'd':
		 {
		      n.inquire();
		 }
		 case 'e':
		 {
		      System.out.println("The top number currently is: " + n.currently());
		 }
		 case 'z':
		 {
			 System.out.println("Exiting . . . ");
		  System.exit(0);
		 }
		 default:
		 {
		      System.out.println("\n**** INVALID SELECTION ****");
		      System.out.println("Select from a - e or z to exit.");
		 }
		 }
	}
}
