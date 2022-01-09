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
public class IterativePreorder {
	public static void main(String args[]){
		Node root=new Node(10);
		root.left=new Node(20);//idea is we print all left nodes instead of throwing them to the stack
		root.right=new Node(30);//so while printing left nodes we push left nodes right to the stack
		root.left.left=new Node(40);  //when stack becomes empty we bring all items out
		root.left.right=new Node(50);
	    iterativePreorder(root);
	
	}
	static void iterativePreorder(Node root){
		if(root==null)
			return;
		Stack<Node>st=new Stack<Node>();
		Node curr=root;
		while(curr!=null||st.isEmpty()==false){
			while(curr!=null){
				System.out.print(curr.key+" ");
				if(curr.right!=null)
					st.push(curr.right);
				curr=curr.left;
			}
			if(st.isEmpty()==false)
				curr=st.pop();
		}
	}

}
