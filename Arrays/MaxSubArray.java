public class MaxSubArray {
static int maxSub(int arr[],int n){
	int res=arr[0];
	int max_ending=arr[0];
	for(int i=1;i<n;i++){
		max_ending=Math.max(max_ending+arr[i], arr[i]);
	    res=Math.max(max_ending, res);
	}
	return res;
}
public static void main(String args[]){
	int arr[]={1,-2,3,-1,2},n=5;
	System.out.println(maxSub(arr,n));
}
}
