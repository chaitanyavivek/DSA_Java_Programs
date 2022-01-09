import java.util.*;
import java.io.*;
import java.lang.*;

public class Intersection2Arrays {
	public static void main (String[] args) {
        int arr1[] = new int[]{15, 17, 27, 27, 28, 15,31};
        int arr2[] = new int[]{16, 17, 28, 17, 31, 17,15};
        int m = arr1.length;
        int n = arr2.length;
        
        System.out.println(intersection(arr1, m, arr2, n));
    }
    
    static int intersection(int arr1[], int m, int arr2[], int n)
    {
        HashSet<Integer> hs = new HashSet<Integer>();
        for(int i=0;i<m;i++)
          hs.add(arr1[i]);//{15,17,27,28,31} duplicates will not bee
        int res = 0;
        for(int i = 0; i < n; i++)//now we traveerse through b array and check if array values r present
        {      // if present increase res and remove that elemnt from array1
            if(hs.contains(arr2[i])) //ex 16 not present,17 present inc res=1 and remove 17
            {                      //28 presnt res=1 again 17 but we removed 17 from arr2 so this is process
                res++;
                hs.remove(arr2[i]);
            }
        }
        return res;
    }
}



