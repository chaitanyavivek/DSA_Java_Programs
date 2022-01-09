import java.io.*;
import java.util.*;
import java.util.Stack;
class Stack4{
	Stack<Integer>ms;
	Stack<Integer>as;
Stack4(){
	ms=new Stack<>();
	as=new Stack<>();
}
void push(int x){
	if(ms.isEmpty()){
		ms.add(x);
		as.add(x);
		return;
	}
	ms.add(x);
	if(ms.peek()<=as.peek())
		as.add(x);	
	}
void pop(){
	if(ms.peek()==as.peek())
		ms.pop();
	    as.pop();
}
int top(){
	return ms.peek();
}
int getMin(){
	return as.peek();
}
}
public class getMin {
	public static void main(String args[]){
		Stack4 s=new Stack4();
		s.push(4);
		s.push(5);
		s.push(8);
		s.push(1);
		s.pop();
		System.out.println("Minimum Element from stack: "+s.getMin());
	}
}
