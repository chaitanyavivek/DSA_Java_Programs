class Node{
	int data;
	Node next;
	Node(int x){
		data=x;          
		next=null;        
	}
}
public class ReverseLLIterative {
	public static void main(String args[]){
		Node head=new Node(10);
		head.next=new Node(20);
		head.next.next=new Node(30);
		head.next.next.next=new Node(40);
		printlist(head);
		head=reverseList(head);
		printlist(head);
}
	static Node reverseList(Node head){
	Node curr=head;
	Node prev=null;  //for understanding refer book
	while(curr!=null){
		Node next=curr.next;
		curr.next=prev;
		prev=curr;
		curr=next;	
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
