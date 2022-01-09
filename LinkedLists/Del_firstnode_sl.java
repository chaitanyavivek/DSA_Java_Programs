class Node{
	int data;
	Node next;
	Node(int x){
		data=x;
		next=null;
	}
}
public class Del_firstnode_sl {
	public static void main(String args[]){
		Node head=new Node(10);
		head.next=new Node(20);
		head.next.next=new Node(30);
		printlist(head);
		head=deleteHead(head);
		printlist(head);
		}
	static Node deleteHead(Node head){
		if(head==null)
			return null;
		else{
			return head.next;
		}
		}
	public static void printlist(Node head){
		Node curr=head;
        while(curr!=null){
        System.out.print(curr.data+"\n");
        curr=curr.next;
    }System.out.println();
    }
	}


