import java.util.*;
import java.io.*;
import java.lang.*;
class Node{
		  int key; 
		  Node left; 
		  Node right; 
		  Node(int k){
		      key=k;
		      left=right=null;
		  }	
}
public class MaxWidthBt {
		public static void main(String args[]){
			Node root=new Node(8);
			root.left=new Node(12);
			root.right=new Node(5);
			root.left.left=new Node(13);
			root.left.right=new Node(14);
			root.right.right=new Node(16);
			root.right.right.right=new Node(17);
			System.out.print(maxWidth(root));
}
public static int maxWidth(Node root){
	if(root==null)
		return 0;
Queue<Node>q=new LinkedList<>();
int res=0;
q.add(root);
while(q.isEmpty()==false){
	int count=q.size();
	res=Math.max(res, count);
	for(int i=0;i<count;i++){
		Node curr=q.poll();
		if(curr.left!=null)
			q.add(root.left);
		if(curr.right!=null)
			q.add(root.right);
	}
}
return res;
}
}
