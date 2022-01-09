public class LeftRotateByOne {
static void  leftRotate(int arr[],int n){
	int temp=arr[0];
	for(int i=1;i<n;i++){
	    arr[i-1]=arr[i];
	}
	arr[n-1]=temp;
}
public static void main(String args[]){
	int arr[]={5,6,7,8,9,10},n=6;
	System.out.println("before reversing array by 1");
	for(int i=0;i<n;i++){
		System.out.println(arr[i]+" ");
	}
	System.out.println();
	leftRotate(arr,n);
	System.out.println("after reversing array by 1");
	for(int i=0;i<n;i++){
		System.out.println(arr[i]+" ");
	}	
	
}
}
