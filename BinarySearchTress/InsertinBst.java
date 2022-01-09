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


class InsertinBst { 
    
    public static void main(String args[]) 
    { 
        Node root=new Node(10);
    	root.left=new Node(5);
    	root.right=new Node(15);
    	root.right.left=new Node(12);
    	root.right.right=new Node(18);
    	int x=20;
    	
    	root=insert(root,x);
	    inorder(root);
    } 
    
    public static Node insert(Node root, int x){
        Node temp=new Node(x);
        Node parent=null,curr=root;//we use this parent at last to link new node and before node this parent
        while(curr!=null){                 //stores reference
            parent=curr;
            if(x>curr.key)
                curr=curr.left;
            else if(x<curr.key)
                curr=curr.right;
            else
                return root;
        }
        if(parent==null)
            return temp;
        if(x>parent.key)
            parent.left=temp;
        else
            parent.right=temp;//here new node and and parent node are connected
        return root;
    }
    
    public static void inorder(Node root){
        if(root!=null){
            inorder(root.left);
            System.out.print(root.key+" ");
            inorder(root.right);
        }    
    }
} 

/* RECURSIVE CODE 
public static Node insert(Node root,int x){
if(root==null)
return new node(x);
else if(x>root.key)       rem everything is same above and bottom
root.right=insert(root.right,x)
else
root.left=insert(root.left,x)
return root
*/


