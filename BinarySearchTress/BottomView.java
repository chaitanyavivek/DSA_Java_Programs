import java.util.*;
import java.io.*;
import java.lang.*;

class Node {//same like top view but the main diff is override the node example if the values are like
    int key; //(-2,30),(-1,15),(0,30),(0,45),(1,55),(1,60),(2,25) we choose new values(among same values) as we need to
    Node left, right;  //print bottom view 
    Node(int x)  //we choose (-2,30),(-1,15),(0,45),(1,60),(2,25) this about bottom view and remaining all are same
    {                                          //like top view
        key = x;
        left = right = null;
    }
}

class Pair{
    Node node;
    int hd;
    Pair(Node n,int h){node=n;hd=h;}
}

class BottomView
{
    
    public static void topView(Node root){
        Queue<Pair> q=new LinkedList<>();
        Map<Integer,Integer> mp=new TreeMap<>();
        q.add(new Pair(root,0));
        while(q.isEmpty()==false){
            Pair p=q.poll();
            Node curr=p.node;
            int hd=p.hd;
            mp.put(hd,curr.key);
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