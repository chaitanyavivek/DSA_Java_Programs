class Node{
		  int key; 
		  Node left; 
		  Node right; 
		  Node(int k){
		      key=k;
		      left=right=null;
		  }	
}
public class CheckBalancedBinary {
	public static void main(String args[]){
		Node root=new Node(8);
		root.left=new Node(12);
		root.right=new Node(5);
		root.left.left=new Node(13);
		root.left.right=new Node(14);
		root.right.right=new Node(16);
		root.right.right.right=new Node(17);
		if (balancedBinary(root)>0)
			System.out.println("Balanced");
		else
			System.out.println("Not balanced");
	}
	static int balancedBinary(Node root){
		if(root==null)
			return 0;
		int lh=balancedBinary(root.left);
				if(lh==-1)
					return -1;
		int rh=balancedBinary(root.right);
				if(rh==-1)
					return -1;
		if(Math.abs(lh-rh)>1)
			return -1;
		else
			return Math.max(lh, rh)+1;
	}
		
	}


