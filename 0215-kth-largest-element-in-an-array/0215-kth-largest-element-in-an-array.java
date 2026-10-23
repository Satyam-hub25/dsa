class Solution {
    public int findKthLargest(int[] nums, int k) {
        //for largest priority
     PriorityQueue<Integer> pq=new PriorityQueue<>(Collections.reverseOrder());   
     //adding values in pq
     for(int i=0; i<nums.length; i++){
        pq.add(nums[i]);
     }
     //run upto k then remove prevously all less then k numbers 
     //jab k <k false then top k mil jayega
     for(int i=1; i<k; i++){
        pq.remove();
     }
     //return top k
     return pq.peek();
    }
}