class Node{
	int data;
	Node next;
	Node(int x){
		data=x;
		next=null;
	}
}
public class Insert_at_middle{
	public static void main(String args[]){
		Node head=new Node(10);
		head.next=new Node(20);
		head.next.next=new Node(30);
		head=insertMiddle(head,2,50);
		printlist(head);
		
		}
	static Node insertMiddle(Node head,int pos,int data){
		Node temp=new Node(data);
		if(pos==1){
			temp.next=head;
			return temp;
		}
		Node curr=head;
		for(int i=1;i<=pos-2&&curr!=null;i++)
			curr=curr.next;
		if(curr==null)
			return head;
		temp.next=curr.next;
		curr.next=temp;
		return head;
	}
	public static void printlist(Node head){
        Node curr=head;
        while(curr!=null){
        System.out.print(curr.data+" ");
        curr=curr.next;
    }System.out.println();
    }
}