public class StockBuyAndSell {
static int stockBuy(int price[],int n){
	int profit=0;
	for(int i=1;i<n;i++){
		if(price[i]>price[i-1])
			profit=profit+price[i]-price[i-1];
	}
	return profit;
}
public static void main(String args[]){
	int arr[]={1,5,3,8,10},n=5;
	System.out.println(stockBuy(arr,n));
}
}
