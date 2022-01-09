import java.util.*;
import java.io.*;
import java.lang.*;

class Node{
	int key;
	Node left;
	Node right;
	Node(int k){
		key=k;
	}
}
public class BTtoDll {
	public static void main(String args[]){
	Node root=new Node(10);
	root.left=new Node(5);
	root.right=new Node(20);
	root.right.left=new Node(30);
	root.right.right=new Node(35);
	Node head=binarytreeToDll(root);
	printlist(head);
}
static Node prev=null;
	public static Node  binarytreeToDll(Node root){
		if(root==null)
			return root;
		Node head=binarytreeToDll(root.left);
		if(prev==null){
			head=root;
		}
		else{
			root.left=prev;
			prev.right=root;
		}
		prev=root;
		binarytreeToDll(root.right);
	    return head;
}
public static void printlist(Node head){
	Node curr=head;
	while(curr!=null){
		System.out.print(curr.key+" ");
		curr=curr.right;
	}	
}		
	}
