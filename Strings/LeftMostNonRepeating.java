public class LeftMostNonRepeating {
static final int CHAR=256; //we create str array and push chars into the array we iterate through that array
static int leftNonRep(String str){ //if it repeats we inc for characters whose count is 1 we return index
int count[]=new int[CHAR];
for(int i=0;i<str.length();i++){
	count[str.charAt(i)]++;
}
for(int i=0;i<str.length();i++){
	if(count[str.charAt(i)]==1)
		return i;
}
return -1;
}
public static void main(String args[]){
	String str="abbcda";
	System.out.println("Leftmost non repeating character is");
	System.out.println(leftNonRep(str));	
}
}
