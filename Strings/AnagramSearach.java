public class AnagramSearach {
static final int CHAR=256;
static boolean areSame(int CT[],int CP[]){
	 for(int i=0;i<CHAR;i++){
	        if(CT[i]!=CP[i])return false;
	    }
	    return true; //for explanation refer notes
	    }
static boolean isAnagaram(String txt,String pat){
	int CT[]=new int[CHAR];
	int CP[]=new int[CHAR];
	for(int i=0;i<pat.length();i++){
		CT[txt.charAt(i)]++;
		CT[pat.charAt(i)]++;
	}
	for(int i=pat.length();i<txt.length();i++){
		if(areSame(CT,CP))
			return true;
		CT[txt.charAt(i)]++;
		CT[txt.charAt(i-pat.length())]--;
	}
	return false;
}
public static void main(String args[]){
	String txt = "geeksforgeeks"; 
    String pat = "frog";  
    if (isAnagaram(txt, pat)) 
        System.out.println("Anagram search found"); 
    else
        System.out.println("Anagram search not found"); 
}
	
}
