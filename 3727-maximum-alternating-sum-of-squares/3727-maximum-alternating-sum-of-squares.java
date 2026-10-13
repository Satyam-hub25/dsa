class Solution {
    public long maxAlternatingSum(int[] nums) {
        int n = nums.length;
        long sq[]=new long[n];
        for (int i = 0; i < n; i++) {
             sq[i]=(long) nums[i]*nums[i];
        }
        Arrays.sort(sq);
            long odd=0;
            long even = 0;
            for (int i = 0; i < n/2; i++) {
                    odd += sq[i];
                } 
            for (int i = n/2; i < n; i++) {
                    even += sq[i];
                }
            long store = even - odd;
        return store;
    }
}
