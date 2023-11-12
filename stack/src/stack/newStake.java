package stack;

import java.util.*;
import java.util.Stack;
public class newStake{

	public static void main(String [] args) 
	{
//		Stack<Integer> stack= new Stack<>();// this is generic
//		//Stack<Integer> stack [HEAP MEMORY]= new Stack<>();[STACK MEMORY]
//		stack.push(34);
//		stack.push(45);
//		stack.push(2);
//		stack.push(9);
//		stack.push(18);
//		
//	System.out.println(stack.pop());	
//	System.out.println(stack.pop());	
//	System.out.println(stack.pop());	
//	System.out.println(stack.pop());	
//	System.out.println(stack.pop());	
		
		//  ---------Stack ends  here
//		
//		//QUEUE IS AN INTER FACE
		

		
		Queue<Integer>queue =new LinkedList<>();
		queue.add(3);
		queue.add(6);
		queue.add(5);
		queue.add(19);
		queue.add(1);
		
		System.out.println(queue.peek()); // PEEK GIVING FIRST ELEMENT;
		System.out.println(queue.remove()); // removes the element;
		
		
		//When do we use stack and queue ?
		// 1. in a question to store result and use them later on.
		//2.Binary tree traversal uses stack and queue.
		// 3. dfs bsf.
		// dsf depth first search      bsf - breadth first search in  trees .
		
		
		
		
		Deque <Integer> deque = new ArrayDeque<>();
	//	ArrayDeque Constructs an empty array deque with an initial capacitysufficient to hold 16 elements.
       
		   /*
		* We cannot create instance of a Deque as it is an
		* interface, we can create instance of ArrayDeque or
		* LinkedList and assign it to Deque
		*/
		
		// in deque insrtion and deletion can happen from both ends.
		
		deque.add(89);
		deque.addFirst(50);
		deque.addLast(60);
		deque.add(89);
		deque.add(89);
		deque.removeFirst();
		deque.removeFirstOccurrence(89);
		
		//deque.removeFirstOccurrence removes first element 
		//Throws:ClassCastException - if the class of the specified elementis incompatible with 
		//this deque
		
		
		
		
	}
}
              