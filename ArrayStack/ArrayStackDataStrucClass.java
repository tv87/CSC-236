// Tej Vyas
// CSC - 236 - 64
// Lab 4A

public class ArrayStackDataStrucClass<T> implements ArrayStackADT<T>
{
	private int maxStackSize;
	private int stackTop;
	private T[] list;
	
	public ArrayStackDataStrucClass()
	{
		this.maxStackSize = 50;
		this.stackTop = 0;
		this.list = (T[]) new Object[maxStackSize];
	}	
	public ArrayStackDataStrucClass(int size, int top, T[] array)
	{
		this.maxStackSize = size;
		this.stackTop = top;
		this.list = array;
	}
	public ArrayStackDataStrucClass(ArrayStackDataStrucClass<T> stack)
	{
		maxStackSize = stack.maxStackSize;
		stackTop = stack.stackTop;
		list = stack.list;
	}
	public void initializeStack()
	{
		for(int i = 0; i < stackTop; i++)
			list[i] = null;
		
		stackTop = 0;
	}
	public boolean isEmptyStack()
	{
		return(stackTop == 0);
	}
	public boolean isFullStack()
	{
		return (stackTop == maxStackSize);
	}
	public void push(T newItem) throws StackOverflowException
	{
		if(isFullStack())
			throw new StackOverflowException();
		
		list[stackTop] = newItem;
		
		stackTop++;
	}
	public T peek() throws StackUnderflowException
	{
		if(isEmptyStack())
			throw new StackUnderflowException();
		
		return (T) list[stackTop -1];
	}
	public void pop() throws StackUnderflowException
	{
		if(isEmptyStack())
			throw new StackUnderflowException();
		
		stackTop--;
		list[stackTop] = null;
	}
}

