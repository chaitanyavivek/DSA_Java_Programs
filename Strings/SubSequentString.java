import java.util.*;
public class SubSequentString {
static boolean isSubsequent(String s1,String s2,int m,int n){
	int j=0;
	for(int i=0; i<m &&j<n;i++){
		if(s1.charAt(i)==s2.charAt(j)) //nothing but 2 strings are given checks index of s1 and s2
			j++;  //if both are same i moves 1 j moves 1 if they are not same also i moves and j stays in 
	}  //same pos.if s2 comes to end we return tree;
		return j==n;
	}
public static void main(String args[]){
	Scanner sc=new Scanner(System.in);
	int m,n;
	m=sc.nextInt();
	n=sc.nextInt();
	String s1,s2;
	s1=sc.next();
	s2=sc.next();
	System.out.println(isSubsequent(s1,s2,m,n));
}
}