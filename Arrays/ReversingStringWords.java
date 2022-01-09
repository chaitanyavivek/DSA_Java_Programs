public class ReversingStringWords {
static void reverse(char arr[],int low,int high){
	while(low<=high){//given 3 words  my name vivek 1st we revrese 1st word when ever we see space word is reversed
		char temp=arr[low];//so after y there is space its revrsed.next start =n & end=n to e as soon as it
	    arr[low]=arr[high];//sees space aftr e name is reversed so last word vivek after k word ends there is 
	    arr[high]=temp;//no space so we expilictly reverse it.Now after reverse these 3 we reverse total 
	    low++;  //3 words atlast we reverse all words. for more detail refer notes
	    high--;
	}
}
static void reverseWords(char arr[],int n){
	int start=0;
	for(int end=0;end<n;end++){
		if(arr[end]==' '){
			reverse(arr,start,end-1);
			start=end+1;
		}
	}
		reverse(arr,start,n-1);
		reverse(arr,0,n-1);			
	}
public static void main(String args[]){
	String s="My name vivek";
	int n=s.length();
	char arr[]=s.toCharArray();
	System.out.println("After reversing the words in string");
	 reverseWords(arr,n);
	System.out.println(arr);	
}
}
