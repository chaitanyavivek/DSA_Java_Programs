public class NaivePattrnMatching {
static void patternMatch(String text,String pat){
	int m=pat.length();//we compare text and pat at every index if its not matched we move pat by index 
	int n=text.length();//and check they are matching or not
	for(int i=0;i<=(n-m);i++){
		int j;
		for(j=0;j<m;j++)
			if(pat.charAt(j)!=text.charAt(i+j))
				break;
		if(j==m)
			System.out.println(i+" ");
	}
}
public static void main(String args[]){
	String text="ABCABCD"; String pat="ABCD";
	System.out.print("All index numbers where pattern found: ");
	patternMatch(text,pat);
}
}
