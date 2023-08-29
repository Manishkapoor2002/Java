public class buyNSellStocks {

    public static int maxProfit(int[] prices){
        int n = prices.length;

        int maxprofit = 0;
        int currentprofit = 0;
        for(int i = 0;i<n;i++){
            for (int j = i+1;j<n;j++){
                currentprofit = (prices[j] - prices[i]);
                maxprofit = Math.max(maxprofit,currentprofit);
                if (maxprofit<0){
                    maxprofit = 0;
                }
            }
        }
        return maxprofit;

    }
    public static void main(String[] args) {
        int[] prices = {5,4,3,2,1,0};
       int profit = maxProfit(prices);
        System.out.println(profit);
    }
}