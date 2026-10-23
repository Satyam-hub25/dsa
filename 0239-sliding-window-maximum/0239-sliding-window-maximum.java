class Solution {
    public int[] maxSlidingWindow(int[] nums, int k) {
      int i=0;
      int j=0;
      int n=nums.length;
        int ans[]=new int[n-k+1];
      Deque<Integer> q=new ArrayDeque<>();
      while(j<n){
        while(!q.isEmpty() && nums[q.peekLast()]<=nums[j]){
          q.removeLast();
        }
        q.addLast(j);
        j++;
        int len=j-i;
        if(len==k){
        ans[i]=nums[q.peekFirst()];
        if(q.peekFirst()==i){
            q.removeFirst();
        }
        i++;
        }
      }
      return ans;
    }
}