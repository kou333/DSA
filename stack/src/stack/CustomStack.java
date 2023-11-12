package stack;

public class CustomStack {
	
	protected int[] data;
	private static final int Default_Size=10;
   
	// static because we will  we want same size for the obejcts of the custom class.
	//private because we dont want ohters to cahnge it directly
	// final becuase we also cant changge it ( developers).
	
	
	int ptr=-1;
	public CustomStack() {
		this(Default_Size);
		// calling a constructor with another constructor
		//This has two use cases 1. to reference a data type which is this.data=new int[size];
		// 2nd use case is to call a data type as a constructor public CustomStack(int size) takes
		// an integer argument so its been getting called.
	}
	
	public CustomStack(int size)
	{
		this.data=new int[size];
		
	}
	
	public boolean push(int item)
	{
		
		 if(isFull())
		 {
			 System.out.println("stack  is full ");
			 return false;
			 
		 }
		ptr++;
		data[ptr]=item;
		return true;
	}
      
	public int pop() throws StackException {
		if (isEmpty())
		{
			throw new StackException("cannot pop from an empty stack");
		}
		   int removed=data[ptr];
		   ptr--;
		   return removed;
		 // return data[ptr--];
		
	}
	
	
	private boolean isFull() {
		// TODO Auto-generated method stub
		
		return ptr==data.length-1;//ptr is at last index
	}
	
	public int peek() throws StackException{
		if (isEmpty())
		{
			throw new StackException("cannot peek ");
		}
		
		return data[ptr];
	}
	 
	private boolean isEmpty() {
		return ptr==-1; 
	}

}