import java.util.*;
import java.io.*;
import java.lang.*;
class Node{
	int key;
	Node left,right;
	Node(int x){
		key=x;
	}
}
public class SearchinBst {
public static void main(String args[]){
	Node root=new Node(20);
	root.left=new Node(15);
	root.right=new Node(30);
	root.left.left=new Node(12);
	root.left.right=new Node(18);
	root.left.left.left=new Node(7);
	root.right.right=new Node(40);
	root.right.right.left=new Node(35);
	root.right.right.right=new Node(50);
	root.right.right.right.right=new Node(80);
	int x=18;
	if(search(root,x))
		System.out.println("Found");
	else
		System.out.println("Not Found");
}
static boolean search(Node root,int x){
	while(root!=null){
		if(root.key==x)
			return true;
		else if(x>root.key)
			root=root.right;
		else
			root=root.left;
	}
	return false;
}
}
/* RECURSIVE CODE
static boolean search(Node rooot,int x){
if(root==null) return false;
if(root.key==x) return true;
else if(x>root.key) return search(root.right,x);
else return search(root.left,x);
} */
