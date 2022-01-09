class Node{
	int data;
	Node next;
	Node(int x){
		data=x;          
		next=null;        
	}
}
public class DetectLoopFloydWheel {
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
		Node slow=head;
		Node fast=head;
		while(fast!=null&&fast.next!=null){
			slow=slow.next;
		    fast=fast.next.next;
		    if(fast==slow){
		    	return true;
		    }
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
