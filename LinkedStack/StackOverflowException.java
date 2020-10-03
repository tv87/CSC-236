// Tej Vyas
// CSC - 236 - 64
// Lab 4C

public class StackOverflowException extends StackException
{
	public StackOverflowException()
	{
		super("Stack Overflow");
	}
	public StackOverflowException(String msg)
	{
		super(msg);
	}
}
