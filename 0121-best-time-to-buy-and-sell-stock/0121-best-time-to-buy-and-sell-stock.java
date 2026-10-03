class Solution {
    public int maxProfit(int[] prices) {
        int max=0;
        //min initlize to comapre with prev ones
        int min=prices[0];
        for(int i=1; i<prices.length; i++){
            //finding mmin value here
            min=Math.min(min,prices[i]);
            //finding min diff here with min value
           int diff=prices[i]-min;
            if(diff>=0){
                //find max diff as profit 
                max=Math.max(max,diff);
            }
        }
        //answerrrrrrrrrrrrr
        return max;
    }
}