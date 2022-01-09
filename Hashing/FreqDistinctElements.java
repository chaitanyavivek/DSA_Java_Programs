import java.util.*;
import java.io.*;
import java.lang.*;
import java.util.HashMap;
public class FreqDistinctElements {
public static void main(String args[]){
	int arr[]=new int[]{15,16,27,27,28,15,16,19};
	int n=arr.length;
	countFreq(arr,n);
}
static void countFreq(int arr[],int n){
	Map<Integer,Integer>map=new HashMap<Integer,Integer>();
	for(int i=0;i<n;i++){
		int key=arr[i];
		if(map.containsKey(arr[i])==true)
			map.put(arr[i], map.get(arr[i])+1);
		else
			map.put(arr[i],1);
	}
	for(Map.Entry<Integer, Integer>e:map.entrySet())
		System.out.println(e.getKey()+" "+e.getValue());
}

}
