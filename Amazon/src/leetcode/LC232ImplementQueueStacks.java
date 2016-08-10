package leetcode;

import java.util.Stack;

public class LC232ImplementQueueStacks {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Queue queue = new Queue<Integer>();
		queue.push(1);
		queue.push(2);
		queue.push(3);
		System.out.println(queue.pop());
		queue.push(4);
		queue.push(5);
        System.out.println(queue.peek());
        queue.empty();
	}
	
	public static class Queue<E>{
		private Stack<E> stackIn= new Stack<E>();
		private Stack<E> stackOut = new Stack<E>();
    
		public void push(E element){
			stackIn.push(element);
		}
    
		E pop(){
			if(!stackOut.isEmpty())
				return stackOut.pop();
			else{
				while(!stackIn.isEmpty())
					stackOut.push(stackIn.pop());
				return stackOut.pop();
			}
		}
    
		E peek(){
			if(!stackOut.isEmpty())
				return stackOut.peek();
			else{
				while(!stackIn.isEmpty())
					stackOut.push(stackIn.pop());
				return stackOut.peek();
			}
		}
    
		void empty(){
			stackIn.empty();
			stackOut.empty();
		}
	}
}
