class Node{
	int data;
	Node next;
	Node(int x){
		data=x;          
		next=null;        
	}
}
public class DeleteNodewithPointer {
	public static void main(String args[]){
		Node head=new Node(10);
		head.next=new Node(20);
		Node ptr=new Node(30);
		head.next.next=ptr;
		head.next.next.next=new Node(40);
		head.next.next.next.next=new Node(50);
		printlist(head);
		deleteNode(ptr);
		printlist(head);
}
static void deleteNode(Node ptr){
    ptr.data=ptr.next.data;
	ptr.next=ptr.next.next;
}
public static void printlist(Node head){
	Node curr=head;
	while(curr!=null){
		System.out.println(curr.data);
		curr=curr.next;
	}System.out.println();
	
}
}