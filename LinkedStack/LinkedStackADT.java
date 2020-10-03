// Tej Vyas
// CSC - 236 - 64
// Lab 4C

public interface LinkedStackADT<T>
{
	public String toString();
	public boolean isEmptyStack();
	public void push(T newItem);
	public T peek() throws StackUnderflowException;
	public T pop() throws StackUnderflowException;
}

