class Solution {
    public int removeElement(int[] nums, int val) {
     Queue<Integer> q=new LinkedList<>();
     for(int i=0; i<nums.length; i++){
        if(nums[i]!=val){
        q.add(nums[i]);
        }
     }  
     int count=q.size();
     for(int i=0;  i<count; i++){
       nums[i]=q.poll();
     }
     return  count;
    }   
}