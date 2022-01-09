
public class RemoveDuplicatesSorted {
	static int removeDuplicate(int arr[],int n){
		int res=1;
		for(int i=1;i<n;i++){  //in the same array we maintain result
			if(arr[res-1]!=arr[i]){ //when we say arr[res-1]=arr[1-1]=arr[0] we compare i=1 with 0th element
				arr[res]=arr[i];
						res++;
			}
		}
		return res;
	}
	public static void main(String args[]){
		int arr[]={10,30,30,20,20,50,40},n=7;
		System.out.println("Array before removal");
		for(int i=0;i<n;i++){
			System.out.println(arr[i]+" ");
		}
		System.out.println();
		n=removeDuplicate(arr,n);
		System.out.println("Array after removal");
		for(int i=0;i<n;i++){
			System.out.println(arr[i]+" ");
		}	
	}

}
