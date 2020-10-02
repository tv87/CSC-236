// Tej Vyas
// CSC - 236 - 64
// Lab 4A

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
