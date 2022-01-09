import java.util.Deque;//procees is we add small element indexes to array ad when we see large element indexes
import java.util.ArrayDeque;//we remove small elements..and when we move from one k part to another k part
public class MaxSubArraySizek { //we remove 1st element of k part..for explanation refer notes
static void printMax(int arr[],int k){
	int n=arr.length;
    Deque<Integer>dq=new ArrayDeque<Integer>();
    for(int i=0;i<k;i++){
    	while(!dq.isEmpty()&&arr[i]>=arr[dq.peekLast()])
    		dq.removeLast();
    	dq.addLast(i);
    }
    for(int i=k;i<n;i++){
    	System.out.print(arr[dq.peek()]+" ");
    	while(!dq.isEmpty()&&dq.peek()<=i-k)
    		dq.removeFirst();
    	while(!dq.isEmpty()&&arr[i]>=arr[dq.peekLast()])
    		dq.removeLast();
    	dq.addLast(i);
    	
    }
    System.out.print(arr[dq.peek()]);
}
public static void main(String args[]){
	int arr[]={20,40,30,10,60};
	int k=3;
	printMax(arr,k);
}
}
