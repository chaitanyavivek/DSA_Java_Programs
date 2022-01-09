class Node{
	int data;
	Node prev;
	Node next;
	Node(int x){
		data=x;
		next=null;
		prev=null;
	}
}
public class Del_firstnode_dl {
	public static void main(String args[]){
		    Node head=new Node(10);
	    	Node temp1=new Node(20);
	    	Node temp2=new Node(30);
	    	head.next=temp1;
	    	temp1.prev=head;
	    	temp1.next=temp2;
	    	temp2.prev=temp1;
	    	head=delHead(head);
	    	printlist(head);
	}
static Node delHead(Node Head){
	if(Head==null)
		return null;
	
	if(Head.next==null)
		return null;
	
	else{
		Head=Head.next;
		Head.prev=null;
		return Head;	
	}
}
public static void printlist(Node Head){
	Node curr=Head;
	while(curr!=null){
		System.out.println(curr.data+" ");
		curr=curr.next;
	}System.out.println();
}
}
