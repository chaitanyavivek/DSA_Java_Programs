class Queue{
	int arr[];
	int front,cap,size;
	Queue(int c){
		arr=new int[c];
		cap=c;
		front=0;
		size=0;	
	}

int getFront(){
if(isEmpty())
	return -1;
else
	return front;
}
int getRear(){
	if(isEmpty())
		return -1;
	else
		return (front+size-1)%cap;
}
void enqueue(int x){
	if (isFull())
		return;
	int rear=getRear();
	rear=(rear+1)%cap;
	arr[rear]=x;
	size++;
}
void dequeue(){
	if(isEmpty())
		return;
	front=(front+1)%cap;
	size--;
}
}
public class ArrayQueue {
	public static void main(String args[]){
		Queue q=new Queue(1000);
		q.enqueue(10); 
		q.enqueue(20);
		q.enqueue(30);
		q.enqueue(40);
		System.out.println(dequeue() + " dequeued from queue\n"); 
		System.out.println("Front item is "		+ q.getFront());
		System.out.println("Rear item is "+ q.getRear());	
	}
}
