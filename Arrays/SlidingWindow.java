
public class SlidingWindow {
static int slidingWindow(int arr[],int n,int k){
	int curr_sum=0; //array is given we need to find max sum with given k and nos must be consecutive
	for(int i=0;i<k;i++) //1st for k ele we go upto k range,next for another to go to nextone we add next ele
		curr_sum+=arr[i]; //and remove 1st ele this is slidng window tech(adding next ele and removing 1st ele)
	int max_sum=curr_sum;
	for(int i=k;i<n;i++){
		curr_sum+=(arr[i]-arr[i-k]);
	    max_sum=Math.max(curr_sum,max_sum);
	}
	return max_sum;
}
public static void main(String args[]){
	int arr[]={1,8,30,-5,20,7},n=6,k=3;
	System.out.println(slidingWindow(arr,n,k));
	
}

}
