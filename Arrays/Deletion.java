
public class Deletion {
static int delete(int arr[],int n ,int x){
	int i;
	for(i=0;i<n;i++){
		if(arr[i]==x)
			break;
	}
	if(i==n){
		return n;
	}
	for(int j=i;j< n- 1;j++){
		arr[j]=arr[j+1];
	}
	return n-1;
}
public static void main(String args[]){
	int arr[]={4,5,6,7,8},x=7,n=5;
	System.out.println("Before deletion");
	for(int i=0;i<n;i++){
		System.out.println(arr[i]+" ");
	}
	System.out.println();
	n=delete(arr,n,x);
	System.out.println("After	 deletion");
	for(int i=0;i<n;i++){
		System.out.println(arr[i]+" ");
	}
	
}
}
