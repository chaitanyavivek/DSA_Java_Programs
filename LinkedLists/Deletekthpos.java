class Node{
	int data;
	Node next;
	Node(int x){
		data=x;
		next=null;
	}
}
public class Deletekthpos {
	public static void main(String args[]){
		Node head=new Node(10);
		head.next=new Node(20);
		head.next.next=new Node(30);
		head.next.next.next=new Node(40);
		head.next.next.next.next=head;
		head=delkth(head,3);
		printlist(head);	
	}
static Node delkth(Node Head,int k){
	if(Head==null) 
		return Head;
	if(k==1)
		return deleteHead(Head);
	Node curr=Head;
	for(int i=0;i<k-2;i++)
		curr.next=curr.next.next;
	return Head;
}
static Node deleteHead(Node head){
	  if(head==null)return null;
	  if(head.next==head)
          return null;
	  head.data=head.next.data;
      head.next=head.next.next;
      return head;
}
public static void printlist(Node head){
	if(head==null)return;
	System.out.println(head.data);
	for(Node r=head.next;r!=head;r=r.next)
		System.out.println(r.data);
		
}				
				
}

