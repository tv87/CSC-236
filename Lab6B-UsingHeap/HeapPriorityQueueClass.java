// Tej Vyas
// CSC 236

public class HeapPriorityQueueClass 
{
	  private Comparable[] elements; 
	  private int lastIndex;          
	  private int maxIndex;         
	  
	  public HeapPriorityQueueClass(int maxSize)
	  {
	    elements = new Comparable[maxSize];
	    lastIndex = -1;
	    maxIndex = maxSize - 1;
	  }    
	    public HeapPriorityQueueClass(int maxSize)
	    {
	    	maxSize = 250;
	    	elements = new Comparable[maxSize];
	    	lastIndex = -1;
	    	maxIndex = maxSize - 1;
	    }
	    public String toString()
	    {
	      String theHeap = new String("the heap is:\n");
	      for (int index = 0; index <= lastIndex; index++)
	        theHeap = theHeap + index + ". " + elements[index] + "\n";
	      return theHeap;
	    }
	    public void enqueue(Comparable item) throws PriQOverflowException
	    {
	      if (lastIndex == maxIndex)
	        throw new PriQOverflowException("Priority queue is full");
	      else
	      {
	        lastIndex = lastIndex + 1;
	        reheapUp(item);
	      }
	    }
	    public Comparable dequeue() throws PriQUnderflowException
	    {
	      Comparable hold;      // item to be dequeued and returned
	      Comparable toMove;    // item to move down heap

	      if (lastIndex == -1)
	        throw new PriQUnderflowException("Priority queue is empty");
	      else
	      {
	        hold = elements[0];            // remember item to be returned
	        toMove = elements[lastIndex];  // item to reheap down
	        lastIndex = lastIndex - 1;     // decrease priority queue size
	        reheapDown(toMove);            // rstore heap properties
	        return hold;                   // return largest element
	      }
	    }



}

