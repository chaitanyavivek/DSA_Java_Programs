class Node{
	int data;
	Node next;
	Node(int x){
		data=x;           //1st method using len and formula
		next=null;        
	}
}
public class NthnodeFromEnd {
	public static void main(String args[]){
		Node head=new Node(10);
		head.next=new Node(20);
		head.next.next=new Node(30);
		head.next.next.next=new Node(40);
		head.next.next.next.next=new Node(50);
		printlist(head);
		System.out.println("Nth node from end of linked list is");
		printNthnodeFromEnd(head,2);
	}
	static void printNthnodeFromEnd(Node head,int x){
		int len=0;
		for(Node curr=head;curr!=null;curr=curr.next)
			len++;
		if(len<x)return;
		Node curr=head;
		for(int i=1;i<len-x+1;i++)
			curr=curr.next;
		System.out.println(curr.data);
	}
	public static void printlist(Node head){
		Node curr=head;
		while(curr!=null){
			System.out.println(curr.data);
			curr=curr.next;
		}System.out.println();
		
	}
}


