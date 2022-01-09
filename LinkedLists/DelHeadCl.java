class Node{
	int data;
	Node next;
	Node(int x){
		data=x;
		next=null;
	}
}
public class DelHeadCl {
	public static void main(String args[]){
		Node head=new Node(10);
		head.next=new Node(20);
		head.next.next=new Node(30);
		head.next.next.next=new Node(40);
		head.next.next.next.next=head;
		head=delHead(head);
		printlist(head);	
	}
static Node delHead(Node head){
	if(head==null)
		return null;
	if(head.next==head)
		return null;
	Node curr=head;
	while(curr.next!=head)
		curr=curr.next;
	curr.next=head.next;
	return (curr.next);				
}
public static void printlist(Node head){
	if(head==null)
		return;
	System.out.println(head.data);
	for(Node r=head.next;r!=head;r=r.next)
		System.out.println(r.data);
}
}
