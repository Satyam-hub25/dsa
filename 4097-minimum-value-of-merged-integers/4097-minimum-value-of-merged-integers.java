class Solution {
    public int minMergedInteger(int[] nums) {
        int min=Integer.MAX_VALUE;
        for(int i=0; i<nums.length; i+=2){
            int merg=Integer.parseInt(nums[i]+""+nums[i+1]);
            if(merg <min){
                min=merg;
            }
        }
        return min;
    }
}