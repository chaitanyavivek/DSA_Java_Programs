
	class Node{
		int data;
		Node next;
		Node prev;
		Node(int x){
			data=x;
		    next=null;
		    prev=null;
		}
	}
	public class DeleteLastDl {
		public static void main(String args[]){
		    Node head=new Node(10);
	    	Node temp1=new Node(20);
	    	Node temp2=new Node(30);
	    	head.next=temp1;
	    	temp1.prev=head;
	    	temp1.next=temp2;
	    	temp2.prev=temp1;
	    	head=delLast(head);
	    	printlist(head);
	}
		static Node delLast(Node head){
			if(head==null){
				return null;
			}
			if(head.next==null){
				return null;
			}
			Node curr=head;
			while(curr.next!=null)
			curr=curr.next;
			curr.prev.next=null;
			return head;
		}
		public static void printlist(Node Head){
			Node curr=Head;
			while(curr!=null){
				System.out.println(curr.data+" ");
				curr=curr.next;
			}System.out.println();
		}

	}

