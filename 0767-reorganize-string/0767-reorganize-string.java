class Solution {
    public String reorganizeString(String s) {
         HashMap<Character,Integer> map=new HashMap<>();
         for(int i=0; i<s.length(); i++){
            char ch=s.charAt(i);
            map.put(ch,map.getOrDefault(ch,0)+1);
         }
         PriorityQueue<Character> pq=new PriorityQueue<>((a,b)->
                  map.get(b)-map.get(a)
                  );
         pq.addAll(map.keySet());

         StringBuilder ans=new StringBuilder();
         while(pq.size()>1){
            char ch=pq.poll();
            char ch1=pq.poll();
            ans.append(ch);
            ans.append(ch1);
            map.put(ch,map.get(ch)-1);
            map.put(ch1,map.get(ch1)-1);
            if(map.get(ch)>0) pq.add(ch);
            if(map.get(ch1)>0) pq.add(ch1);
         }
         while(!pq.isEmpty()){
            char ch=pq.poll();
            if(map.get(ch) > 1) return "";
            ans.append(ch);
         }
         return ans.toString();
  }
}