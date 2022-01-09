import java.util.*;
import java.io.*;
import java.lang.*;

class Node { //for this method we assign root values between -infy to +infy 
    int key; //when we go to left child we change upper bound of node value
    Node left, right;//when we go right child we change lower bound of node valuee
    Node(int x) //for every node if its data lies between that range its a bst
    {
        key = x;
        left = right = null;
    }
}

class CheckForBstEffi
{
    public static boolean isBST(Node root, int min, int max)  
    {  
      if (root == null)  
        return true;  
          
      return ( root.key>min && root.key<max && 
                isBST(root.left,min,root.key) && isBST(root.right,root.key,max));  
    }
    
    public static void main(String args[])
    {
        Node root = new Node(4);  
        root.left = new Node(2);  
        root.right = new Node(5);  
        root.left.left = new Node(1);  
        root.left.right = new Node(3);  
          
        if (isBST(root,Integer.MIN_VALUE,Integer.MAX_VALUE)) 
            System.out.println("IS BST"); 
        else
            System.out.println("Not a BST");
    }
}