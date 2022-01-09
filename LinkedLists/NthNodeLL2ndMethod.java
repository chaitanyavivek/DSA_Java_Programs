class Node{
	int data;
	Node next;
	Node(int x){
		data=x;           //2nd method using 1st and 2nd ref
		next=null;        
	}
}
public class NthNodeLL2ndMethod {
	public static void main(String args[]){
		Node head=new Node(10);
		head.next=new Node(20);
		head.next.next=new Node(30);
		head.next.next.next=new Node(40);
		head.next.next.next.next=new Node(50);
		printlist(head);
		System.out.println("Nth node from end of linked list is");
		printNthFromEnd(head,4);
	}
	 static void printNthFromEnd(Node head,int n){
		 if(head==null)return;
		 Node first=head;
		 for(int i=0;i<n;i++){
			if(first==null)return;
			first=first.next;
		 }
			 Node second=head;
			 while(first!=null){
				 second=second.next;
				 first=first.next;
			 }
			 System.out.println(second.data);
	 }
	 public static void printlist(Node head){
			Node curr=head;
			while(curr!=null){
				System.out.println(curr.data);
				curr=curr.next;
			}System.out.println();
			
		}
}
