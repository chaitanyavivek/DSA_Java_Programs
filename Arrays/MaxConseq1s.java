
public class MaxConseq1s {
static int maxConseq1s(int arr[],int n){
	int res=0,curr=0;
	for(int i=0;i<n;i++){
		if(arr[i]==0)
			curr=0;
			else{
				curr++;
				res=Math.max(curr, res);
			}
	}
	return res;
}
public static void main(String args[]){
	int arr[]={0,1,1,1,1,0,1,1,0},n=9;
	System.out.println(maxConseq1s(arr,n));
}
}
