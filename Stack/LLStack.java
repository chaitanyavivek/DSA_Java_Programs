import java.io.*;
import java.util.*;
class Node{
    int data;
    Node next;
    Node(int d){
        data=d;
        next=null;
    }
}
class Stack3{
    Node head;
    int sz;
    Stack3(){
        head=null;
        sz=0;
    }
    void push(int x){//element to be added is stored in temp we connect temp to the head and return temp as head
        Node temp=new Node(x);
        temp.next=head;
        head=temp;
        sz++;
    }
    
    int pop(){
        if(head==null){return Integer.MAX_VALUE;}
        int res=head.data;//element to be deleted in stored in res and we move head to the next and remove res
        Node temp=head;  //and move head to the next and dec size
        head=head.next;
        sz--;
        return res;
    }
    
    int peek(){
        if(head==null){return Integer.MAX_VALUE;}
        return head.data;
    }
    
    int size(){
        return sz;
    }
    
    boolean isEmpty(){
        return head==null;
    }
}
    
public class LLStack {
	public static void main (String[] args)
	{
		Stack3 s=new Stack3();
	    s.push(5);
	    s.push(10);
	    s.push(20);
	    System.out.println(s.pop());
	    System.out.println(s.size());
	    System.out.println(s.peek());
	    System.out.println(s.isEmpty());
	}

}
