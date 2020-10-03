// Tej Vyas
// CSC - 236 - 64
// Lab 4C

public class StackUnderflowException extends StackException
{
	public StackUnderflowException()
	{
		super("Stack Underflow");
	}
	public StackUnderflowException(String msg)
	{
		super(msg);
	}
}
