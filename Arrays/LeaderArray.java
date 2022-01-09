public class LeaderArray {
static void leaderArray(int arr[],int n){
	for(int i=0;i<n;i++){ //1st we traverse the array using i from jth ele
		boolean flag=true; //and consider there is no leader element and write flag=true;
		for(int j=i+1;j<n;j++){ //now from 1st element we compare i and j if it is greater we write flag=false
			if(arr[j]>=arr[i]){
				flag=false;
				break;
			}
		}	
	if(flag==true){
		System.out.print(arr[i]+" ");
	}
	}		
}
public static void main(String args[]){
	int arr[]={7,10,4,10,6,5,2},n=7;
	leaderArray(arr,n);
}
}

//efficient code[as the last element is always leader element we print it first
/*
static void leaderElement(int arr[],int n){
int curr_leader=arr[n-1];
System.out.println(curr_leader);
for(int i=n-2;i>=0;i--){ //we come from back i.e last on wards 2nd ele
if(arr[i]>curr_leader)
{
curr_leader=arr[i];    //for this code o/p comes as 2 5 6 10 as we started from back
print(curr_leader)
}
}
}
*/