
public class Insert {
static int insert(int arr[],int n,int pos,int cap,int x){
	if(n==cap) // n means size of array means no of elements in the array
		return n; //so if array has full capacity it gives size of array
	int index=pos-1;
	for(int i=n-1;i>=index;i--){
		arr[i+1]=arr[i];
	}
	arr[index]=x;
	return n+1;
}
public static void main(String args[]){
	int arr[]=new int[5],cap=6,n=4;
	arr[0]=5;arr[1]=7;arr[2]=8;arr[3]=9;
	System.out.println("Before Insertion");
	for(int i=0;i<n;i++){
		System.out.println(arr[i]);
	}
	System.out.println();//used for gap btwn bfr and aftr insertion
    int x=4,pos=2;
	n=insert(arr,n,pos,cap,x);
	System.out.println("After Insertion");
	for(int i=0;i<n;i++){
		System.out.println(arr[i]);
	}
	
	}
	
}

