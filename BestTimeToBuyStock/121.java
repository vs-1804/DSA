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
	//second approach using dp.
  static int maxProfit(int[] arr) {
		int profit=Integer.MIN_VALUE;
	    int buy=arr[0];
		for(int i=1;i<arr.length;i++) {
			 int cost=arr[i]-buy;
			 profit=Math.max(profit, cost);
			 buy=Math.min(buy,arr[i]);	
		}
		return profit;
	}
		return profit;	
	}
	public static void main(String[] args) {
		int[] arr= {7,2,5,1,2};
		System.out.println(Stock.maxProfit(arr));
	}
}
