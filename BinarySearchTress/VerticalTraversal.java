import java.util.*;
import java.io.*;
import java.lang.*;

class Node {
    int key;
    Node left, right; 
    Node(int x)          
    {
        key = x;
        left = right = null;
    }
}

class Pair{
    Node node;
    int hd;
    Pair(Node n,int h){node=n;hd=h;}
}

public class VerticalTraversal {
	static void verticalTraversal(Node root){
		Queue<Pair>q=new LinkedList<>();//for more explantion refer notes
		Map<Integer,ArrayList<Integer>>mp=new TreeMap<>();
		q.add(new Pair(root,0));
		while(!q.isEmpty()){
			Pair p=q.poll(); //hd=horizontal distance
			Node curr=p.node;//this if part is for if map contains value get from here
			int hd=p.hd;  //if map doesnt contain value we create arrayList and add key and hd
			if(mp.containsKey(hd))
				mp.get(hd).add(curr.key);
			else{
				ArrayList<Integer>al=new ArrayList<>();
				al.add(curr.key);
				mp.put(hd, al);
			}
			if(curr.left!=null)
				q.add(new Pair(curr.left,hd-1));
			if(curr.right!=null)
				q.add(new Pair(curr.right,hd+1));	 
		}
		for(Map.Entry<Integer, ArrayList<Integer>>p:mp.entrySet()){
		ArrayList<Integer>al=p.getValue();
		for(int x:al)
			System.out.println(x+ " ");
		System.out.println();				
		}		
	}
	public static void main(String args[]){
		Node root = new Node(10);  
        root.left = new Node(20); 
        root.right = new Node(30);  
        root.left.left = new Node(40);
        root.left.right = new Node(50);
        verticalTraversal(root);
	}     
	}
	


