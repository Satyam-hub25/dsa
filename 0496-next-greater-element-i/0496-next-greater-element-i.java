class Solution {
    public int[] nextGreaterElement(int[] nums1, int[] nums2) {
      Stack<Integer> st=new Stack<>();
      int k=0;
      int ans[]=new int[nums1.length];
      HashMap<Integer,Integer> map=new HashMap<>();
      for(int i=0; i<nums2.length; i++){
        //check karo ky stack me kuch  hai aur for  ex 1 < 3 jais ahai condition
         while(!st.isEmpty() && st.peek()<nums2[i]){
            //agar hai to map me put karo pop krke 
            map.put(st.pop(),nums2[i]);
         }
         //st me bhi daalo onnlo grater one like 3 from(1 < 3)
            st.push(nums2[i]);
         }
         //aur agar  nahi hai to pop karo aur -1 karo uski value like 4 ke aage nahi hai greater so 4=-1;
         while(!st.isEmpty()){
         map.put(st.pop(),-1);
        }
        //ans array me nums1 ki value ko map se match karke put karte jao ans array index per
      for(int i=0; i<nums1.length; i++){
           ans[k++] =map.get(nums1[i]);
      }
      return ans;
    }
}