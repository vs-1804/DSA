package test;
public class Stock1 {
	
//first approach
	static int maxProfit1(int[] prices) {
        int profit=0;
	  int buy=0;
	  int sell=1;
		for(int i=0;i<prices.length-1;i++) {
		
			if(prices[sell]>prices[buy]) {
				int temp=prices[sell]-prices[buy];
				profit= profit+temp;
				buy=sell;
			}else{
			
				buy=sell;
			}
			sell=sell+1;
		}
		return profit;	
   }
//second approach
  static int maxProfit(int[] prices) {
	
	  int profit=0;
	  int buy=prices[0];
	 
		for(int i=1;i<prices.length;i++) {
			if(buy<prices[i]) {
				profit=profit+(prices[i]-buy);
			}
			buy=prices[i];
		}
		return profit;	
	}
	public static void main(String[] args) {
		int[] arr= {1,2,3,4,5};
		System.out.println(Stock1.maxProfit(arr));
	}
}
