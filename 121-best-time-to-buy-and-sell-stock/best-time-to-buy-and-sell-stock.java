class Solution {
    public int maxProfit(int[] arr) {
       int lowest_p = Integer.MAX_VALUE;
       int profit = 0;

       for(int i = 0; i < arr.length; i++){
        if(arr[i] < lowest_p){
            lowest_p = arr[i];
        }
        profit = Math.max(profit,arr[i] - lowest_p);
       }
       return profit;
    }
}