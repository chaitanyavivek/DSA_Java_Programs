class Node{
	int data;
	Node next;
	Node(int x){
		data=x;
		next=null;
	}
}

public class InsertatBegSL {
	static Node insertBeg(Node head,int x){
		Node temp=new Node(x);
		temp.next=head;
		return temp;
	}
	public static void main(String args[]){
		Node head=null;
		head=insertBeg(head,30);
		head=insertBeg(head,20);
		head=insertBeg(head,10);
		printlist(head);	
	}
	public static void printlist(Node head){
		Node curr=head;
		while(curr!=null){
			System.out.println(curr.data);
			curr=curr.next;
		}
	}

}
