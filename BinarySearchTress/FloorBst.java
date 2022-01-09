import java.util.*;
import java.io.*;
import java.lang.*;

class Node  
{ 
  int key;  //floor means to find the greatest element in given tree compared to the value of x and if the x
  Node left; //is given from the element present in tree we return that element
  Node right; //ex 13 so greatest ele in tree after 13 is 12 so o/p suppose 15 given o/p will be 15 as it s prese
  Node(int k){                                              //in tree
      key=k;
      left=right=null;//we traverse a/c to given value of x whether to go right or left if we go right
  }               //we hold ref of the above node
}
public class FloorBst {
	public static void main(String args[]) 
    { 
		  Node root=new Node(10);
	    	root.left=new Node(5);
	    	root.right=new Node(15);
	    	root.right.left=new Node(12);
	    	root.right.right=new Node(18);
	    	int x=13;

	    	System.out.print("Floor: "+(floor(root,13).key));
    }
public static Node floor(Node root,int x){
	Node res=null;//ceil means value greater than given value ex if we give 13 ceil means we need find value
	while(root!=null){ //greater than 13 if they are 15,16 we consider 15 as its 1st highest
		if(root.key==x)
			return root;//this below code is for ceil of bst remaining everything is same expect that updated lines
		else if(x<root.key) //else if(x>root.key)
			root=root.left;   //root=root.right;
		else{
			res=root;       //res=root
			root=root.right;	//root=root.left;
		}
	}
	return res;
}
}
