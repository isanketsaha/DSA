package algorithms.excercise;

public class BuySellStock {

    public int maxProfit(int[] prices) {
        int low = prices[0], high = prices[0];
        int maxProfit = 0;
        for (int i : prices) {
            if (low > i)
                low = i;
            if (low <= i)
                high = i;

            maxProfit = high - low;
        }
        return maxProfit;
    }
}
