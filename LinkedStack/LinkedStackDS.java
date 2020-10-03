// Tej Vyas
// CSC - 236 - 64
// Lab 4C

public class LinkedStackDS<T> implements LinkedStackADT<T>
{
	private class StackNode<T>
	{
		public T value;
		public StackNode<T> next;
		
		public StackNode()
		{
			value = null;
			next = null;
		}
		public StackNode(T val, StackNode<T> _next)
		{
			this.value = val;
			this.next = _next;
		}
		public String toString()
		{
			return (String) stackTop.value;
		}
	}
	private StackNode<T> stackTop;
	
	public LinkedStackDS()
	{
		stackTop = null;		
	}
	public LinkedStackDS(StackNode<T> top)
	{
		this.stackTop = top;
	}
	public LinkedStackDS(LinkedStackDS<T> stack)
	{
		this.stackTop = stack.stackTop;
	}
	public boolean isEmptyStack()
	{
		return(stackTop == null);
	}
	public void push(T newItem)
	{
		StackNode<T> newNode = new StackNode<T>(newItem, stackTop);
		
		stackTop = newNode;		
	}
	public T peek() throws StackUnderflowException
	{
		if(isEmptyStack())
			throw new StackUnderflowException();
		
		return stackTop.value;
	}
	public T pop() throws StackUnderflowException
	{
		if(isEmptyStack())
			throw new StackUnderflowException();
		else
		{
			T element = stackTop.value;
			stackTop = stackTop.next;
			
			return element;
		}
	}
}

