// Tej Vyas
// CSC 236

public interface HeapPriorityQueue
{
	  public boolean isEmpty();
	  // Determines whether this priority queue is empty.
	  // Postcondition:  Returns true if it is empty

	  public boolean isFull();
	  // Determines whether this priority queue is full.
	  // Postcondition:  Returns true if the priority queue is full

	  public void enqueue(Comparable item);
	  // Adds item to this priority queue.
	  // Postcondition: Adds item to the priority queue
	  // throws HeapOverflow Exception if the PQ is full

	  public Comparable dequeue();
	  // Removes element with highest priority from this priority queue
	  // and returns a reference to it
	  // Postconditions: If (this priority queue is empty)
	  //                   throws HeapUnderflowException if
	  // 					tried to remove from empty PQ
	  //                 Else
	  //                   Highest priority element has been removed.
	  //                   Return value with highest priority.
	  private void reheapifyUpward(Comparable item);
	  // Current lastIndex position is empty
	  // Inserts item into the tree and ensures shape and order properties
	  private void reheapifyDownward(Comparable item);
	  // Current root position is "empty";
	  // Inserts item into the tree and ensures shape and order properties
	  private reposition();
	  //to reshuffle the position

	}


