import java.util.*;
import java.io.*;
import java.lang.*;
public class CheckAnagramNaive {
	static boolean areAnagram(String s1, String s2) 
    { 
       
        if (s1.length() != s2.length()) 
            return false; 
  
       char a1[]=s1.toCharArray();
        Arrays.sort(a1);
        s1=new String(a1);
        char a2[]=s2.toCharArray();
        Arrays.sort(a2);
        s2=new String(a2);
        
        return s1.equals(s2);
    } 
  
    public static void main(String args[]) 
    { 
        String str1 = "abaac"; 
        String str2 = "aacba";  
        if (areAnagram(str1, str2)) 
            System.out.println("The two strings are"
                               + " anagram of each other"); 
        else
            System.out.println("The two strings are not"
                               + " anagram of each other"); 
    } 
} 

