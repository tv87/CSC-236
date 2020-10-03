// Tej Vyas
// CSC - 236 - 64
// Lab 4B

public class EmptyStackException extends RuntimeException
{
	public EmptyStackException()
	{
		super("Empty Stack");
	}
	public EmptyStackException(String msg)
	{
		super(msg);
	}
}
