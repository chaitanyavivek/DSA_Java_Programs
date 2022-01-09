class Node{
	int data;
	Node next;
	Node(int x){
		data=x;
		next=null;
	}
}
public class Del_lastnode_sl { 
    
    public static void main(String args[]) 
    { 
        Node Head=new Node(10);
    	Head.next=new Node(20);
    	Head.next.next=new Node(30);
    	printlist(Head);
    	Head=dellastNode(Head);
	    printlist(Head);
    	
    } 
    
    static Node dellastNode(Node Head){
        if(Head==null)return null;
        if(Head.next==null)return null;
        Node curr=Head;
        while(curr.next.next!=null)
            curr=curr.next;
        curr.next=null;
        return Head;
    }
    public static void printlist(Node head){
        Node curr=head;
        while(curr!=null){
        System.out.print(curr.data+" ");
        curr=curr.next;
    }System.out.println();
    }
} 