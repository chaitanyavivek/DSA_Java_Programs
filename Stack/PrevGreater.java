import java.io.*;
import java.util.*;//same like stock span here 1st we print -1 and we add large ele small goes out
public class PrevGreater { //when array is empty we print -1
	public static void printPrevGreater(int arr[],int n){
	    
        Deque<Integer> s=new ArrayDeque<>();
        s.add(arr[0]);
        for(int i=0;i<n;i++){
            while(s.isEmpty()==false && s.peek()<=arr[i])
                s.pop();
            int pg=s.isEmpty()?-1:s.peek();
            System.out.print(pg+" ");
            s.add(arr[i]);
        }
    }
	public static void main (String[] args) {
	
	    int[] arr=new int[]{20,30,10,5,15};
        
        printPrevGreater(arr,arr.length);   
	  
	}
}
