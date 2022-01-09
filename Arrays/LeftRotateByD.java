
public class LeftRotateByD {
static void leftRotate(int arr[],int d,int n){    //{1,2,3,4,5,6}
	reverse(arr,0,d-1); //reverses 1st d elements  //{3,2,1,4,5,6}
	reverse(arr,d,n-1); //reverse remanining elements after d  //{3,2,1,6,5,4}
	reverse(arr,0,n-1);// reverses total array  //{4,5,6,1,2,3}
}
static void reverse(int arr[],int low,int high){
	while(low<high){
		int temp=arr[low];
		arr[low]=arr[high];
		arr[high]=temp;
		low++;
		high--;
	}
}
public static void main(String args[]){
	int arr[]={1,2,3,4,5,6},n=6,d=3;
	System.out.println("before reversing array by 3");
	for(int i=0;i<n;i++){
		System.out.print(arr[i]+" ");
	}
	System.out.println();
	leftRotate(arr,d,n);
	System.out.println("after reversing array by 1");
	for(int i=0;i<n;i++){
		System.out.print(arr[i]+" ");
	}		
}
}
