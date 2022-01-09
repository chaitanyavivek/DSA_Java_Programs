public class MaxOddEven {
static int maxOddEven(int arr[],int n){
	int curr=1,res=1;
	for(int i=1;i<n;i++){
		if(arr[i]%2==0&&arr[i-1]%2!=0||arr[i-1]%2==0&&arr[i]%2!=0)
		{
			curr++;
			res=Math.max(curr,res);
		}
		
	}
	return res;
}
public static void main(String args[]){
	int arr[]={2,10,5,6,7,3},n=6;
	System.out.println(maxOddEven(arr,n));
}
}
