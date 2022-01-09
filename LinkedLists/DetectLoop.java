class Node{
	int data;
	Node next;
	Node(int x){
		data=x;          
		next=null;        
	}
}
public class DetectLoop {
	public static void main(String args[]){
		Node head=new Node(10);
		head.next=new Node(20);
		head.next.next=new Node(30);
		head.next.next.next=head.next;
		if(isLoop(head))
			System.out.println("loop found");
		else
			System.out.println("loop not found");
	}
	static boolean isLoop(Node head){
		Node temp=new Node(0);
		Node curr=head;
		while(curr!=null){
			if(curr.next==null)
				return false;
			if(curr.next==temp)
				return true;
			Node curr_next=curr.next;
			curr.next=temp;
			curr=curr_next;		
		}
		return false;		
	}
	public static void printlist(Node head){
		Node curr=head;
		while(curr!=null){
			System.out.println(curr.data);
			curr=curr.next;
		}System.out.println();
		}

}
