class Solution {
    public int minMoves(int[] nums) {
        int sum=0;
        int n=nums.length;
        Arrays.sort(nums);
        int last=nums[n-1];
     int i=0;
      while(i<n){
        sum +=last-nums[i];
        i++;
      }
       return sum;
    }
}