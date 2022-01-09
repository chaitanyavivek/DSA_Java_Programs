public class TrapRainWaterNaive {
static int getwater(int arr[],int n){
	int res=0;
	for(int i=1;i<n-1;i++){
		int lmax=arr[i];           //tc is 0[n2] we are using 2 loops
		for(int j=0;j<i;j++)
			lmax=Math.max(lmax, arr[j]);
		int rmax=arr[i];
		for(int j=1+1;j<n;j++)
		    rmax=Math.max(rmax, arr[j]);
		    res=res+(Math.min(lmax,rmax)-arr[i]);
	}
	return res;
}
public static void main(String args[]){
	int arr[]={3,0,1,2,5},n=5;
	System.out.println(getwater(arr,n));
}
}
