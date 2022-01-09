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
public class LevelOrderTraversal {
public static void main(String args[]){
	Node root=new Node(10);
    root.left=new Node(20);
    root.right=new Node(30);
	root.left.left=new Node(40);
    root.left.right=new Node(50);
	root.right.right=new Node(70);
    printLevel(root);
} 
public static void printLevel(Node root){
	Queue<Node>q=new LinkedList<>();//this uses queue data structure 1st we push root node and print it
	q.add(root);//next root comes out and pushes chilf nodes and print left and right pops them out
	while(q.isEmpty()==false){ //and pushes sub nodes and prints them and pops them like this process continues
		Node curr=q.poll();
		System.out.print(curr.key+" ");
		if(curr.left!=null)
			q.add(curr.left);
		if(curr.right!=null)
			q.add(curr.right);
	}
}
	}
	


