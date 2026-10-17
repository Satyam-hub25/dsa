class Solution {
    public int firstUniqChar(String s) {
        Queue<Integer> q=new ArrayDeque<>();
        int freq[]=new int[26];
        for(int i=0; i<s.length(); i++){
            freq[s.charAt(i) - 'a']++;
            q.add(i);
        }
             while(q.size()>0){
              int i=q.peek();
                 if( freq[s.charAt(i)-'a']==1){
                    return i;
            }
            q.remove();
        }
        return -1;
    }
}