public class CheckAnagram {
static final int CHAR=256;
static boolean isAnagram(String s1,String s2){
	if(s1.length()!=s2.length())
		return false;
	int arr[]=new int [CHAR];
	for(int i=0;i<s1.length();i++){  //anagram is nothing but they must be of same length and chars should
		arr[s1.charAt(i)]++; //be same in both strings in any manner
		arr[s2.charAt(i)]--;//method is we take char of size 256 and we take ant strung s1 or s2 
	}            //if we see in s1 we make +1 if we see in s2 we make -1;
	for(int i=0;i<CHAR;i++) //finally when arr becomes zero we return true;
		if(arr[i]!=0)
			return true;
	return false;
}
public static void main(String args[]){
	String s1="aabca";
	String s2="acaba";
	if(isAnagram(s1,s2))
		System.out.println("They are anagram to each other");
	else
		System.out.println("They are anagram to each other");
}
}