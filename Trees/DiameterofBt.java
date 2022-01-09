class Node{
	int key;
	Node left;
	Node right;
	Node(int k){
		key=k;
	}
}
public class DiameterofBt {
	public static void main(String args[]){
Node root=new Node(10);
root.left=new Node(20); //diametr of tree is nothing but max no of nodes on longest path btwn 2 leaf nodes
root.right=new Node(30);
root.right.left=new Node(40);
root.right.right=new Node(60);
root.right.left.left=new Node(50);
root.right.right.right=new Node(70);
System.out.println("height "+height(root));
System.out.println("Diameter "+res);
}
static int res=0;
public static int height(Node root){
	if(root==null)
		return 0;
	int lh=height(root.left);//we find height of tree which means height of left sub tree and height of right 
	int rh=height(root.right);//sub tree and find max btwn lh and rh and add 1
	res=Math.max(res, 1+lh+rh);
	return 1+Math.max(lh,rh);
}
}