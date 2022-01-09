import java.util.*; 
import java.util.Queue;
class StackUsingQueue {
	static class Stack{
	 Queue<Integer> q1 = new LinkedList<Integer>(); 
	 Queue<Integer> q2 = new LinkedList<Integer>();
	 int curr_size;
	 Stack(){ //method is we take 2 queues 1 with 3 elements and another is empty queue and to empty queue we 
		 curr_size=0;//we add last element to q2 now q1 contains 3 ele and q2 contains 1 element
	 }//we add all q1 elements to q2 now q1 is empty q2 is full with 2 ele
	 void push(int x){ //we swap names of q1 and q2...q1 becomes q2 and q2 becomes q1 thats it
		 curr_size++;//we do all pop(),top() etc operations on q1 this implementing stack using 2 queue
		 q2.add(x);
	 while(!q1.isEmpty()){
		 q2.add(q1.peek());
		 q1.remove();
	 }
	 Queue<Integer>q=q1;
	 q1=q2;q2=q;
	 }
	 void pop(){
		 if(q1.isEmpty())
			 return;
		 q1.remove();
		 curr_size--;
	 }
	 int top(){
		 if(q1.isEmpty())
			 return -1;
		 return q1.peek();
	 }
	 int size(){
		 return curr_size;
	 }
 }
	 public static void main(String args[]){
			Stack s = new Stack(); 
			s.push(10);
			s.push(5);
			s.push(15);
			s.push(20);
			System.out.println("current size: " + s.size()); 
			System.out.println(s.top()); 
			s.pop(); 
			System.out.println(s.top()); 
			System.out.println(s.top()); 
			System.out.println("current size: " + s.size()); 
	 }
	 }
		 
	
	 

