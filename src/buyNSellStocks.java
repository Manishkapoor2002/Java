public class buyNSellStocks {

    public static int maxProfit(int[] prices){
        int n = prices.length;

//        int maxprofit = 0;
//        int currentprofit = 0;
//        for(int i = 0;i<n;i++){
//            for (int j = i+1;j<n;j++){
//                currentprofit = (prices[j] - prices[i]);
//                maxprofit = Math.max(maxprofit,currentprofit);
//            }
//        }
//        return maxprofit;

        int buyPrice = Integer.MAX_VALUE;
        int maxprofit = 0;

        for (int i = 0;i<n;i++){
            if (buyPrice<prices[i]){
                int currentprofit = prices[i] - buyPrice;
                maxprofit = Math.max(currentprofit,maxprofit);
            }else{
                buyPrice = prices[i];
            }
        }

        return maxprofit;
    }
    public static void main(String[] args) {
        int[] prices = {7,1,5,3,6,4};
       int profit = maxProfit(prices);
        System.out.println(profit);
    }
}