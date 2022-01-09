
public class PrefixSum {
static int[] prefixSum(int arr[],int n){
	int prefixsum[]=new int[n];//we create prefix sum array and intiliaze 1st number as 0
	prefixsum[0]=arr[0];//in prefix array we add all elements by keeping 1st ele as 0(0,0+2=2,2+8=10....)
	for(int i=1;i<n;i++){ //we get prefix sum arr as{0,2,10,13,22,28,33,37}
		prefixsum[i]=prefixsum[i-1]+arr[i];
	}
	return prefixsum;
}
static int getSum(int prefixsum[],int l,int r){
	if(l!=0)
		return prefixsum[r]-prefixsum[l-1];
	else
		return prefixsum[r]; //so to get left sum and right sum we use that formula
}
public static void main(String args[]){
	int arr[]={2,8,3,9,6,5,4},n=7;
	int prefixsum[]=prefixSum(arr,n);
	System.out.println(getSum(prefixsum,1,3));
	System.out.println(getSum(prefixsum,3,6));
	
}
}
