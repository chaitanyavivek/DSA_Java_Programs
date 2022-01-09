
public class ReverseArray {
static void reverseArray(int arr[],int n){
	int low=0,high=n-1;
	while(low<high){
		int temp=arr[low];
		arr[low]=arr[high];
		arr[high]=temp;
		low++;
		high--;
	}
		
}
public static void main(String args[]){
	int arr[]={1,2,7,6,9},n=5;
	System.out.println("Before reversing array is");
	for(int i=0;i<n;i++){
		System.out.println(arr[i]+" ");
	}
	System.out.println();
	reverseArray(arr,n);
	System.out.println("After reversing array is");
	for(int i=0;i<n;i++){
		System.out.println(arr[i]+" ");
	}	
}
}
