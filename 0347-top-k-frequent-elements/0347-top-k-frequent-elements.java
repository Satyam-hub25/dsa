class Solution {
    public int[] topKFrequent(int[] nums, int k) {
        HashMap<Integer,Integer> map=new HashMap<>();
        PriorityQueue<Integer> pq=new PriorityQueue<>(
        (a,b) -> Integer.compare(map.get(a),map.get(b))
        );
        int n=nums.length;
        for(int i=0; i<n; i++){
            map.put(nums[i],map.getOrDefault(nums[i],0)+1);
        }
        for(int x: map.keySet()){
            pq.add(x);
            if(pq.size()>k){
                pq.poll();
            }
        }
         int ans[]=new int[k];
         int i=0;
         while(!pq.isEmpty()){
           ans[i]=pq.poll();
           i++;
         }
         return ans;
    }
}