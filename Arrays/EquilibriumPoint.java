
public class EquilibriumPoint {
static boolean equilibriumPoint(int arr[],int n){
	for(int i=0;i<n;i++){//equili point is nothing but we consider 1 point ex in this we consoder 5
		int l_sum=0; //sum of ele before 5 must be equal to sum of ele after then 5 is eq point
		for(int j=0;j<i;j++)
			l_sum+=arr[j];
		int r_sum=0;
		for(int k=i+1;k<n;k++)
			r_sum+=arr[k];
		if(l_sum==r_sum)
			return true;
	}
	return false;
}
public static void main(String args[]){
	int arr[]={8,-2,4,5,8,2},n=6;
	System.out.println( equilibriumPoint(arr,n));
}
}
