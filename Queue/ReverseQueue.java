import java.util.LinkedList;
import java.io.*;
import java.util.Queue;
import java.util.Stack; 
public class ReverseQueue {//method is we print elemennts from queueu and add them stack them to stack so when 
	static Queue<Integer>q;//we pop elements from stack we get in reverse order.we add reverse order elements
	public static void print(){  //again to the queue
		for(Integer x:q){
			System.out.println(x+" ");    
		}
	}
	static void Queuereverse(){
		Stack<Integer>stack=new Stack<>();
		while(!q.isEmpty()){
			stack.add(q.peek());
			q.remove();		
		}
	while(!stack.isEmpty()){
		q.add(stack.peek());
		stack.pop();
	}		
}
	public static void main(String args[]){
		q=new LinkedList<Integer>();
		q.add(12);
		q.add(15);
		q.add(20);
		Queuereverse();
		print();	
		}
}
//recursive code
//static void reverse(Queue<Integer>q){
//int x=q.peek();
//q.remove;  //method is we store 1st element in x and removee that element and reverse next 3 elements
//reverse(q); //q.add(x); //lastly we we add that x element;
//}