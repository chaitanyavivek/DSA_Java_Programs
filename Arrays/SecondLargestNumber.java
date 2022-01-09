
public class SecondLargestNumber {
public static void main(String args[]){
	int arr[]={4,10,8,9,6};
	int temp,size;
	size=arr.length;
	System.out.println("size of array is"+size);
	for(int i=0;i<size;i++){
		for(int j=i+1;j<size;j++){
			if(arr[i]>arr[j]){//if we want 2nd smallest and 3rd smallest like that we use "<" symbol
			temp=arr[i];    //idea is to make elemnets in ascending order and a/c to size give we give num
			arr[i]=arr[j];
			arr[j]=temp;
		}		
	}
}
	System.out.println();
	System.out.println("elements in ascending order");
	for(int i=0;i<size;i++){
		System.out.println(arr[i]+" ");
	}
	System.out.println();
	System.out.println(" second Largest element in array " +arr[size-1]);
}            // here if we give size-3 we get 3rd largest element
}
