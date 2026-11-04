class Solution {
    public boolean canJump(int[] nums) {
         int maximum=0;
         for(int i=0; i<nums.length; i++){
            if(i > maximum) return false;
            maximum=Math.max(maximum, i+nums[i]);
            
            if(maximum >= nums.length-1) return true;
            
         }
         return true;
    }
}