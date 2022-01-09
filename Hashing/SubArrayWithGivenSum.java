import java.util.HashSet;
public class SubArrayWithGivenSum {
public static void main(String args[]){
	int arr[]=new int[]{5,8,6,13,3,-1};
	int sum=22;
	int n=arr.length;
	System.out.println(SubArraySum(arr,n,sum));
}
static boolean SubArraySum(int arr[],int n,int sum){
	HashSet<Integer>set=new HashSet<Integer>();
	int pre_sum=0;
	for(int i=0;i<n;i++){
		if(pre_sum==sum)
			return true;
		pre_sum+=arr[i];
		if(set.contains(pre_sum-sum)==true)
			return true;
		    set.add(pre_sum);
	}
	return false;
}
}
