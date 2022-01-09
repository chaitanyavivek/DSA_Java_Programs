class Node{
	int data;
	Node next;
	Node(int x){
		data=x;           //this method take 0(n) tc becoz we need multiple traveserls we can
		next=null;        // do by single traversr in 0(1) by taking single refernece
	}
}
public class MiddleLlEffi {
	public static void main(String args[]){
		Node head=new Node(10);
		head.next=new Node(20);
		head.next.next=new Node(30);
		head.next.next.next=new Node(40);
		head.next.next.next.next=new Node(50);
		printlist(head);
		System.out.println("Middle element in the linked list is");
	    printMiddle(head);
		
	}
	static void printMiddle(Node head){
		if(head==null)return;
		Node slow=head,fast=head;
		while(fast!=null&&fast.next!=null){
			fast=fast.next.next;
			slow=slow.next;
		}
		System.out.println(slow.data);
			
	}
	public static void printlist(Node head){
		Node curr=head;
		while(curr!=null){
			System.out.println(curr.data);
			curr=curr.next;	
		}System.out.println();
			
	}

}
