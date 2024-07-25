package com.linjh.dome240725;

public class test1 {

    public int maxProfit(int[] prices) {

        int[] intArray = new int[prices.length];

        int result = 0;
        intArray[prices.length - 1] = prices[prices.length - 1];
        for (int i = intArray.length - 2; i >= 0; i--) {
            result = Math.max(intArray[i + 1] - prices[i], result);

            if (intArray[i + 1] < prices[i]) {
                intArray[i] = prices[i];
            } else {
                intArray[i] = intArray[i + 1];
            }

        }


        return result;
    }

}
