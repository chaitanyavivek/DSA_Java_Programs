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
public class IterativeInorder {
	public static void main(String args[]){
		Node root=new Node(10);
		root.left=new Node(20);
		root.right=new Node(30);
		root.left.left=new Node(40);
		root.left.right=new Node(50);
	    iterativeInorder(root);
	}
static void iterativeInorder(Node root){
		Stack<Node>st=new Stack<Node>();
		Node curr=root;
		while(curr!=null || st.isEmpty()==false){
			while(curr!=null){
				st.push(curr);
				curr=curr.left;
			}
			curr=st.pop();
			System.out.print(curr.key+" ");
			curr=curr.right;
			}
		}
}
