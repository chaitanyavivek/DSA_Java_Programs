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
public class MaxBinaryTree {
	public static void main(String args[]){
	    Node root=new Node(10);
    	root.left=new Node(20);
    	root.right=new Node(30);
    	root.left.left=new Node(40);
    	root.left.right=new Node(50);
    	root.right.right=new Node(60);  //o.p returns 6 as there are 6 nodes refer book for process
        System.out.println(getMax(root));  //this is done is using recursion
     } 
	static int getMax(Node root){
		if(root==null)
			return Integer.MIN_VALUE;
		else
			return Math.max(root.key, Math.max(getMax(root.left),getMax(root.right)));
	}

}
