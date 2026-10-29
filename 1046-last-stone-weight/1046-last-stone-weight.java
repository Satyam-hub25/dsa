class Solution {
    public int lastStoneWeight(int[] stones) {
        PriorityQueue<Integer> pq=new PriorityQueue<>(Collections.reverseOrder());
        int n=stones.length;
        int i=0;
        //max heap like 8 7 4 2 1 1 
        for( i=0; i<n; i++){
            //added in queue [8,7,4,2,1,1]
            pq.add(stones[i]);
        }
        //jab tak bhaa hai tab tak check karo
        while(pq.size()>1){
            int x=pq.poll();
            int y=pq.poll();
            if(x!=y){
                int res=x-y;
                pq.add(res);
            }
        }
        if(pq.isEmpty()){
            return 0;
        }else
           return pq.poll();
   }
}