class Solution {
    public int[] numberGame(int[] nums) {
       //we have to find min element so we cna use minheap 
       PriorityQueue<Integer> pq=new PriorityQueue<>();

       for(int i=0; i<nums.length; i++){
        pq.add(nums[i]);
       }
       //first min
       int a=0;
       //second min
       int b=0;
       int ans[]=new int[nums.length];
       int i=0;
       while(!pq.isEmpty()){
        //first min
       a=pq.remove();
       //second min
       b=pq.remove();
       ans[i++]=b;
       ans[i++]=a;
       }
       
       return ans;
    }
}