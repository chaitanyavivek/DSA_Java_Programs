public class MoveZerosToEnd {
	static void moveZeros(int arr[],int n){
		int count=0;//count of non zero elememts
		for(int i=0;i<n;i++){
			if(arr[i]!=0){
				int temp=arr[i];  //this 3 lines are for swapping arr[i],arr[count]
				arr[i]=arr[count];
				arr[count]=temp;
				count++;
			}
		}
	}
	public static void main(String args[]){
		int arr[]={10,8,0,0,12,0},n=6;
		System.out.println("before moving to end");
		for(int i=0;i<n;i++){
			System.out.println(arr[i]+" ");
		}
		System.out.println();
		moveZeros(arr,n);
		System.out.println("after moving to end");
		for(int i=0;i<n;i++){
			System.out.println(arr[i]+" ");
		}	
	}
}
