class Node{
	int data;
	Node next;
	Node(int x){
		data=x;          
		next=null;        
	}
}
public class RecursiveReverseLl {
	public static void main(String args[]){
		Node head=new Node(10);
		head.next=new Node(20);
		head.next.next=new Node(30);
		head.next.next.next=new Node(40);
		printlist(head);
		head=recursiveRList(head);
		printlist(head);
}
	static Node recursiveRList(Node head){
		if(head==null||head.next==null)return head;   //symbol || represents logical OR
		Node rest_head=recursiveRList(head.next);
		Node rest_tail=head.next;
		rest_tail.next=head;
		head.next=null;
		return rest_head;	
	}
	public static void printlist(Node head){
		Node curr=head;
		while(curr!=null){
			System.out.println(curr.data);
			curr=curr.next;
		}System.out.println();
	}
}
