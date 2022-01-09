public class LargestEffi {
static int getLargest(int arr[],int n){
	int res=0;
	for(int i=1;i<n;i++)
		if(arr[i]>arr[res]) //{5,8,20,10} res=0,i=1,8>5 so res=1 now res=1 amd i=2
			res=i;           //20>8 res=2,i=2 now i=3 res=2 10 not greater than 20 res remains 2
	return res;              //so returns res=2 i.e largest ele
}
public static void main(String args[]){
	int arr[]={5,8,20,10},n=4;
	System.out.println(getLargest(arr,n));
}
}
