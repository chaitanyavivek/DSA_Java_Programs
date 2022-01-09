import java.util.*;
import java.io.*;
import java.util.HashSet;
public class PairWithGivenSum {
	public static void main (String[] args) {
    int arr[] = new int[]{3, 8, 4, 7, 6, 1};
    int len=arr.length;
    int x=14;
    System.out.println(pairWithSumX(arr, len, x));
}
static int pairWithSumX(int arr[],int n,int x){
	HashSet<Integer>set=new HashSet<Integer>();
	for(int i=0;i<n;i++){//method is we add we check whether 14-arr ele is present in hash set if its present we
		if(set.contains(x-arr[i]))//return 1 else we add to arr[i] else we return 0; ex
			return 1; //14-3=12 not present so we add 3 to hash set{3}
		              //14-8=6 not present so we add 8 {3,8} next 14-4=10 np we add 4 {3,8,4}
		set.add(arr[i]);//14-7=7 np we add 7{3,8,4,7} 14-6=8 so 8 is already present in hash table so its true 
			                                                  //we return 1;
	}
	return 0;
}
		
	}
