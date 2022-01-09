import java.util.*;
import java.io.*;
import java.lang.*;

class Node  
{ 
  int key; 
  Node left; 
  Node right; 
  Node(int k){
      key=k;
      left=right=null;
  }
}
public class LevelOrderTraversalLine {
	public static void main(String args[]){
		Node root=new Node(10);
	    root.left=new Node(20);
	    root.right=new Node(30);
		root.left.left=new Node(40);
	    root.left.right=new Node(50);
		root.right.right=new Node(70);
	    printLevelLine(root);
	} 
	static void printLevelLine(Node root){
		if(root==null)
			return;
		Queue<Node>q=new LinkedList<>();
			q.add(root);
			q.add(null);//same like before but here we add null when ever it sees null it goes to next line
			while(q.size()>1){
				Node curr=q.poll();
				if(curr==null){
					System.out.println();
					q.add(null);
					continue;
				}
				System.out.print(curr.key+" ");
				if(curr.left!=null)
					q.add(curr.left);
				if(curr.right!=null)
					q.add(curr.right);
		}
	}
}
