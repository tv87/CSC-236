// Tej Vyas
// CSC - 236 - 64
// Lab 4B

public interface ListStackADT<T> 
{
	public boolean isEmpty();
	public void ifEmpty() throws EmptyStackException;
	public void push(T value);
	public T peek() throws EmptyStackException;
	public T pop() throws EmptyStackException;
	public String toString();
}
