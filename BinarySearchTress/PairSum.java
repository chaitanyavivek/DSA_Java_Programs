import java.util.*;
import java.io.*;
import java.lang.*;

class Node {//in the given tree we have to check whether the given sum is present or not in the given tree
    int key; //if its not present we add sum to the hashset so when  the hash set contains sum we return true
    Node left, right;//we do in order traversal(we can do any traversal we need)
    Node(int x)
    {
        key = x;
        left = right = null;
    }
}

class PairSum
{
    
    public static boolean isPairSum(Node root, int sum, HashSet<Integer> s) 
    { 
        if(root==null)return false;
        
        if(isPairSum(root.left,sum,s)==true)
            return true;
            
        if(s.contains(sum-root.key))  
            return true;
        else
            s.add(root.key);
        return isPairSum(root.right,sum,s);
    } 
    
    public static void main(String args[])
    {
        Node root = new Node(10);  
        root.left = new Node(8);  
        root.right = new Node(20);  
        root.left.left = new Node(4);
        root.left.right = new Node(9);
        root.right.left = new Node(11);
        root.right.right = new Node(30);  
        root.right.right.left = new Node(25);
        
        int sum=33;
        
        HashSet<Integer> s=new HashSet<>();    
        System.out.print(isPairSum(root,sum,s));
    }
}