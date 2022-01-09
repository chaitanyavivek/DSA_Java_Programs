public class TrapRainWaterEffi {
static int getWater(int arr[],int n){
int res=0;                //we create arrays for lmax,rmax
int lmax[]= new int[n];   //arr[]={5,0,6,2,3}
int rmax[]= new int[n];   
lmax[0]=arr[0];   //lmax 1st element equal to arr 1st elemnt so we consider arr 1st ele and lmax 0 ele
for(int i=1;i<n;i++)       
	lmax[i]=Math.max(arr[i],lmax[i-1]); //lmax={5,5,6,6,6} 0 and 5 is greter,6&5 5is greater,2&6 6 3&6 6 is gret
rmax[n-1]=arr[n-1];
for(int i=n-2;i>=0;i--) //for r max we consider from rev arr last element=rmax=last ele
	rmax[i]=Math.max(arr[i],rmax[i+1]); //{ 6,6,6,3,3} last ele is3 we consder 2&3 gret is 3 
for(int i=1;i<n-1;i++)                  //6&3 great is 6,0&6 great is 6,5&6 gret is 6, LIKE THIS LMAX,RMAX 
	res=res+(Math.min(lmax[i], rmax[i])-arr[i]);                         // are formed
return res;
}
public static void main(String args[]){
	int arr[]={5,0,6,2,3},n=5;
	System.out.println(getWater(arr,n));
}
}
