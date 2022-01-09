import java.util.*;
import java.io.*;
import java.lang.*;
class Node  //1st we assign min value as -infy and we do preorder traversal we compare left and prev
{  //if left is greater we go to root and update the prev value from -infy to prev if its greater we go to
  int key;  //right and update prev as root so like this we do if all are true we say its bst..
  Node left;                //for more info check notes
  Node right; 
  Node(int k){                                              
      key=k;
      left=right=null;
  }              
}
public class CheckForBst {
	static int prev=Integer.MIN_VALUE;
	public static boolean isBst(Node root){
		if(root==null)
			return true;
		if(isBst(root.left)==false)
			return false;
		if(root.key>=prev)
			return true;
		prev=root.key;
		return isBst(root.right);
	}
	public static void main(String args[]){
		Node root=new Node(4);
		root.left=new Node(2);
		root.right=new Node(5);
		root.left.left=new Node(1);
		root.right.right=new Node(5);
		if(isBst(root))
			System.out.println("IS BST");
		else
			System.out.println("NOT A BST");
			
			
		}
	}


