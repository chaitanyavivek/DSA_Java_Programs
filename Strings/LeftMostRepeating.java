public class LeftMostRepeating {
static final int CHAR=256;
static int leftMost(String str){
	boolean visited[]=new boolean[CHAR];
	int res=-1; //we take char array which is filled with this string we come from backside if its not seen
	for(int i=str.length()-1;i>=0;i--){ // we will write true if character is seen 2nd time also we return 
		if(visited[str.charAt(i)])  //its index   for clarity refr book
			res=i;
		else
			visited[str.charAt(i)]=true;				
	}
	return res;
}
public static void main(String args[]){
	String str="cabbad";
	System.out.println("left most repeated character is");
	System.out.println(leftMost(str));
}
}
