public class CheckRotation {
static boolean checkRotation(String s1,String s2){
	if(s1.length()!=s2.length())// s1=ABCD S2=CDAB no we have to check is abcd part of cdab
		return false;//yes its part for s1 1st we rotate a we get bcda,next rotate b we get cdab
	return((s1+s2).indexOf(s2)>=0); //so for this to find we concate s1 to itself we get ABCDABCD
}//now using indexof function we chcek which gives 1st occurance of s2 in s1+s1;
public static void main(String args[]){
	String s1="ABCD"; String s2="CDAB";
	if( checkRotation(s1,s2))
		System.out.println("Strings of rotation of each other");
	else
		System.out.println("Strings are not rotation of each other");
}
}
