
public class CheckArraySorted {
static boolean ArraySorted(int arr[]){
	int n=arr.length;
	for(int i=1;i<arr.length;i++){
		if(arr[i]<arr[i-1]){
			return false;
		}
	}
		return true;
}

public static void main(String args[]){
	int arr[]={4,15,25,35};
	System.out.println(ArraySorted(arr));
}
}
