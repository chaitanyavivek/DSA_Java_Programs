class Node{
	int data;
	Node next;
	Node(int x){
		data=x;          
		next=null;        
	}
}
public class RevLlGroupSizeK {
	public static void main(String args[]){
		Node head=new Node(10);
		head.next=new Node(20);
		head.next.next=new Node(30);
		head.next.next.next=new Node(40);
		head.next.next.next.next=new Node(50);
		printlist(head);
		System.out.println("reverse linked list after grp size k");
		head=reverseLinkedlist(head,3);
		printlist(head);
}
static Node reverseLinkedlist(Node head,int k){
	Node curr=head;
	Node prev=null;
	Node next=null;
	int count=0;
	while(curr!=null&&count<k){
		next=curr.next;
		curr.next=prev;
		prev=curr;
		curr=next;
		count++;
	}
	if(next!=null){
	   Node rest_head=reverseLinkedlist(next,k);
	   head.next=rest_head;
	}
	return prev;
}
public static void printlist(Node head){
	Node curr=head;
	while(curr!=null){
		System.out.println(curr.data);
		curr=curr.next;
	}System.out.println();
	}
}
	
