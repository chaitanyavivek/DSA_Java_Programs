public class StockSpanNaive {
	 public static void printSpan(int arr[],int n){
	        for(int i=0;i<n;i++){ //1st when i=0j=-1 prints span=1 ,,i=1 j=0 18<12 false doest enter loop span=1
	            int span=1;//i=2 j=1 12<13 enters loops span increases so span=2
	            for(int j=i-1;j>=0 && arr[j]<=arr[i];j--)//simillarly i=3 span=3 i=4 span=1
	                span++;                   //i=5 span-5;
	            System.out.print(span+" ");
	        }    
	    }
		public static void main (String[] args) {
		
		    int[] arr=new int[]{18,12,13,14,11,16};
	        
	        printSpan(arr,arr.length);   
		  
		}
}
