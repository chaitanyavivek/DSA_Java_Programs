class Node{
		  int key; 
		  Node left; 
		  Node right; 
		  Node(int k){
		      key=k;
		      left=right=null;
		  }	
}
public class LeftViewBinary {
	public static void main(String args[]){
    Node root=new Node(10);
	root.left=new Node(20);
	root.right=new Node(30);
	root.right.left=new Node(40);
	root.right.right=new Node(50);
	printLeftView(root);
	}
static int maxlevel=0;
static void printLeft(Node root,int level){
	if(root==null)
		return ;
	if(level>maxlevel){
		System.out.print(root.key+" ");
		maxlevel=level;
	}
	printLeft(root.left,level+1);
	printLeft(root.right,level+1);
}
static void printLeftView(Node root){
	printLeft(root,1);
}
}
