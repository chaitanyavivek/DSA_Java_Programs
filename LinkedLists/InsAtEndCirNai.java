class Node{
	int data;
	Node next;
	Node(int x){
		data=x;
		next=null;
	}
}
public class InsAtEndCirNai {
	public static void main(String args[]){
		Node head=new Node(10);
		head.next=new Node(20);
		head.next.next=new Node(30);
		head.next.next.next=new Node(40);
		head.next.next.next.next=head;
		head=insertEnd(head,15);
		printlist(head);
	}
static Node insertEnd(Node head,int x){
	Node temp=new Node(x);
	if(head==null){
		temp.next=temp;
		return temp;
	}
	else{
		Node curr=head;
		while(curr.next!=head)
			curr=curr.next;
		curr.next=temp;
		temp.next=head;
		return head;  //main diff btwn beg&end is this line. for beg its retrun temp. for this its return head
		
	}
}
public static void printlist(Node head){
	System.out.println(head.data);
	for(Node r=head.next;r!=head;r=r.next)
		System.out.println(r.data);
}
}
