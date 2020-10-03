// Tej Vyas
// CSC - 236 - 64
// Lab 5

import java.util.Random;
import java.text.DecimalFormat;
import java.text.NumberFormat;

public class MCCAirport 
{
	public final static double LANDING_TIME = 3;
	public final static double TAKE_OFF_TIME = 2;
	public final static double LANDING_RATE  = 10;
	public final static double TAKE_OFF_RATE = 10;
	public final static int ITERATIONS = 1440;
	
	// Method that creates Random Numbers
	public static boolean randomGenerator(double number)
	{
		// Random Number Generator
		Random generator = new Random(System.currentTimeMillis());
		if(Math.random() < (number / 60))
			return true;
		else
			return false;
	}
	// returns true if the time out - time in is greater than maxTime
	public static boolean planefailure(int element, int i, int maxTime)
	{
		if(i - element > maxTime)
			return true;
		
		else
			return false;
	}
	public static void main(String[] args)
	{
		int landingQueueTime = 0;
		int takeOffQueueTime = 0;
		int landedPlanes = 0;
		int takeOffPlanes = 0;
		int maxTime = 10;
		
		// Landing and TakeOff ArrayQueues
		ArrayQueue<Integer> landingQueue = new ArrayQueue<Integer>();
		ArrayQueue<Integer> takeoffQueue = new ArrayQueue<Integer>();
	     
		// Creates Iterations
	    for(int i = 0; i < ITERATIONS; ++i)
	    {
	    	// Enqueues random number in landingQueue
	    	if(randomGenerator(LANDING_RATE))
	        {
	    		landingQueue.enqueue(i);
	        }	         
	    	// Enqueues random number in takeOffQueue
	    	if(randomGenerator(TAKE_OFF_RATE))
	    	{
	    		takeoffQueue.enqueue(i);
	    	}
	    	
	    	while(true)
	    	{
	    		while(!landingQueue.isEmpty() && planefailure(landingQueue.peek(), i, maxTime))
	    		{
	    			landingQueue.dequeue();
	    		}
	    		if(!landingQueue.isEmpty())
	    		{
	    			int temp = landingQueue.peek();
	    			landingQueue.dequeue();
	    			landingQueueTime += (i - temp);
	    			landedPlanes++;
	    			
	    			int j;
	    			for(j = i; j < LANDING_TIME + i && j < ITERATIONS; ++j)
	    			{
	    				if(randomGenerator(LANDING_RATE))
	    				{
	    					landingQueue.enqueue(j);
	    				}
	    				if(randomGenerator(TAKE_OFF_RATE))
	    				{
	    					takeoffQueue.enqueue(j);
	    				}
	    			}
	    			i = j;
	    		}
	    		if(i >= ITERATIONS)
	    			break;
	    			    		
	    		else
	    		{
	    			break;
	    		}
	    	}
	    	
	    	// Takes TakOff Time
	    	if(!takeoffQueue.isEmpty())
	    	{
	    		int temp = takeoffQueue.peek();
	    		takeoffQueue.dequeue();
	    		takeOffPlanes++;
	    		takeOffQueueTime += (i - temp);
	    		int j;
	    		for(j = i; j < TAKE_OFF_TIME + i && j < ITERATIONS; ++j)
	    		{
	    			if(randomGenerator(LANDING_RATE))
	    			{
	    				landingQueue.enqueue(j);
	        		}
	    			if(randomGenerator(TAKE_OFF_RATE))
	    			{
	    				takeoffQueue.enqueue(j);
	    			}
	    		}
	    		i = j;
	    	}
	    }
	    // 
	    while(!landingQueue.isEmpty() && planefailure(landingQueue.peek(), ITERATIONS, maxTime))
	    {
	    	landingQueue.dequeue();
	    }
	    // Creates decimal format of 6 digits after decimal point
	    NumberFormat decimal = new DecimalFormat("#0.000000");   
	  
	    System.out.println("Average landing queue length: " + decimal.format((double)landedPlanes/ITERATIONS));
	    System.out.println("Average take off queue length: " + decimal.format((double)takeOffPlanes/ITERATIONS));
	    System.out.println("Average landing queue time: " + decimal.format(landingQueueTime / (double)landedPlanes));
	    System.out.println("Average take off queue time: " + decimal.format(takeOffQueueTime / (double)takeOffPlanes));
	}
	
}

