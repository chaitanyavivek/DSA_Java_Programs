import java.util.*;
import java.io.*;
import java.lang.*;

class Node {//top view is ntng but we add hd,values to queue and pop them out and enqueue its children like level
    int key;//order traversal.and print the values using map entry.
    Node left, right; //Suppose if there are same values like (0,50),(0,30) we take only (0,50) as we 
    Node(int x)          //want to print only top order
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

class TopView
{
    
    public static void topView(Node root){
        Queue<Pair> q=new LinkedList<>();
        Map<Integer,Integer> mp=new TreeMap<>();
        q.add(new Pair(root,0));
        while(q.isEmpty()==false){
            Pair p=q.poll();
            Node curr=p.node;
            int hd=p.hd;
            if(mp.containsKey(hd)==false)//if map does not contains those values we add them to map
                mp.put(hd,curr.key);//and we move to left and right
            if(curr.left!=null)
                q.add(new Pair(curr.left,hd-1));
            if(curr.right!=null)
                q.add(new Pair(curr.right,hd+1));
        }
        for(Map.Entry<Integer,Integer> x:mp.entrySet()){
                System.out.print(x.getValue()+" ");
        }
    }
    
    public static void main(String args[])
    {
        Node root = new Node(10);  
        root.left = new Node(20);  
        root.right = new Node(30);  
        root.left.left = new Node(40);
        root.left.right = new Node(50);
        
        topView(root);
    }
}