// Tej Vyas
// CSC 236

public class HeapDemo 
{int i;
private int[] heap;

     System.out.print("\nHeap = ");
     for (int i = 0; i < 10; i++)
      System.out.print(heap[i] +" ");
    System.out.println();
//to remove the two minimum value elements:

//Create object of Heap class say h

Heap h=new h();

System.out.println("Min Element : "+ h.deleteMin()); 
//where deleteMin() is

public int deleteMin()
{
    int keyItem = heap[0];
    delete{
 if (isEmpty() )
       throw new NoSuchElementException("Underflow Exception");
    int keyItem = heap[ind];
    heap[ind] = heap[heapSize - 1];
    heapSize--;
    heapifyDown(ind);        
      }
    return keyItem;
}
 }     
//Heapify Down is

private void heapifyDown(int ind)
 {
   int child;
   int tmp = heap[ ind ];
  while (kthChild(ind, 1) < heapSize)
  {
       child = minChild(ind);
       if (heap[child] < tmp)
             heap[ind] = heap[child];
         else
             break;
         ind = child;
   }
     heap[ind] = tmp;
 }

