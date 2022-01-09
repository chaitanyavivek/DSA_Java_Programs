import java.io.*;
import java.util.*;//for this the trick is when big element comes to stack small element must go out.
//when small ele comes it adds normally to the stack.when small is going out the small becomes o/p
class StockSpanEffi{ //for more info refer notes 
    public static void printSpan(int arr[],int n){
        Deque<Integer> s=new ArrayDeque<>() ;
        s.add(0);
        System.out.print(1+" ");
        for(int i=1;i<n;i++){
            while(s.isEmpty()==false && arr[s.peek()]<=arr[i]){
                s.pop();
            }
            int span=s.isEmpty() ? i+1 : i-s.peek();
            System.out.print(span+" ");
            s.push(i);
        }    
    }
	public static void main (String[] args) {
	
	    int[] arr=new int[]{18,12,13,14,11,16};
        
        printSpan(arr,arr.length);   
	  
	}
	
}