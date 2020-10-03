// Tej Vyas
// CSC - 236 - 64
// Lab 4B

import java.util.*;

public class ListStackDataStrucClass<T> implements ListStackADT<T>
{
	public class StackNode<T>
	{
		private T value;
		private StackNode<T> next;	
	
	public StackNode()
	{
		this.value = null;
		this.next = null;
	}
	public StackNode(T val, StackNode<T> _next)
	{
		this.value = val;
		this.next = _next;		
	}
	public StackNode(StackNode<T> stack)
	{
		this.value = stack.getValue();
		this.next = stack.getNext();
	}
	public T getValue()
	{
		return value;
	}
	public StackNode<T> getNext()
	{
		return next;
	}
	public void setValue(T val)
	{
		this.value = val; 
	}
	public void setNext(StackNode<T> _next)
	{
		this.next = _next; 
	}
	}
	
	private StackNode<T> top;
	
	public ListStackDataStrucClass()
	{
		this.top = null;
	}
	public ListStackDataStrucClass(StackNode<T> stackTop)
	{
		this.top = stackTop;
	}
	public ListStackDataStrucClass(ListStackDataStrucClass<T> stack) throws EmptyStackException
	{
		top= null;
		
		try
		{
			if(!stack.isEmpty())
			{
				while(!stack.isEmpty())
					push((T)stack.pop());
			}

		}
		catch(EmptyStackException ese)
		{
			System.out.println(ese.getMessage());
		}
	}
	public StackNode<T> getTop()
	{
		return top;
	}
	public void setTop(StackNode<T> top)
	{
		this.top = top; 
	}
	public boolean isEmpty()
	{
		return (top == null);
	}
	public void ifEmpty() throws EmptyStackException
	{
		if(isEmpty())
			throw new EmptyStackException();
	}
	public void push(T value)
	{
		if(isEmpty())
			setTop(new StackNode<T>(value, null));
		else
		{
			StackNode<T> newNode;
			
			newNode = new StackNode<T>(value, getTop());
			
			setTop(newNode);
		}
	}
	public T peek() throws EmptyStackException
	{
		if(top == null)
			throw new EmptyStackException();
		else
			return getTop().getValue();
	}
	public T pop() throws EmptyStackException
	{
		if(top == null)
			throw new EmptyStackException();
		else
		{
			T element = getTop().getValue();
			setTop(getTop().getNext());
			return element;
		}
	}
	public String toString()
	{
		StringBuffer sb = new StringBuffer();

        sb.append("[ ");

        if (!isEmpty()) 
        {
        	StackNode<T> temp = getTop();
        	
        	while (temp != null) 
        	{
        		sb.append(temp.getValue() + " ");

        	}
        }
        sb.append("]");
        return sb.toString();
	}			
}


