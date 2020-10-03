// Tej Vyas
// CSC - 236 - 64
// Lab 5

public class ArrayQueue<T>
{
	private int maxQueueSize;
	private int count;
	private int queueFront;
	private int queueRear;
	private T[] list;
	
	public ArrayQueue()
	{
		maxQueueSize = 100;
		count = 0;
		queueFront = 0;
		queueRear = -1;
		list = (T[]) new Object[maxQueueSize];		
	}
	public boolean isEmpty()
	{
		return (count == 0);
	}
	public int count()
	{
		return count;
	}
	public T peek() 
	{
		if(isEmpty())
			return null;
		
		return list[queueFront];
	}
	public T dequeue()
    {
		if (isEmpty())
            return null;
		
        T temp = list[queueFront];
        list[queueFront] = null;
        queueFront = (queueFront + 1) % list.length;
        count--;
        return temp;
    }
	public void enqueue(T queueElement)
	{
		queueRear = (queueRear + 1) % list.length;
		list[queueRear] = queueElement;
		count++;
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	

}
