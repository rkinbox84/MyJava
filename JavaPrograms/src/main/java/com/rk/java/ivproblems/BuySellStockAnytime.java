package com.rk.java.ivproblems;

public class BuySellStockAnytime {



	    public int maxProfit(int[] prices) {
	        int total = 0;
	        for (int i = 0; i < prices.length - 1; i++) {
	            if (prices[i + 1] > prices[i]) {
	                total += prices[i + 1] - prices[i];
	            }
	        }
	        return total;
	    }

	    public static void main(String[] args) {
	    	BuySellStockAnytime stock = new BuySellStockAnytime();
	        int[] arr = { 7, 1, 5, 6, 4 };
	        System.out.println(stock.maxProfit(arr));
	    }
	
}
