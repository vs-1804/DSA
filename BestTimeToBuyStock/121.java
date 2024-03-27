package test;
public class Stock {
	
//first approach
	static int maxProfit1(int[] prices) {
        int profit=0;
	  int buy=0;
	  int sell=1;
		for(int i=0;i<prices.length-1;i++) {
		
			if(prices[sell]>prices[buy]) {
				int temp=prices[sell]-prices[buy];
				profit=Math.max(temp,profit);
				
			}else{
			
				buy=sell;
			}
			sell=sell+1;
		}
		return profit;	
   }
	//second approach
  static int maxProfit(int[] arr) {
	
	 int max=0;
	 int min=arr[0];
		for(int i=1;i<arr.length-1;i++) {
			max=Math.max(max,arr[i]-min);
			min=Math.min(min,arr[i]);
		}
		return max;	
	}
	public static void main(String[] args) {
		int[] arr= {7,2,5,1,2};
		System.out.println(Stock.maxProfit(arr));
	}
}
