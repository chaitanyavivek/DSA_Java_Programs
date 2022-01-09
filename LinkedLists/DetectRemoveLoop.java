class Node{
	int data;
	Node next;
	Node(int x){
		data=x;          
		next=null;        
	}
}
public class DetectRemoveLoop {
	public static void main(String args[]){
	Node head=new Node(10);
	head.next=new Node(20);
	head.next.next=new Node(30);
	head.next.next.next=new Node(40);
	head.next.next.next=head.next;
	detectRemoveLoop(head);
	}
	static void detectRemoveLoop(Node head){
		Node slow=head,fast=head;
		while(fast!=null&&fast.next!=null){
			slow=slow.next;
			fast=fast.next.next;
			if(slow==fast){
				break;
			}
		}
		if(slow!=fast)
			return;
		 slow=head;
		while(slow.next!=fast.next){
			slow=slow.next;
			fast=fast.next;	
		}
		fast.next=null;
	}
	public static void prinlist(Node head){
		Node curr=head;
		while(curr!=null){
			System.out.println(curr.data+" ");
			curr=curr.next;
		}System.out.println();	
	}

}