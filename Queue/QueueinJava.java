import java.util.*;
import java.io.*;
import java.util.Queue;
class QueueinJava {
public static void main(String args[]){
  Queue<Integer>q=new LinkedList<>();	
	//Queue<Integer> q=new ArrayDeque<>();
	q.offer(10);
	q.offer(20);
	q.offer(30);
	System.out.println(q.peek());//gives 10 as o/p in queue peek means 1st added elemenr
	System.out.println(q.poll());//removes an 1st item o/p 10 and 20 30 remains in queue
	System.out.println(q.size());//2
}
}