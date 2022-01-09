import java.util.HashSet;

public class SubArrayWith0Sum {
	public static void main(String args[]){
		int arr[]=new int[]{1,4,13,-3,-10,5};
		int n=arr.length;
		System.out.println(SubArray0Sum(arr,n));
	}

static int SubArray0Sum(int arr[],int n){
HashSet<Integer>ob=new HashSet<Integer>();
int prefix_sum=0;
ob.add(0);
for(int i=0;i<n;i++){ //we create empty hash table and add prefix sum to it so when prefix sum we get
	prefix_sum+=arr[i];//is already present in hash table we return true
	if(ob.contains(prefix_sum) == true)
		return 1;
	ob.add(prefix_sum);
}
return 0;
}
	
}