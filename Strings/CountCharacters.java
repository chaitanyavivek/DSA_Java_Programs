
public class CountCharacters {
public static void main(String args[]){
	String s="abbfaeffc";
	int c[]=new int[26];
	for(int i=0;i<s.length();i++){
		c[s.charAt(i)-'a']++;
	}
	for(int i=0;i<26;i++){
		if(c[i]>0){
			System.out.println((char)(i+'a')+" "+c[i]);
		}
	}
	
}
}
