public class FrequencySortedArray {
static void frequencySorted(int arr[],int n){
	int i=1,freq=1;
	while(i<n){
		while(i<n && arr[i]==arr[i-1]){
			freq++;
			i++;
		}
	System.out.println(arr[i-1]+" "+freq);
	i++;
	freq=1;
	}
	if(n==1||arr[n-1]!=arr[n-2]){
		System.out.println(arr[n-1]+" "+1);
	}	
}
public static void main(String args[]){
	int arr[]={10,20,30,30,20},n=5;
	frequencySorted(arr,n);
	
}
}
