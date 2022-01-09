class Node{
	int data;
	Node next;
	Node(int x){
		data=x;
		next=null;
	}
}
public class InsertBegClEffi {
	public static void main(String args[]){
		Node head=new Node(10);
		head.next=new Node(20);
		head.next.next=new Node(30);
		head.next.next.next=new Node(40);
		head.next.next.next.next=head;
		head=insertBegin(head,15);
		printlist(head);		
	}

static Node insertBegin(Node head,int x){
	Node temp=new Node(x);
	if(head==null){
		temp.next=temp;
		return temp;
	}
	else{
		temp.next=head.next;
		head.next=temp;
		int t=head.data;
		head.data=temp.data;
		temp.data=t;
		return head;
	}
}
	public static void printlist(Node head){
		if(head==null){
			return;
		}
		
		System.out.println(head.data);
		for(Node r=head.next;r!=head;r=r.next)
		System.out.println(r.data);
		
		    }

}