package easy;

public class Problem121 {
	public static void main(String[] args) {
		
	}
	public int maxProfit(int[] prices) {
		int max = 0;
		int min = Integer.MAX_VALUE;
		for(int i = 0; i < prices.length; i++) {
			if(min < prices[i]) {
				min = prices[i];
			}
			else if(prices[i] - min > max) {
				max = prices[i] - min;
			}
		}
		return max;
	        
	  }
	
}
